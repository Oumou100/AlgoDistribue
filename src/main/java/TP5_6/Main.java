package TP5_6;

import TP5.MovingNode;
import TP6.LonerGraphBased;
import TP7.MyCentralizedAlgorithm;
import io.jbotsim.core.Topology;
import io.jbotsim.ui.JViewer;

public class Main {

    public static void main(String[] args) {
        Topology tp = new Topology();
        tp.setNodeModel("Moving", MovingNode.class);
        tp.setNodeModel("LonerMessage",LonerGraphBased.class);
        new MyCentralizedAlgorithm(tp);
        new JViewer(tp);
        tp.start();
    }
}