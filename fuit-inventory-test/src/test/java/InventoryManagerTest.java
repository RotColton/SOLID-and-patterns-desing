import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryManagerTest {

    static Set<Product> inventory;
    static InventoryManager manager;

    @BeforeAll
    static void initAll() {
       inventory =  new HashSet<Product>(Arrays.asList(
                new PersihableProducto("Apple Juice", 1.5, 12, LocalDate.now().plusMonths(1)),
                new PersihableProduct("Finger Snack", 1.8, 56, LocalDate.now().plusMonths(3)),
                new NonPerishableProduct("Yerba Mate", 4.5, 1),
                new PersihableProduct("Pepper Ice Cream", 5.8, 35, LocalDate.now().plusMonths(4)))
        );
        manager = new InventoryManager(inventory);
    }

    @Test
    void testFindByName(){
        assertTrue("Apple Juice", inventory.findByName("Apple Juice").getName());
    }

    @Test
    void testFindByNameIgnoreCase(){
        assertTrue("APPLE JUICE", inventory.findByName("Apple Juice").getName());
    }

    @Test
    void testFindByNameNotFound(){
        assertThrows(ProductNotFoundException.class, () -> manager.findByName("banana"));
    }

    @Test
    void testAddNewProduct(){
        Product patatita = new PersihableProduct("Patatita", 2.5, 9, LocalDate.now().plusYears(8));

        assertEquals("Patatita", manager.findByName("Patatita").getName());
        assertEquals(5, manager.getInventory().getSize());
    }

    @Test
    void testAddExistsProduct(){
        Product finger = new PersihableProduct("Finger Snack", 1, 8, 56, LocalDate.now().plusMonths(3)),
        assertThrows(DuplicateProductException.class, () -> manager.addProduct(finger));
    }

    @Test
    void testGetLowStockProducts() {
        List<Product> lowStock = manager.getLowStockProducts(5);
        assertEquals(1, lowStock.size());
        assertEquals("Yerba Mate", lowStock.get(0).getName());
    }

    @Test
    void testGetTotalInventoryValue(){
        assertEquals(326.3, manager.getTotalInventoryValue());
    }


}

