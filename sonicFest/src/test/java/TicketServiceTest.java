import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.UserRegisterService;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TicketServiceTest {

    private TicketService ticketService;
    private UserRegisterService userRegisterService;
    private LocalDate festivalDate;
    private static final String DNI = "T98453274";


    @BeforeEach
    void setUp(){
        ticketService = new TicketService();
        userRegisterService = new UserRegisterService();
        userRegisterService.newUser("pepito@pepe.com", DNI, LocalDate.of(1990, 10, 1));
        festivalDate = LocalDate.of(2025, 12, 10);

    }

    @Test
    void sellBasicTicket_Success(){
        ticketService.sellBasic(userRegisterService.getUserByDNI(DNI), festivalDate);

        assertEquals(userRegisterService.getUserByDNI(DNI).getTicket().getID(),
                DNI+"-B");
        assertEquals(userRegisterService.getUserByDNI(DNI).getTicket().getDate(),
                festivalDate);
        assertTrue(ticketService.getTickets().containsKey(DNI+"-B"));
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
        ticketService.sellFullTicket(DNI);

        assertEquals(DNI+"-FULL",
                userRegisterService.getUserByDNI(DNI).getTicket().getID());
        assertEquals(DNI+"-CAMP",
                userRegisterService.getUserByDNI(DNI).getTicket().getCamp().getID());
        assertEquals("4-"+DNI+"-VOUCHER",
                userRegisterService.getUserByDNI(DNI).getTicket().getVoucher().getID());
    }

    @Test
    void sellVIPTicket_success(){

    }

}
