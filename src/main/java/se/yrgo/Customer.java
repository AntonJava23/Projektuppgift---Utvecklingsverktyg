package se.yrgo;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String name;
    private String email;

    private List<ShoppingCart> orderHistory;

    public Customer(int customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.orderHistory = new ArrayList<>();
    }

    public void placeOrder(ShoppingCart shoppingCart) {
        int orderCount = 1;
        ShoppingCart newOrder = new ShoppingCart();

        for (Product product : shoppingCart.getProducts()) {
            Product orderedProduct = new Product(product.getProductId(), product.getName(), product.getPrice(), product.getQuantity());
            newOrder.addProduct(orderedProduct);

        }

        orderHistory.add(newOrder);
        orderCount++;
    }

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



    @Override
    public String toString() {
        return "Customer ID: " + customerId +
                "\nName: " + name +
                "\nEmail: " + email;
    }
}