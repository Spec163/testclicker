package clicker;

import java.util.Random;

public class SecondThread extends FirstTread {
    @Override
    public int periodGeneration() {
        Random random = new Random();
        int period = 3 + random.nextInt(6 - 3);

        return period;
    }
}
