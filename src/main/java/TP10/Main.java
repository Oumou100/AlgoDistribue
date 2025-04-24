package TP10;


import io.jbotsim.core.Node;
import io.jbotsim.core.Topology;
import io.jbotsim.ui.JViewer;

public class Main {
    public static void main(String[] args) {
        Topology tp = new Topology();
        tp.setTimeUnit(1000);//un round se termine après 1s
        tp.setDefaultNodeModel(MyNode.class);
        new JViewer(tp); //Visualisation
    }
}
