package se.yrgo;

public class Product {
    private String productId;
    private String name;
    private double price;
    private int quantity;


    public Product(String productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateCost() {
        return price * quantity;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product\n" +
                "ID: " + productId + "\n" +
                "Name: " + name + "\n" +
                "Price: " + price +  "\n" +
                "Quantity: " + quantity;
    }
}
