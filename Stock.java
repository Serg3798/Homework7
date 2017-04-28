package homework7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

public class Stock implements Goods {

    private final int maxQuantityProductStock = 500;
    List<Product> stockProduct = new ArrayList<>();

    public Stock() {
        Product[] product = Product.values();
        int quantityTypeOfProduct = product.length;
        int val = new Random().nextInt(maxQuantityProductStock);
        for (int i = 0; i < val; i++) {
            stockProduct.add(product[new Random().nextInt(quantityTypeOfProduct)]);
        }
    }

    @Override
    public int totalCost(List<Product> x) {
        int totalCostGoodsStock = 0;
        for (int i = 0; i < x.size(); i++) {
            totalCostGoodsStock = totalCostGoodsStock + (x.get(i)).getPrice();
        }
        return totalCostGoodsStock;
    }

    public void sortProductStock(List<Product> x) {
        ToFile file = new ToFile();
        file.openFile();
        Collections.sort(x);
        for (int i = 0; i < x.size(); i++) {
            file.addRecord(i, x.get(i).getPrice(), x.get(i));
        }
        System.out.println();
        file.closeFile();
        JOptionPane.showMessageDialog(null, "Информацию об отсортированном товаре, имеющемся на складе, и его цене Вы можете посмотреть в файле: homework7.txt на диске С.");
    }
    
     public int getMaxQuantityProductStock() {
        return maxQuantityProductStock;
    }
}
