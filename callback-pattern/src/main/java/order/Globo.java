package order;

import lombok.extern.java.Log;

@Log
public class Globo {
    public static void main(final String[] args) {

        try{
            new PrepareOrder().executeWith(() -> log.info("Order ready to ship!"));
        } catch (RuntimeException e) {
            log.severe(e.getMessage());
        }

        try{
            new DeliveryOrder().executeWith(() -> log.info("Order delivered!"));
        } catch (RuntimeException e){
            log.severe(e.getMessage());
        }
    }
}
