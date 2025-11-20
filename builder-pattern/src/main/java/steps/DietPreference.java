package steps;

public interface DietPreference extends MenuOption {
    DietPreference isVegan();
    DietPreference isGlutenFree();
    MainCourse withMainCourse(String mainCourse);

}
