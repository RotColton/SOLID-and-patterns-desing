import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PetTest {

    private PetParent pepito;
    private Cat michi;
    private LocalDate birthday;
    private Dog peito;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void init(){
        birthday = LocalDate.now();
        pepito = new PetParent("L-56738", "Pepito", 693657495);
        michi = new Cat("Minino", birthday, pepito);
        peito = new Dog("Negrito", LocalDate.now().minusYears(1), pepito);

        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void registreNewPet_Success(){
        assertAll("pet",
                () -> assertEquals("Minino", michi.getName()),
                () -> assertEquals(birthday, michi.getBirthday()),
                () -> assertEquals("Pepito", michi.getPetParent().getName()),
                () -> assertEquals("L-56738", michi.getPetParent().getDNI()),
                () -> assertEquals(693657495, michi.getPetParent().getPhoneNumber())
        );
    }

    @Test
    public void isVaccinated_False(){
        assertFalse(michi.isVaccinated());
    }

    @Test
    public void vaccinate_ThrowTooYoungToVaccinateException(){
        assertThrows(TooYoungToVaccinateException.class, () ->{
            michi.vaccinate();
        });
    }

    @Test
    public void vaccinate_Success(){
        peito.vaccinate();
        assertTrue(peito.isVaccinated());
    }

    @Test
    public void dogTrainingTreadmill_Success(){
        peito.train(TrainingType.TREADMILL);

        String output = outContent.toString().trim();
        assertEquals(peito.getName() + " is training"+ TrainingType.TREADMILL, output);

    }




}
