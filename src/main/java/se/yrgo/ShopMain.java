package se.yrgo;



public class ShopMain {

    // Main method to print out a product and test if classes work.
    public static void main(String[] args) {
        Product product1 = new Product("23", "Bolt", 23.99, 3);
        System.out.println(product1);
        System.out.println("Cost: " + product1.calculateCost());
    }
}
