package store;

import api.log.Log;
import org.dreambot.api.utilities.Timer;

public class Store {

    private static Timer elapsedTime;
    private static String task = "Starting";

    public static void startElapsedTime() {
        elapsedTime = new Timer();
    }

    public static String getElapsedTimeString() {
        return elapsedTime == null ? "Not running" : elapsedTime.formatTime();
    }

    public static String getTask() {
        return task;
    }

    public static void setTask(String task) {
        Log.info("TASK: " + task);
        Store.task = task;
    }
}
