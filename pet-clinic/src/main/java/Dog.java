import java.time.LocalDate;

public class Dog extends Pet implements Training{

    public Dog(String name, LocalDate birthday, PetParent parent) {
        super(name, birthday, parent);
    }

    @Override
    public void vaccinate() {
        if(!getBirthday().isAfter(LocalDate.now().plusDays(40)))
            throw new TooYoungToVaccinateException("This dog is less than 40 days old");

        setVaccinated(true);
    }

    @Override
    public void train(TrainingType trainingType) {
        System.out.println(getName() + " is training " + trainingType);
    }
}
