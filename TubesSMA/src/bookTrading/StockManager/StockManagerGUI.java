package bookTrading.StockManager;

public interface StockManagerGUI {
    void setAgent(StockManagerAgent a);
    void show();
    void hide();
    void notifyUser(String message);
    void dispose();
}   
