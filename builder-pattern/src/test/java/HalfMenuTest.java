import builder.Menu;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HalfMenuTest {

    public static final String RISOTTO_DE_BOLETS = "Risotto de bolets";
    public static final String ESPRESSO = "Espresso";
    public static final String AIGUA = "Aigua";
    public static final String PLATANITO = "Platanito";

    @Test
    void whenBuildHalMenuVeganOptionWithCoffee_thenItCreateSuccessfully(){
        Menu halfMenu = new Menu.MenuBuilder()
                .withMainCourse(RISOTTO_DE_BOLETS)
                .isVegan()
                .withCoffee(ESPRESSO)
                .withDrink(AIGUA)
                .build();

        assertAll(
                () -> assertEquals(RISOTTO_DE_BOLETS, halfMenu.getMainCourse()),
                () -> assertTrue(halfMenu.isVegan()),
                () -> assertEquals(ESPRESSO, halfMenu.getCoffee()),
                () -> assertEquals(AIGUA, halfMenu.getDrink())
        );
    }

    @Test
    void whenBuildHalMenuVeganOptionWithDessert_thenItCreateSuccessfully(){
        Menu halfMenu = new Menu.MenuBuilder()
                .withMainCourse(RISOTTO_DE_BOLETS)
                .isVegan()
                .withDessert(PLATANITO)
                .withDrink(AIGUA)
                .build();

        assertAll(
                () -> assertEquals(RISOTTO_DE_BOLETS, halfMenu.getMainCourse()),
                () -> assertTrue(halfMenu.isVegan()),
                () -> assertEquals(PLATANITO, halfMenu.getDessert()),
                () -> assertEquals(AIGUA, halfMenu.getDrink())
        );
    }

    @Test
    void whenBuildHalMenuVeganOptionWithoutDessertAndCoffee_thenItCreateSuccessfully(){
        Menu halfMenu = new Menu.MenuBuilder()
                .withMainCourse(RISOTTO_DE_BOLETS)
                .isVegan()
                .withDrink(AIGUA)
                .build();

        assertAll(
                () -> assertEquals(RISOTTO_DE_BOLETS, halfMenu.getMainCourse()),
                () -> assertTrue(halfMenu.isVegan()),
                () -> assertEquals(AIGUA, halfMenu.getDrink())
        );
    }

    @Test
    void whenBuildHalMenuVeganAndGlutenFreeOptionsWithCoffee_thenItCreateSuccessfully(){
        Menu halfMenu = new Menu.MenuBuilder()
                .withMainCourse(RISOTTO_DE_BOLETS)
                .isVegan()
                .isGlutenFree()
                .withCoffee(ESPRESSO)
                .build();

        assertAll(
                () -> assertEquals(RISOTTO_DE_BOLETS, halfMenu.getMainCourse()),
                () -> assertTrue(halfMenu.isVegan()),
                () -> assertTrue(halfMenu.isGlutenFree()),
                () -> assertEquals(ESPRESSO, halfMenu.getCoffee())

        );
    }

    @Test
    void whenBuildHalMenuOnlyWithMainCourse_thenItCreateSuccessfully(){
        Menu halfMenu = new Menu.MenuBuilder()
                .withMainCourse(RISOTTO_DE_BOLETS)
                .build();

        assertEquals(RISOTTO_DE_BOLETS, halfMenu.getMainCourse());

    }

    @Test
    void whenBuildHalMenuWithoutCourseAndGlutenFreeOption_thenThrowsIllegalStateException(){

        Exception ex = assertThrows(IllegalStateException.class, () ->{
                new Menu.MenuBuilder()
                .isGlutenFree()
                .build();
        });

        String actualMessage  = "Cannot mark menu as gluten free before setting the main course or starter.";
        assertTrue(actualMessage.contains(ex.getMessage()));

    }

}
