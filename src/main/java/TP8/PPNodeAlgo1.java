package TP8;

import io.jbotsim.core.Color;
import io.jbotsim.core.Link;
import io.jbotsim.core.Node;

public class PPNodeAlgo1 extends PPNode{
    @Override
    public void onStart() {
        setColor(Color.blue);
        for(Link link : this.getLinks()) {
            link.setWidth(1);
        }
    }
    @Override
    public void onSelection() {
        setColor(Color.red);
    }
    @Override
    public void interactWith(Node responder) {
        if(this.getColor() == Color.red && responder.getColor() == Color.blue) {
            responder.setColor(Color.red);
        }
        else if(this.getColor() == Color.blue && responder.getColor() == Color.red) {
            this.setColor(Color.red);
        }
    }
}
