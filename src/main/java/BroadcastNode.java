import io.jbotsim.core.Message;
import io.jbotsim.core.Color;
import io.jbotsim.core.Node;

public class BroadcastNode extends Node {

    boolean informed;

    @Override
    public void onStart() {
        informed = false;
        setColor(null);
        System.out.println("BroadcastNode.onStart");
    }

    @Override
    public void onSelection() {
        informed = true;
        setColor(Color.RED);
        sendAll(new Message("My message"));// envoie message à ses voisins
        System.out.println("Onh");
    }

    @Override
    public void onMessage(Message message) {
        if (! informed) {
            informed = true;
            setColor(Color.RED);
            sendAll(new Message(message.getContent()));
        }
    }
}