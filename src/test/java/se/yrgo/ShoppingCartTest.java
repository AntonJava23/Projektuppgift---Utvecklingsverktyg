package se.yrgo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    ShoppingCart cart;
    Product product;

    public ShoppingCartTest() {
        cart = new ShoppingCart();
        product = new Product("", "", 1, 1);
        cart.addProduct(product);
    }

    @Test
    public void testAddProduct() {
        assertEquals(product, cart.getProduct(product.getProductId()));
    }

    @Test
    public void testRemoveProduct() {
        assertThrows(IllegalArgumentException.class, () -> {
            cart.removeProduct("Non existing productId");
        });
        cart.removeProduct(product.getProductId());
        assertNull(cart.getProduct(product.getProductId()));
    }

    @Test
    public void testCalculateCost() {
        cart.addProduct(product);
        assertEquals(2, cart.calculateCost());
    }

    @Test
    public void testSeeCartContent () {
        String expectedString = "Product\n" +
                "ID: \n" +
                "Name: \n" +
                "Price: 1.0\n" +
                "Quantity: 1\n";
        assertEquals(expectedString, cart.toString());
    }
}
