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
public interface BookBorrowerGui {
    void setAgent(BookBorrowerAgent a);
    void show();
    void hide();
    void notifyUser(String message);

    public void dispose();
}
