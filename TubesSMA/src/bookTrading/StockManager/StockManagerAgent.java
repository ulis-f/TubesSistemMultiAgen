/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookTrading.stockManager;

import jade.core.Agent;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import jade.domain.*;
import jade.domain.FIPAAgentManagement.*;

import java.util.*;

public class StockManagerAgent extends Agent {
    // The catalogue of books available for sale
    private Map catalogue = new HashMap();

    // The GUI to interact with the user
    private StockManagerGui myGui;

    /**
     * Agent initializations
    **/
    protected void setup() {
        // Printout a welcome message
        System.out.println("Seller-agent "+getAID().getName()+" is ready.");

        // Create and show the GUI
        myGui = new StockManegerGuiImpl();
        myGui.setAgent(this);
        myGui.show();

        // Add the behaviour serving calls for price from buyer agents
        addBehaviour(new CallForOfferServer());

        // Add the behaviour serving purchase requests from buyer agents
        // addBehaviour(new PurchaseOrderServer());
        // Register the book-selling service in the yellow pages
        DFAgentDescription dfd = new DFAgentDescription();
        dfd.setName(getAID());
        ServiceDescription sd = new ServiceDescription();
        sd.setType("Book-selling");
        sd.setName(getLocalName()+"-Book-selling");
        dfd.addServices(sd);
        try {
            DFService.register(this, dfd);
        }
        catch (FIPAException fe) {
            fe.printStackTrace();
        }
    }

    /**
     * Agent clean-up
    **/
    protected void takeDown() {
        // Dispose the GUI if it is there
        if (myGui != null) {
            myGui.dispose();
        }

        // Printout a dismissal message
        System.out.println("Seller-agent "+getAID().getName()+"terminating.");

        // Deregister from the yellow pages
        try {
            DFService.deregister(this);
        }
        catch (FIPAException fe) {
            fe.printStackTrace();
        }
    }

    /**
     * This method is called by the GUI when the user inserts a new
     * book for sale
     * @param title The title of the book for sale
     * @param initialPrice The initial price
     * @param minPrice The minimum price
     * @param deadline The deadline by which to sell the book
    **/
    public void putForSale(String title, int initPrice, int minPrice, Date deadline) {
        addBehaviour(new PriceManager(this, title, initPrice, minPrice, deadline));
    }

    private class PriceManager extends TickerBehaviour {
        private String title;
        private int minPrice, currentPrice, initPrice, deltaP;
        private long initTime, deadline, deltaT;

        private PriceManager(Agent a, String t, int ip, int mp, Date d) {
            super(a, 60000); // tick every minute
            title = t;
            initPrice = ip;
            currentPrice = initPrice;
            deltaP = initPrice - mp;
            deadline = d.getTime();
            initTime = System.currentTimeMillis();
            deltaT = ((deadline - initTime) > 0 ? (deadline - initTime) : 60000);
        }

        public void onStart() {
            // Insert the book in the catalogue of books available for sale
            catalogue.put(title, this);
            super.onStart();
        }

        public void onTick() {
            long currentTime = System.currentTimeMillis();
            if (currentTime > deadline) {
                // Deadline expired
                myGui.notifyUser("Cannot sell book "+title);
                catalogue.remove(title);
                stop();
            }
            else {
                // Compute the current price
                long elapsedTime = currentTime - initTime;
                currentPrice = (int)Math.round(initPrice - 1.0 * deltaP * (1.0 * elapsedTime / deltaT));
            }
        }

        public int getCurrentPrice() {
            return currentPrice;
        }
    }

    private class CallForOfferServer extends CyclicBehaviour {
        private MessageTemplate mt = MessageTemplate.MatchPerformative(ACLMessage.CFP);

        public void action() {
            ACLMessage msg = myAgent.receive(mt);
            if (msg != null) {
                // CFP Message received. Process it
                String title = msg.getContent();
                myGui.notifyUser("Received Proposal to buy "+title);
                ACLMessage reply = msg.createReply();
                PriceManager pm = (PriceManager) catalogue.get(title);
                if (pm != null) {
                    // The requested book is available for sale. Reply with the price
                    reply.setPerformative(ACLMessage.PROPOSE);
                    reply.setContent(String.valueOf(pm.getCurrentPrice()));
                }
                else {
                    // The requested book is NOT available for sale.
                    reply.setPerformative(ACLMessage.REFUSE);
                }
                myAgent.send(reply);
                myGui.notifyUser(pm != null ? "Sent Proposal to sell at "+reply.getContent() : "Refused Proposal as the book is not for sale");
            }
            else{
                block();
            }
        }
    } 
}