import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    private static PerishableProduct perishableProduct;
    private static NonPerishableProduct nonPerishableProduct;
    private static LocalDate expiration;

    @BeforeAll
    static void initAll() {
        expiration = LocalDate.now().plusYears(7);
        perishableProduct = new PerishableProduct("Apple Juice", 1.5, 12, expiration);
        nonPerishableProduct = new NonPerishableProduct("Yerba Mate", 4.5, 5);
    }

    @Test
    void testCreatePerishableProduct_Success(){
        assertAll("perishableProduct",
                () -> assertEquals("Apple Juice", perishableProduct.getName()),
                () -> assertEquals(1.5, perishableProduct.getPrice()),
                () -> assertEquals(12, perishableProduct.getQuatity()),
                () -> assertEquals(expiration, perishableProduct.getExpirationDate())
        );
    }

    @Test
    void testPerishableProductIsExpired_False(){
        assertFalse(perishableProduct.isExpired());
    }

    @Test
    void testPerishableProductIsExpired_True(){
        assertFalse(new PerishableProduct("Manzanita", 0.8, 5, LocalDate.now().minusYears(2)).isExpired());
    }

    @Test
    void testCreteNonPerishableProduct_Success(){
        assertAll("nonPerishableProduct",
                () -> assertEquals("Yerba Mata", nonPerishableProduct.getName()),
                () -> assertEquals(4.5, nonPerishableProduct.getPrice()),
                () -> assertEquals(5, nonPerishableProduct.getQuatity())
        );
    }

    @Test
    void testApplyDiscountReturnsCorrectPriceAndPrintsMessage(){
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        float finalPrice =  nonPerishableProduct.applyDiscount(15, "summer discount");

        System.setOut(originalOut);

        assertEquals(4.05,finalPrice);
        assertEquals("summer discount", outContent.toString());
    }

}
