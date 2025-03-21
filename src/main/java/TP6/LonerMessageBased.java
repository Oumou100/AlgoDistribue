package TP6;

import io.jbotsim.core.Color;
import io.jbotsim.core.Message;
import io.jbotsim.core.Node;

public class LonerMessageBased extends Node {
    private boolean heardSomeone = false;

    @Override
    public void onStart() {
        setColor(null);
        setDirection(Math.random() * 2 * Math.PI);
        heardSomeone =false;
    }
    @Override
    public void onClock(){
            move(4*Math.random()); // deplacer d'un pixel
            wrapLocation();
        sendAll(new Message());

        if(getLinks().isEmpty()){
            setColor(Color.blue);
            heardSomeone = false;
        }
    }

    @Override
    public void onMessage(Message message) {
        heardSomeone = true;
        setColor(Color.yellow);

    }
}
