package homework7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Dealer {

    private final int maxQuantityInvoiceDealer = 20;
    List<Invoice> invoicesDealer = new ArrayList<>();
    List<Product> stockDealer = new ArrayList<>();

    public Dealer() {
        int val = new Random().nextInt(maxQuantityInvoiceDealer);
        System.out.println("Количество чеков у торговца равно: " + val);
        for (int i = 0; i < val; i++) {
            invoicesDealer.add(new Invoice());
        }
        Product[] product = Product.values();
        int quantityTypeOfProduct = product.length;
        Stock stock = new Stock();
        val = new Random().nextInt(stock.getMaxQuantityProductStock());
        for (int i = 0; i < val; i++) {
            stockDealer.add(product[new Random().nextInt(quantityTypeOfProduct)]);
        }
    }

    public void getRevenueProduct(Product x) {
        int sum = 0;
        for (int i = 0; i < invoicesDealer.size(); i++) {
            int count = Collections.frequency(invoicesDealer.get(i).invoiceProduct, x);
            sum = sum + count;
        }
        System.out.println("Общая стоимость товара вида " + x + " во всех чеках у торговца равна: " + (sum * (x.getPrice())));
    }

    public void getAmountOfAssets() {
        int sum1 = 0;
        Invoice invoice = new Invoice();
        Stock stock = new Stock();
        int sum2 = stock.totalCost(stockDealer);
        System.out.println("Cтоимость товара на складе равна: " + sum2);
        for (int i = 0; i < invoicesDealer.size(); i++) {
            sum1 = sum1 + invoice.totalCost(invoicesDealer.get(i).invoiceProduct);
        }
        System.out.println("Общая стоимость товара в чеках равна: " + sum1);
        System.out.println("Cтоимость активов торговца равна: " + (sum1 + sum2));
    }
}
