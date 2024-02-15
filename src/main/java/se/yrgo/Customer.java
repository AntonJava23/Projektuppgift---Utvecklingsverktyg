package se.yrgo;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a Customer. It consists of a customer ID, customer name
 * and customer email.
 * The class' functions lets you place an order and view order history.
 * */
public class Customer {
    private int customerId;
    private String name;
    private String email;
    private List<ShoppingCart> orderHistory;
    /**
     *
     * @param customerId identifier for the customer
     * @param name name of the customer
     * @param email email address of the customer
     */
    public Customer(int customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.orderHistory = new ArrayList<>();
    }
    /**
     * places an order using the shopping cart
     * creates a new order with the products in the shopping cart and adds it to the order history
     *
     * @param shoppingCart the shopping cart with products to be ordered
     */
    public void placeOrder(ShoppingCart shoppingCart) {
        ShoppingCart newOrder = new ShoppingCart();

        for (Product product : shoppingCart.getProducts()) {
            Product orderedProduct = new Product(product.getProductId(), product.getName(), product.getPrice(), product.getQuantity());
            newOrder.addProduct(orderedProduct);

        }

        orderHistory.add(newOrder);
    }
    /**
     * prints a formatted string representing the order history of the customer
     * it includes customer info, product info and total cost.
     */
    public String viewOrderHistory() {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < orderHistory.size(); i++) {
            builder.append("Order ").append(i + 1).append("  Customer: ").append(name).append
                    (" Id: ").append(customerId).append(" Email: ").append(email).append("\n");
            builder.append(orderHistory.get(i));
            builder.append("Total Cost: ").append(orderHistory.get(i).calculateCost()).append("\n\n");
        }
        System.out.println(builder.toString());


        return builder.toString();
    }

    public List<ShoppingCart> getOrderHistory() {
        return orderHistory;
    }

}