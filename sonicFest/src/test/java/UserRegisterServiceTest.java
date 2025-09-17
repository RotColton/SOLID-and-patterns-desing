import exception.UserAlreadyExistsException;
import exception.UserUnderageException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.UserRegisterService;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


public class UserRegisterServiceTest {

    private UserRegisterService userRegisterService;
    private LocalDate birthday;

    @BeforeEach
    void setUp() {
        userRegisterService = new UserRegisterService();
    }

    @Test
    void registerNewUser_success(){
        birthday = LocalDate.of(1988, 9,12);
        userRegisterService.newUser("pepito@pepe.com", "Y684739", birthday);

        assertTrue(userRegisterService.getUsers().containsKey("Y684739"));
    }

    @Test
    void registerUser_alreadyExists_throwsException(){
        birthday = LocalDate.of(1988, 9,12);
        userRegisterService.newUser("pepito@pepe.com", "Y684739", birthday);

        Exception exception = assertThrows(UserAlreadyExistsException.class,
                () -> userRegisterService.newUser("pepito@pepe.com", "Y684739", birthday));

        assertEquals("User already registered", exception.getMessage());
    }

    @Test
    void registerUser_underage_throwsException(){
        birthday = LocalDate.of(2008, 9,12);

        Exception exception = assertThrows(UserUnderageException.class,
                () -> userRegisterService.newUser("pepito@pepe.com", "Y684739", birthday));

        assertEquals("User is under 18 and cannot be registered", exception.getMessage());
    }


}
