package se.yrgo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CustomerTest {
    Customer test = new Customer(1, "test", "test@ing.se");
    Product testP = new Product("1", "testis", 1.50, 2);
    ShoppingCart testS = new ShoppingCart();

    @Test
    public void testPlaceAnOrder() {
        testS.addProduct(testP);
        test.placeOrder(testS);
        assertEquals(1, test.getOrderHistory().size());
    }

    @Test
    public void testViewOrderHistory() {
        testS.addProduct(testP);
        test.placeOrder(testS);
        String voh = test.viewOrderHistory();

        String expected = """
                Order 1  Customer: test Id: 1 Email: test@ing.se
                Product
                ID: 1
                Name: testis
                Price: 1.5
                Quantity: 2
                Total Cost: 3.0

                """;

        assertEquals(expected, voh);
    }
}
