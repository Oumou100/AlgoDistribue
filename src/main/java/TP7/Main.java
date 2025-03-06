package TP7;

import io.jbotsim.core.Topology;
import io.jbotsim.ui.JViewer;

public class Main {
    public static void main(String[] args) {
        Topology topology = new Topology();
        new MyCentralizedAlgorithm(topology);
        new JViewer(topology);
        topology.start();
    }
}
