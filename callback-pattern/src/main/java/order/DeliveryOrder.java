package order;

import lombok.extern.java.Log;

@Log
public class DeliveryOrder implements ProcessOrder {
    @Override
    public void execute() {
        log.info("Order on the way!");
        short randomResult = (short)(Math.random()*20);
        if (randomResult <= 7) throw new RiderLostException("Oops! The rider is probably lost...");
    }
}
