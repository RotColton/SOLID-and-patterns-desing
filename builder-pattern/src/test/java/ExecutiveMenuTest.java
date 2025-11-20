import builder.Menu;
import org.junit.jupiter.api.Test;

import java.lang.management.MemoryUsage;

import static org.junit.jupiter.api.Assertions.*;

public class ExecutiveMenuTest {
    public static final String AMANIDA_MEDITERRANIA = "Amanida Mediterrània";
    public static final String FILET_DE_VEDELLA = "Filet de Vedella";
    public static final String GUARNICIO_EXTRA = "Guarnició extra";
    public static final String MOUSSE_DE_XOCOLATA = "Mousse de xocolata";
    public static final String DRINK = "Vi Negre";


    @Test
    void whenBuildExecutiveMenuFullOptions_thenItsCreatedSuccessfully(){
        builder.Menu executiveMenu = new builder.Menu.MenuBuilder()
                .withStarter(ExecutiveMenuTest.AMANIDA_MEDITERRANIA)
                .isVegan()
                .isGlutenFree()
                .withMainCourse(FILET_DE_VEDELLA)
                .withSuplement(GUARNICIO_EXTRA)
                .withDessert(MOUSSE_DE_XOCOLATA)
                .withDrink(DRINK)
                .build();

        assertAll(
                () -> assertEquals(AMANIDA_MEDITERRANIA, executiveMenu.getStarter()),
                () -> assertTrue(executiveMenu.isVegan()),
                () -> assertTrue(executiveMenu.isGlutenFree()),
                () -> assertEquals(FILET_DE_VEDELLA, executiveMenu.getMainCourse()),
                () -> assertEquals(MOUSSE_DE_XOCOLATA, executiveMenu.getDessert()),
                () -> assertEquals(DRINK, executiveMenu.getDrink())
        );

    }

    @Test
    void whenBuildExecutiveMOnlyWithStarter_thenItsCreatedSuccessfully(){
        Menu executiveMenu = new Menu.MenuBuilder()
                .withStarter(AMANIDA_MEDITERRANIA)
                .build();

        assertEquals(AMANIDA_MEDITERRANIA, executiveMenu.getStarter());

    }

    @Test
    void whenBuildExecutiveMenuWithStarterAndMainCourse_thenItsCreatedSuccessfully(){
        Menu executiveMenu = new Menu.MenuBuilder()
                .withStarter(AMANIDA_MEDITERRANIA)
                .withMainCourse(FILET_DE_VEDELLA)
                .build();

        assertAll(
                () ->  assertEquals(AMANIDA_MEDITERRANIA, executiveMenu.getStarter()),
                () -> assertEquals(FILET_DE_VEDELLA, executiveMenu.getMainCourse())
        );

    }

    @Test
    void whenAddMoreMainCourse_thenThrowIllegalStateException(){
        Exception ex = assertThrows(IllegalStateException.class, () ->{
            new Menu.MenuBuilder()
                    .withMainCourse(FILET_DE_VEDELLA)
                    .withMainCourse(AMANIDA_MEDITERRANIA)
                    .build();
        });

        String actualMessage  = "The menu already has a main course";
        assertTrue(actualMessage.contains(ex.getMessage()));
    }

}
