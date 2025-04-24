package Testing;

import io.jbotsim.core.Color;
import io.jbotsim.core.Link;
import io.jbotsim.core.Message;
import io.jbotsim.core.Node;

public class Node1  extends Node {
    @Override
    public void onStart() {
        setColor(null);
        setDirection(2*Math.PI*Math.random());setColor(null);
        setDirection(2*Math.PI*Math.random());
    }

    @Override
    public void onLinkAdded(Link link) {
        setColor(Color.green);
    }

    @Override
    public void onLinkRemoved(Link link) {
        if(getLinks().isEmpty())
            setColor(Color.red);
    }
    @Override
    public void onClock(){
        move(1);
        wrapLocation();
        sendAll(new Message("test"));
    }
}
