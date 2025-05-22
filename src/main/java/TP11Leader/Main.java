package TP11Leader;

import io.jbotsim.core.Topology;
import io.jbotsim.ui.JViewer;
public class Main {
    public static void main(String[] args) {
        Topology tp = new Topology();
        tp.setDefaultNodeModel(Leader2.class);
        new JViewer(tp);
        for (int i = 0; i < 10; i++) {
            LeaderNode node = new LeaderNode();
            node.setLocation(200+Math.random() * 250, 100+Math.random() *
                    150);
            tp.addNode(node);
        }
        tp.start();
    }
}