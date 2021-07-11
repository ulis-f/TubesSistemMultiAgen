package bookTrading.StockManager;

public interface StockManagerGui {
    void setAgent(StockManagerAgent a);
    void show();
    void hide();
    void notifyUser(String message);
    void dispose();
}   
  