package homework7;

public enum Product {
    Fruit(7),
    Vegetables(5),
    Clothes(12),
    Appliances(24),
    Chemicals(10),
    Other(8);

    private final int price;

    Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}