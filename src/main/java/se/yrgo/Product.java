package se.yrgo;
/*Class representing a product*/
public class Product {
    private String productId;
    private String name;
    private double price;
    private int quantity;


    /**
     *
     * @param productId // The ID of the product
     * @param name // The products name
     * @param price // The price of the product
     * @param quantity // The quantity of the product
     */
    public Product(String productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /*Method for calculating the cost of a product*/
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
                "Quantity: " + quantity + "\n";
    }
}
