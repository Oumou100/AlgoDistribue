package TP13GarbageCollector;

import io.jbotsim.core.Node;
import io.jbotsim.core.Topology;
import io.jbotsim.ui.JViewer;

public class Main {
    public static void main(String[] args) {
        Topology tp = new Topology();
        tp.disableWireless();
        tp.setNodeModel("Garbage",GarbageNode.class);
        tp.setNodeModel("car", RobotNode.class);
        new JViewer(tp);

// Ajouter les ordures
        for (int i = 0; i < 10; i++) {
            Node g = new GarbageNode();
            g.setLocation(200+Math.random() * 300, 100+(Math.random() * 500));
            tp.addNode(g);
        }
// Ajouter les robots
        for (int i = 0; i < 3; i++) {
            Node r = new RobotNode();
            r.setLocation(Math.random() * 500, Math.random() * 500);
            tp.addNode(r);
        }



            tp.start();
    }
}
