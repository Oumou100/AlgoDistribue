package TP6;

import io.jbotsim.core.Color;
import io.jbotsim.core.Link;
import io.jbotsim.core.Node;

public class LonerGraphBased extends Node {
    @Override
    public void onStart() {
        if(getNeighbors().isEmpty()) {
            setColor(Color.blue);
        }else {
            setColor(Color.yellow);
        }
    }

    @Override
    public void onClock(){ //Le temps necessaire pour effectuer un round(temps necessaire pour envoyer, recevoir, traitement)
        move(2); // deplacer d'un pixel
        wrapLocation(); //Revenir
    }

    @Override
    public void onLinkAdded(Link link) {
        setColor(Color.blue);
    }

    @Override
    public void onLinkRemoved(Link link) {
        if(getNeighbors().isEmpty()) {
            setColor(Color.yellow);
        }
    }
}
