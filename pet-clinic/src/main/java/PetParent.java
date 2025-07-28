public class PetParent {
    private final String DNI;
    private String name;
    private int phoneNumber;


    PetParent(String dni, String name, int phoneNumber){
        this.DNI = dni;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getDNI() {
        return DNI;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
