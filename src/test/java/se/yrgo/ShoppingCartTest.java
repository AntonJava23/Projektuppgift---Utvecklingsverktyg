package se.yrgo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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
        cart.removeProduct(product.getProductId());
        assertNull(cart.getProduct(product.getProductId()));
    }

    @Test
    public void testCalculateCost() {
        cart.addProduct(product);
        assertEquals(2, cart.calculateCost());
    }

}
