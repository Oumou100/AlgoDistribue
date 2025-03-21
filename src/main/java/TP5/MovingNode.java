package TP5;

import io.jbotsim.core.Color;
import io.jbotsim.core.Link;
import io.jbotsim.core.Message;
import io.jbotsim.core.Node;
import io.jbotsim.ui.icons.Icons;

public class MovingNode extends Node {
    @Override
    public void onStart() {
        setColor(null);
        setIcon(Icons.DRONE);
        setIconSize(25);
        setDirection(Math.random() * 2 * Math.PI);
    }
    @Override
    public void onClock(){ //Le temps necessaire pour effectuer un round(temps necessaire pour envoyer, recevoir, traitement)
        move(1); // deplacer d'un pixel
        wrapLocation(); //Revenir
        sendAll(new Message());
    }
    //Au debut rien; connecté vert; deconnecté rouge
    @Override
    public void onLinkAdded(Link link) {
        setColor(Color.green);
        link.setWidth(4);
    }
    @Override
    public void onLinkRemoved(Link link) {
        if(getLinks().isEmpty())
            setColor(Color.red);
    }
}
