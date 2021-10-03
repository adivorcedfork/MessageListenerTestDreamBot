import api.log.Log;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.script.listener.ChatListener;
import org.dreambot.api.wrappers.widgets.message.Message;
import store.Config;
import store.Store;

@ScriptManifest(name = "MessageListenerTest",  description = "MessageListenerTest", author = "ADivorcedFork", category = Category.MISC, version = 0.00)
public class Script extends AbstractScript implements ChatListener {

    @Override
    public void onStart() {
        super.onStart();
        Log.fine("Starting Fork's MessageListenerTest!");
        Store.startElapsedTime();
    }

    @Override
    public int onLoop() {
        Store.setTask("Looping");
        return Config.getLoopReturn();
    }

    @Override
    public void onExit() {
        Log.fine("Total Runtime: " + Store.getElapsedTimeString());
        super.onExit();
    }

    @Override
    public void onTradeMessage(Message message) {
        Log.info("Message received: " + message.getMessage());
    }
}
