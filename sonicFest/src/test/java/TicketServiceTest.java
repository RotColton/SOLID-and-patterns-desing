import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketServiceTest {

    private TicketService ticketService;
    private User user;
    private UserRegisterService userRegisterService;
    private LocalDate festivalDate;


    @BeforeEach
    void setUp(){
        ticketService = new TicketService();
        userRegisterService = new UserRegisterService();
        userRegisterService.newUser("pepito@pepe.com", "T98453274", LocalDate.of(1990, 10, 1));
        festivalDate = LocalDate.of(2025, 12, 10);

    }

    @Test
    void sellBasicTicket_Success(){
        ticketService.sellBasic(userRegisterService.getUserByDNI("T98453274"), festivalDate);

        assertEquals(userRegisterService.getUserByDNI("T98453274").getTicket().getID(),
                "1-T98453274-B");
        assertEquals(userRegisterService.getUserByDNI("T98453274").getTicket().getDate(),
                festivalDate);
    }

    @Test
    void sellTicket_alreadyPurchased_throwsException(){

    }

    @Test
    void sellTicket_unregisteredUser_throwsException(){

    }

    @Test
    void sellTwoDaysTicket_success(){

    }

    @Test
    void sellFullTicket_success(){

    }

    @Test
    void sellVIPTicket_success(){

    }

}
