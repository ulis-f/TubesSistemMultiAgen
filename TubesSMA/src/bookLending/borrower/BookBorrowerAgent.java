/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro
 */
package bookLending.borrower;

import jade.core.*;
import jade.core.behaviours.*;
import jade.lang.acl.*;

import jade.domain.*;
import jade.domain.FIPAAgentManagement.*;

import java.util.Vector;

public class BookBorrowerAgent {
    private Vector lenderAgents = new Vector();
    
    protected void setup() {
        System.out.println("Borrower-Agent "+" is ready.");
        
    }
    
    // Fungsi untuk mencari majalah atau novel berdasarkan judul.
    public void searchBook(String title) {
        
    }
    
    // Fungsi untuk menambah buku yang dipilih ke dalam daftar pesanan.
    public void addToCart(String title, String bookType, int amount) {
        
    }
    
    // Fungsi untuk mengurangi buku yang ada dalam daftar pesanan.
    public void removeFromCart(String title, String bookType, int amount) {
        
    }
}
