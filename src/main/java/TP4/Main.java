package TP4;

import io.jbotsim.core.Topology;
import io.jbotsim.ui.JViewer;

public class Main {
    public static void main(String[] args) {
        Topology tp = new Topology();
        tp.setTimeUnit(1000);//un round se termine après 1s
        tp.setDefaultNodeModel(TreeNode.class);
        new JViewer(tp); //Visualisation
        tp.start();
    }
}
