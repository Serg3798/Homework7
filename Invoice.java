package homework7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Invoice implements Goods {

    private final int maxQuantityProductInvoice = 100;
    List<Product> invoiceProduct = new ArrayList<>();

    public Invoice() {
        Product[] product = Product.values();
        int quantityTypeOfProduct = product.length;
        int val = new Random().nextInt(maxQuantityProductInvoice);
        if (val == 0) {
            val = 1;
        }
        for (int i = 0; i < val; i++) {
            invoiceProduct.add(product[new Random().nextInt(quantityTypeOfProduct)]);
        }
    }

    @Override
    public int totalCost(List<Product> x) {
        int totalCostGoodsInvoice = 0;
        for (int i = 0; i < x.size(); i++) {
            totalCostGoodsInvoice = totalCostGoodsInvoice + ((Product) x.get(i)).getPrice();
        }
        return totalCostGoodsInvoice;
    }
}
