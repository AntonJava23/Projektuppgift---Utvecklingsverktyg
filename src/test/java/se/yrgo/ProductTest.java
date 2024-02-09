package se.yrgo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    void testCalculateCostWithPositiveValues() {
        Product p1 = new Product("23", "Bolts", 23.99, 3);
        double result = p1.calculateCost();
        assertEquals(71.97, result);
    }

    @Test
    void testCalculateCostWithZeroPrice() {
        Product p1 = new Product("23", "Bolts", 0, 3);
        double result = p1.calculateCost();
        assertEquals(0, result);
    }

    @Test
    void testCalculateCostWithZeroQuantity() {
        Product p1 = new Product("23", "Bolts", 23.99, 0);
        double result = p1.calculateCost();
        assertEquals(0, result);
    }

    @Test
    void testCalculateCostWithZeroPriceAndZeroQuantity() {
        Product p1 = new Product("23", "Bolts", 0, 0);
        double result = p1.calculateCost();
        assertEquals(0, result);
    }
}
