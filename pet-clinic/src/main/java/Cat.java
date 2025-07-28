import java.time.LocalDate;

public class Cat extends Pet{

    public Cat(String name, LocalDate birthday, PetParent parent) {
        super(name, birthday, parent);
    }

    @Override
    public void vaccinate() {
        if(!getBirthday().isAfter(LocalDate.now().plusDays(50)))
            throw new TooYoungToVaccinateException("This cat is less than 50 days old");

        setVaccinated(true);
    }
}
