## 🧱 Builder Pattern

### 📘 What is it?

The **Builder** design pattern is a **creational pattern** that helps us **construct complex objects step by step**, separating the construction of the object from its representation.  
In other words, it **simplifies the creation of objects with many parameters**, some of them optional or with default values, without cluttering client code with long constructors or messy configuration.

### 🛠️ Usefulness

The Builder pattern is useful when:

- 🧱 The object to **build** has many optional attributes or possible configurations.
- 🧩 You need to keep the **construction clear, readable, and extensible**.
- 🚫 You want to **avoid overly long constructors** that are hard to read.

### 🎯 Purpose

- 🏚️ Makes the creation process more readable and maintainable.
- ⛓️ Avoids the telescoping constructor antipattern (those constructors with 5, 6, or 7 parameters that nobody understands).
- 🌊 Helps produce clearer, more expressive code, especially when combined with a Fluent approach.

>There are different ways to implement the Builder. In this exercise, you will use the Fluent Builder, which allows chaining calls smoothly.  
Example:

```java
Car car = new CarBuilder()
        .withModel("Sedan Premium")
        .withEngine("Hybrid", 180)
        .withColor("Metallic Black")
        .withInterior("Leather")
        .withNavigationSystem()
        .withDriverAssistance()
        .withSportPackage()
        .build();
```
## 🧠 Exercise
> Implementation of the Builder pattern for a restaurant menu.

### 🏆 Objective

Design and implement a system to build different types of restaurant menus using the **Fluent Builder** design pattern and following SOLID principles.  
Additionally, the **progressive interface** concept must be used, which consists of progressively limiting the user’s available options during the construction process, ensuring that **the steps are performed in the correct order and that dependencies between steps are respected**.  
For example, desserts cannot be added before the main course, nor can the dessert method be called more than once.

### 📝 Description

🍜 **Menus may include:**

- Starter
- Main Course
- Dessert
- Drink

---

🍽️ **These may have specific characteristics:**

1. Any dish may be **Vegan** and/or **Gluten-Free**.
2. The **main course** may include a **supplement** (e.g., extra side dish).
3. Customers may order a half menu, which includes only a main course and a drink.
4. The kids’ menu includes only a main course, a drink, and a dessert.
5. Menus may come without a drink.
6. Desserts are optional in all menus and may be either a dessert or a coffee.

---

### ✅ Requirements

1. Model a **flexible system** to build menus step by step, without depending on concrete classes, guaranteeing the **correct and mandatory order** during menu construction.  
   For example, desserts cannot be added before the main course.

2. Implement a restriction: if a dessert is chosen, coffee cannot be added, and vice versa. This rule must be enforced through **interface design**.

3. Allow configuration of dish properties (vegan, gluten-free, supplement) using fluent and expressive methods, avoiding boolean parameters.

4. Implement unit tests showing the creation of various menus.

### 💻 Expected usage example:

````java
Menu executiveMenu = new MenuBuilder()
.withStarter("Mediterranean Salad")
.isVegan()
.isGlutenFree()
.withMainCourse("Beef Steak")
.withSuplement("Extra side dish")
.withDessert("Chocolate Mousse")
.withDrink("Red Wine")
.build();

Menu kidsMenu = new MenuBuilder()
.withMainCourse("Macaroni with tomato sauce")
.withDessert("Vanilla Ice Cream")
.withDrink("Orange Juice")
.build();

Menu halfMenu = new MenuBuilder()
.withMainCourse("Mushroom Risotto")
.isVegan()
.withCoffee("Espresso")
.withDrink("Water")
.build();

```
