import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PetParentTest {

    private PetParent rawl;

    @BeforeEach
    void init(){
        rawl = new PetParent("L-56738", "Rawl", 605328456);
    }

    @Test
    public void registreNewPetParent_Success(){

        assertAll("petParent",
                () -> assertEquals("Rawl", rawl.getName()),
                () -> assertEquals("L-56738", rawl.getDNI()),
                () -> assertEquals(605328456, rawl.getPhoneNumber())
        );
    }




}
