package TP11;

import TP10.MyNode;
import io.jbotsim.core.Node;
import io.jbotsim.core.Topology;
import io.jbotsim.ui.JViewer;

public class Main {
    public static void main(String[] args) {
        Topology tp = new Topology();
       tp.disableWireless();
       Node n1 = new Node();
       Node n2 = new Node();
       tp.addNode(n1);
       tp.addNode(n2);
    }
}
