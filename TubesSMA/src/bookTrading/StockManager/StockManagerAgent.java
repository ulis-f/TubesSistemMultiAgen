package bookTrading.StockManager;

import jade.core.*;
import jade.core.behaviours.*;
import jade.lang.acl.*;

import jade.domain.*;
import jade.domain.FIPAAgentManagement.*;

import java.util.Vector;

public class StockManagerAgent extends Agent {
    


    // The GUI to interact with the admin
    private StockManagerGUI myGui;

    protected void setup() {
        // Printout a welcome message
        System.out.println("StockManager-Agent "+getAID().getName()+" is ready.");

        // Create and show the GUI
        myGui = new StockManagerGUIimpl();
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

}
