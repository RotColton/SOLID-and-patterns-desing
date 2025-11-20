import builder.Menu;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExecutiveMenuTest {
    public static final String AMANIDA_MEDITERRANIA = "Amanida Mediterrània";
    public static final String FILET_DE_VEDELLA = "Filet de Vedella";

/*
    @Test
    void whenBuildExecutiveMenuFullOptions_thenItsCreatedSuccessfully(){
        builder.Menu executiveMenu = new builder.Menu.MenuBuilder()
                .withStarter("Amanida Mediterrània")
                .isVegan()
                .isGlutenFree()
                .withMainCourse("Filet de Vedella")
                .withSuplement("Guarnició extra")
                .withDessert("Mousse de xocolata")
                .withDrink("Vi Negre")
                .build();

    }*/

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

}
