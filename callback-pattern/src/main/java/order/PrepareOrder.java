package order;

import lombok.extern.java.Log;

@Log
public class PrepareOrder implements ProcessOrder {

    @Override
    public void execute() {
        log.info("Cooking...");
        short randomResult = (short)(Math.random()*20);
        if (randomResult <= 2) throw new BurntException("Oops! Something has happened in the kitchen...");
    }

}
