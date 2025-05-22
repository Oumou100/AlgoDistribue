package TP13GarbageCollector;

import io.jbotsim.core.Color;
import io.jbotsim.core.Node;
public class GarbageNode extends Node {
    int round;
    @Override
    public void onStart() {
        setColor(Color.gray);
        setIcon("C:\\Algo_distribue\\TP1Jbotsim\\src\\main\\java\\TP13GarbageCollector\\gmgarbage.png");
        setIconSize(10);
        round = 0;
    }
    @Override
    public void onClock(){
        round++;
        if (round%500 == 0) {
            GarbageNode g = new GarbageNode();
            getTopology().addNode(-1,-1,g);
        }
    }
}
