package store;

import api.util.Random;

public class Config {
    public static int getLoopReturn() {
        return Random.nextInt(400, 1000);
    }
}
