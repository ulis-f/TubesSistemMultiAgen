/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro Vieri, Rieszky Delfiero, Yulius Famas
 */
package bookTrading.borrower;

import jade.core.*;
import jade.core.behaviours.*;
import jade.lang.acl.*;

import jade.domain.*;
import jade.domain.FIPAAgentManagement.*;

import java.util.Vector;

public class BookBorrowerAgent extends Agent {
    private Vector lenderAgents = new Vector();
    private BookBorrowerGui myGui;
    
    protected void setup() {
        System.out.println("Borrower-Agent "+getAID().getName()+" is ready.");
        Object[] args = getArguments();
        if(args != null && args.length > 0) {
            for(int i = 0; i < args.length; ++i) {
                AID seller = new AID((String) args[i], AID.ISLOCALNAME);
                lenderAgents.addElement(seller);
            }
        }
        
        myGui = new BookBorrowerGuiImpl();
        myGui.setAgent(this);  
        myGui.show();
        
        
        addBehaviour(new TickerBehaviour(this, 60000){
            protected void onTick() {
                DFAgentDescription template = new DFAgentDescription();
                ServiceDescription sd = new ServiceDescription();
                sd.setType("Book-lending");
                template.addServices(sd);
                try {
                    DFAgentDescription[] result = DFService.search(myAgent, template);
                    lenderAgents.clear();
                    for(int i = 0; i < result.length; ++i) {
                        lenderAgents.addElement(result[i].getName());
                    }
                }
                catch (FIPAException fe) {
                    fe.printStackTrace();
                }
            }
        });
    }
    
    protected void takeDown() {
        if(myGui != null) {
            myGui.dispose();
        }
        System.out.println("Borrower-agent "+getAID().getName()+" terminated.");
    }
    
    public void listAllBooks() {
        
    }
    
    // Fungsi untuk mencari majalah atau novel berdasarkan judul.
    public void searchBook(String title) {
        addBehaviour(new SearchManager(this, title));
    }
    
    // Fungsi untuk menambah buku yang dipilih ke dalam daftar pesanan.
    public void addToCart(String title, String bookType, int amount) {
        
    }
    
    // Fungsi untuk mengurangi buku yang ada dalam daftar pesanan.
    public void removeFromCart(String title, String bookType, int amount) {
        
    }
    
    private class SearchManager extends Behaviour {
        private String bookTitle;
        private AID lenderAgent;
        private int step = 0;
        
        
        private SearchManager(Agent a, String title) {
            super(null);
            bookTitle = title;
        }
        
        public void action() {
            
        }
        
        public boolean done() {
            return step == 4;
        }
    }
}
