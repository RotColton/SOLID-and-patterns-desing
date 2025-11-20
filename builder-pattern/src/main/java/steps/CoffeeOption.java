package steps;

import builder.Menu;

public interface CoffeeOption extends LastStep{
    DrinkOption withDrink(String drink);
}
