package api.log;

import org.dreambot.api.methods.MethodProvider;

import java.util.logging.Level;

public class Log {

    public synchronized static void info(String str) {
        MethodProvider.log(str);
    }

    public synchronized static void fine(String str) { MethodProvider.log(str);
    }

    public synchronized static void severe(String str) {
        MethodProvider.logError(str);
    }

    public synchronized static void log(Level level, String topic, Object object) {
        MethodProvider.log((String) object);
    }
}

