package se.yrgo;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a shopping cart. It consists of a list of products
 * and its functions lets you calculate the total cost of the products,
 * add and remove a product, and return the content of the shopping cart.
 * */
public class ShoppingCart {

    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    /**
     * This method lets you calculate the total cost of the products
     * in the shopping cart
     * @return //the total cost
     * */
    public double calculateCost() {
        double cost = 0;
        for (Product product : products) {
            cost+=product.calculateCost();
        }

        return cost;
    }

    /**
     * This method lets you add a product to the shopping cart.
     * @param p //A Product object
     * */
    public void addProduct (Product p) {
        products.add(p);
    }

    /**
     * This method lets you remove a product from the shopping cart.
     * Throws IllegalArgumentException if the shopping cart doesn't contain the product of the specified id
     * @param productId //The id referring to the product you wish to remove.
     * */
    public void removeProduct(String productId) {
        if (!products.removeIf(product -> product.getProductId().equals(productId))) {
            throw new IllegalArgumentException("The shopping cart doesn't contain the referred product");
        }
    }


    /**
     * This method returns a product from the shopping cart.
     * @param productId //The id referring to the product you wish to receive
     * @return //the product you wish to receive, or null if the shopping cart
     * doesn't contain the specified product
     * */
    public Product getProduct(String productId) {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

    /**
     * @return //the list of the products that the shopping cart contains
     * */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * @return //the contents of the shopping cart as a string
     * */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Product product : products) {
            builder.append(product);
        }
        return builder.toString();
    }
}
