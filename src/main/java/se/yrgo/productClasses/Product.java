package se.yrgo.productClasses;

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

    public double calculateCost(double price, int quantity) {
        double cost;
        cost = price * quantity;
        return cost;
    }

}
