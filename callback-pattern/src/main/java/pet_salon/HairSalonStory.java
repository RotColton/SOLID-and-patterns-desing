package pet_salon;

import lombok.extern.java.Log;

import java.util.concurrent.TimeUnit;

@Log
public class HairSalonStory {

    public static void main(String[] args){
        Hairdresser pablo = new Hairdresser("PABLO");
        Hairdresser maria = new Hairdresser("MARIA");

        pablo.cutHair(new PhoneCall() {
            @Override
            public void call() {
                log.info("\uD83D\uDCF2 Hola soy Pablo, peluquero canino. Ven a buscar a tu perro, humano!\n");
            }
        });

        log.info("El humano camina por el parque \uD83D\uDEB6 \n");
        log.info("El humano le hace una foto a un pato \uD83E\uDD86 \n");

        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        log.info("Pasa una paloma \uD83D\uDD4A\uFE0F \n");

        maria.cutHair(new PhoneCall() {
            @Override
            public void call() {
                log.info("\uD83D\uDCF2 Hola, soy María. Tu amigo está esperando por ti...\n");
            }
        });

        log.info("La humana toma un café ☕\n");
        log.info("La humana mira instagram \uD83D\uDC40 \n");

    }
}
