package TP11Leader;

import io.jbotsim.core.Color;
import io.jbotsim.core.Message;
import io.jbotsim.core.Node;

public class Leader2 extends Node {

    int leaderID, round=0;
    @Override
    public void onStart() {
        setColor(null);
        leaderID = getID();
        setDirection(Math.random() * 2 * Math.PI);
    }
    @Override
    public void onMessage(Message message) {
        int receivedID = (Integer) message.getContent();
        if (receivedID > leaderID) {
            leaderID = receivedID;
            sendAll(new Message(leaderID));
        }
    }
    @Override
    public void onSelection() {
        System.out.println("Je suis le noeud " + getID() + " - Leader connu: " + leaderID);
    }
    @Override
    public void onClock(){
        move(1);
        wrapLocation();
        setColor(null);
        if(round%10==0){
            leaderID = getID();
            sendAll(new Message(leaderID));
        }
        sendAll(new Message(leaderID));
        if(leaderID==getID())
            setColor(Color.red);
    }
}
