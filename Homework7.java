package homework7;

public class Homework7 {

    public static void main(String[] args) {

        Stock stock = new Stock();
        Dealer dealer = new Dealer();
        dealer.getRevenueProduct(Product.Vegetables);
        dealer.getAmountOfAssets();
        stock.sortProductStock(dealer.stockDealer);
    }
}
