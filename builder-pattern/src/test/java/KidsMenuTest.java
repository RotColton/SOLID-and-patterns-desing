import builder.Menu;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KidsMenuTest {

    public static final String SUC_DE_TARONJA = "Suc de taronja";
    public static final String GELAT_DE_VAINILLA = "Gelat de Vainilla";
    public static final String MACARRONS_AMB_TOMAQUET = "Macarrons amb tomàquet";


    @Test
    void whenBuildKidsMenuFullOptions_thenItCreateSuccessfully(){
        Menu kidsMenu = new Menu.MenuBuilder()
                .withMainCourse(MACARRONS_AMB_TOMAQUET)
                .withDessert(GELAT_DE_VAINILLA)
                .withDrink(SUC_DE_TARONJA)
                .build();

        assertAll(
                () -> assertEquals(MACARRONS_AMB_TOMAQUET, kidsMenu.getMainCourse()),
                () -> assertEquals(GELAT_DE_VAINILLA, kidsMenu.getDessert()),
                () ->assertEquals(SUC_DE_TARONJA, kidsMenu.getDrink())

        );

    }

    @Test
    void whenBuildKidsMenuWithoutDrink_thenItCreateSuccessfully(){
        Menu kidsMenu = new Menu.MenuBuilder()
                .withMainCourse(MACARRONS_AMB_TOMAQUET)
                .withDessert(GELAT_DE_VAINILLA)
                .build();

        assertAll(
                () -> assertEquals(MACARRONS_AMB_TOMAQUET, kidsMenu.getMainCourse()),
                () -> assertEquals(GELAT_DE_VAINILLA, kidsMenu.getDessert())

        );

    }
    @Test
    void whenBuildKidsMenuWithoutDessert_thenItCreateSuccessfully(){
        Menu kidsMenu = new Menu.MenuBuilder()
                .withMainCourse(MACARRONS_AMB_TOMAQUET)
                .withDrink(SUC_DE_TARONJA)
                .build();

        assertAll(
                () -> assertEquals(MACARRONS_AMB_TOMAQUET, kidsMenu.getMainCourse()),
                () ->assertEquals(SUC_DE_TARONJA, kidsMenu.getDrink())

        );

    }

    @Test
    void whenBuildKidsMenuWithoutDessertAndDrink_thenItCreateSuccessfully(){
        Menu kidsMenu = new Menu.MenuBuilder()
                .withMainCourse(MACARRONS_AMB_TOMAQUET)
                .build();

      assertEquals(MACARRONS_AMB_TOMAQUET, kidsMenu.getMainCourse());

    }


}
