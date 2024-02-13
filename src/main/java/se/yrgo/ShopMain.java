package se.yrgo;

import java.io.PrintStream;

public class ShopMain {

    public static void main(String[] args) {
        Product product1 = new Product("23", "Bolt", 23.99, 3);
        Product product2 = new Product("24", "Uber", 23.99, 3);
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        System.out.println(product1);
        System.out.println("Cost: " + product1.calculateCost() + "\n");
        System.out.println(cart);
        System.out.println("Cost: " + cart.calculateCost());

    }
}
