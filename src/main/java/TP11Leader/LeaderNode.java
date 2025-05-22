package TP11Leader;

import io.jbotsim.core.Color;
import io.jbotsim.core.Link;
import io.jbotsim.core.Node;
import io.jbotsim.core.Message;
import io.jbotsim.core.event.TopologyListener;
public class LeaderNode extends Node {
    int leaderID;
    @Override
    public void onStart() {
        setColor(null);
        leaderID = getID();
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
        setColor(null);
        sendAll(new Message(leaderID));
        if(leaderID==getID())
            setColor(Color.red);
    }
}
