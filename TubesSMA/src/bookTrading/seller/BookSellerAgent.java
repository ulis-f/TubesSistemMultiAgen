/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookTrading.seller;

import jade.core.Agent;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import jade.domain.*;
import jade.domain.FIPAAgentManagement.*;  

import java.util.*;

public class BookSellerAgent extends Agent {
    // The catalogue of books available for sale
    private Map catalogue = new HashMap();

    // The GUI to interact with the user
    private BookSellerGui myGui;

    /**
     * Agent initializations
    **/
    protected void setup() {
        // Printout a welcome message
        System.out.println("Seller-agent "+getAID().getName()+" is ready.");

        // Create and show the GUI
        myGui = (BookSellerGui) new BookSellerGuiImpl();   
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


    private class CallForOfferServer extends CyclicBehaviour {
        private MessageTemplate mt = MessageTemplate.MatchPerformative(ACLMessage.CFP);

        public void action() {
            ACLMessage msg = myAgent.receive(mt);
            if (msg != null) {
                // CFP Message received. Process it
                String title = msg.getContent();
                myGui.notifyUser("Received Proposal to buy "+title);
                ACLMessage reply = msg.createReply();
          
                reply.setPerformative(ACLMessage.PROPOSE);
                    
                myAgent.send(reply);
                myGui.notifyUser("Sent Proposal to sell at "+reply.getContent());
            }
            else{      
                block();
            }
        }
    } 
}