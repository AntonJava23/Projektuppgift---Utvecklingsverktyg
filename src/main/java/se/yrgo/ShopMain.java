package se.yrgo;


/**
 * This class creates customers, products and shopping carts.
 * It tests to see if carts adds the desired products, if its contents are seen,
 * and if you can follow an order history with different orders.
 * */
public class ShopMain {

    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Nahid", "nahid@gmail.com");
        Customer c2 = new Customer(2, "Hampus", "Hampus@gmail.com");

        Product product1 = new Product("23", "Bolt", 23.99, 3);
        Product product2 = new Product("24", "Uber", 23.99, 3);

        ShoppingCart cart = new ShoppingCart();
        ShoppingCart cart2 = new ShoppingCart();
        ShoppingCart cart3 = new ShoppingCart();

        cart.addProduct(product1);
        cart.addProduct(product2);
        cart2.addProduct(product1);
        //Nahid places an order
        c1.placeOrder(cart);
        c1.viewOrderHistory();
        //Hampus places an order
        c2.placeOrder(cart2);
        c2.viewOrderHistory();
        //Nahid places her second order
        cart3.addProduct(product2);
        c1.placeOrder(cart3);
        c1.viewOrderHistory();
    }
}
