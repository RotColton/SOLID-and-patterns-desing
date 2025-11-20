package builder;

import lombok.Getter;
import steps.*;


@Getter
public class Menu {
    private String mainCourse;
    private String dessert;
    private String drink;
    private boolean vegan;
    private boolean glutenFree;
    private String coffee;
    private String starter;

    private Menu(){}

    public static class MenuBuilder implements MainCourse, DessertOption, DrinkOption, CoffeeOption, Starter{
        private final Menu menu;

        public MenuBuilder(){
            this.menu = new Menu();
        }

        public Starter withStarter(String starter) {
            menu.starter = starter;
            return this;
        }


        @Override
        public MainCourse withMainCourse(String mainCourse){
           menu.mainCourse = mainCourse;
            return this;
        }

        @Override
        public MainCourse withSuplement(String suplement) {
            return null;
        }

        @Override
        public DessertOption withDessert(String dessert) {
            menu.dessert = dessert;
            return this;
        }

        @Override
        public DrinkOption withDrink(String drink) {
            menu.drink = drink;
            return this;
        }

        @Override
        public CoffeeOption withCoffee(String coffee) {
            menu.coffee = coffee;
            return this;
        }

        @Override
        public Menu build() {
            return menu;
        }


        @Override
        public DietPreference isVegan() {
            menu.vegan = true;
            return this;
        }

        @Override
        public DietPreference isGlutenFree() {
            if(menu.mainCourse==null || menu.starter==null) throw new IllegalStateException("Cannot mark menu as gluten free before setting the main course or starter.");
            menu.glutenFree = true;
            return this;
        }
    }

}
