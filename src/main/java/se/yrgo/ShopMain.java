package se.yrgo;



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
        //nahid lägger en order
        c1.placeOrder(cart);
        c1.viewOrderHistory();
        //hampus lägger en order
        c2.placeOrder(cart2);
        c2.viewOrderHistory();
        //nahid lägger sin andra order
        cart3.addProduct(product2);
        c1.placeOrder(cart3);
        c1.viewOrderHistory();

    }


}
