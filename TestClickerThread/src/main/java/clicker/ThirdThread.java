package clicker;

import java.util.Random;

public class ThirdThread extends FirstTread {
    @Override
    public int periodGeneration() {
        Random random = new Random();
        int period = 55 + random.nextInt(90 - 55);

        return period;
    }
}
