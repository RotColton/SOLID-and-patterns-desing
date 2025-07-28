import java.time.LocalDate;

public abstract class Pet {
    private String name;
    private final LocalDate birthday;
    private PetParent parent;
    private boolean isVaccinated;

    public Pet(String name, LocalDate birthday, PetParent parent) {
        this.name = name;
        this.birthday = birthday;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() { return this.birthday; }

    public PetParent getPetParent(){ return this.parent; }

    public abstract void vaccinate();

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

}