package clicker;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class FirstTread {

    public int periodGeneration() {
        Random random = new Random();
        int period = 1 + random.nextInt(3 - 1);

        return period;
    }

    public void test(final int x, final int y) {
        int period;
        Random random = new Random();
        Thread run = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Robot bot = null;
                    try {
                        bot = new Robot();
                    } catch (Exception failed) {
                        System.err.println("Failed instantiating Robot: " + failed);
                    }

                    int mask = InputEvent.BUTTON1_DOWN_MASK;
                    bot.mouseMove(x, y);
                    bot.mousePress(mask);
                    bot.mouseRelease(mask);

                    try {
                        // Thread.sleep(period);
                        TimeUnit.MINUTES.sleep(periodGeneration());
                        System.out.println(periodGeneration());

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        run.start();
    }
}
