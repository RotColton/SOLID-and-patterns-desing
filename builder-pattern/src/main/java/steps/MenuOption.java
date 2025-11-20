package steps;

public interface MenuOption extends LastStep{
    DessertOption withDessert(String dessert);
    DrinkOption withDrink(String dessert);
    CoffeeOption withCoffee(String coffee);
}
