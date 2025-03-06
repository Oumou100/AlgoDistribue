package TP5;

import io.jbotsim.core.Color;
import io.jbotsim.core.Link;
import io.jbotsim.core.Node;

public class MovingNode extends Node {
    @Override
    public void onStart() {
        setColor(null);
        setDirection(Math.random() * 2 * Math.PI);
    }
    @Override
    public void onClock(){ //Le temps necessaire pour effectuer un round
        move(1);
        wrapLocation();
    }
    //Au debut rien; connecté vert; deconnecté rouge
    @Override
    public void onLinkAdded(Link link) {
        setColor(Color.green);
    }
    @Override
    public void onLinkRemoved(Link link) {
        setColor(Color.red);
    }
}
