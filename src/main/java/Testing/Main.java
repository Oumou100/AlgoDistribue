package Testing;

import io.jbotsim.core.Topology;

public class Main {
    public static void main(String[] args) {
        Topology tp = new Topology();
        tp.setNodeModel("Node1", Node1.class);
        tp.setNodeModel("Node2", Node2.class);
    }
}
