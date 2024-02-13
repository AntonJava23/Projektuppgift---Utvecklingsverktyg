package se.yrgo;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();

    }

    public double calculateCost() {
        double cost = 0;
        for (Product product : products) {
            cost+=product.calculateCost();
        }

        return cost;
    }

    public void addProduct (Product p) {
        products.add(p);
    }

    public void removeProduct(String productId) {
        products.removeIf(product -> product.getProductId().equals(productId));
    }

    public Product getProduct(String productId) {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Product product : products) {
            builder.append(product);
        }
        return builder.toString();
    }
}
