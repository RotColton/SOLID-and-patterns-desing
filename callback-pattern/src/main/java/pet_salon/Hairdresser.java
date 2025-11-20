package pet_salon;

import lombok.extern.java.Log;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

@Log
public class Hairdresser {
    private final String name;

    public Hairdresser(String name) {
        this.name = name;
    }


    public void cutHair(PhoneCall call){
        new Thread(() -> {
            try{
                task("\uD83D\uDC88 Hola perrito..");
                task("\uD83D\uDC8B\uD83D\uDC8B\uD83D\uDC8B");
                task("✂️ ... ✂️ ... ✂️");
                task("🥰 🥰");
                task("✂️ ... ✂️ ... ✂️");
                task("✂️ ... ✂️ ... ✂️");
                task("🥰 \uD83D\uDC9E 🐶");

                Optional.ofNullable(call).ifPresent(PhoneCall::call);

            } catch (InterruptedException e) {
                log.severe(e.getMessage());
            }
        }).start();
    }

    private void task(String msg) throws InterruptedException {
        log.info( name +" "+ msg + "\n");
        TimeUnit.SECONDS.sleep(3);
    }
}
