package TP7;

import io.jbotsim.core.Link;
import io.jbotsim.core.Node;
import io.jbotsim.core.Topology;
import io.jbotsim.core.event.ClockListener;
import io.jbotsim.core.event.ConnectivityListener;
import io.jbotsim.core.event.TopologyListener;

//Si dans toute la topologie on veut appliquer une seule chose
public class MyCentralizedAlgorithm implements ClockListener, TopologyListener, ConnectivityListener {

    private Topology tp;
    public MyCentralizedAlgorithm(Topology tp) {
        this.tp = tp;
        tp.addClockListener(this);
        tp.addTopologyListener(this);
        tp.addConnectivityListener(this);
    }
    @Override
    public void onClock() {
        if(tp.getTime() % 100 == 0) {
            System.out.println("It is" + tp.getTime()/100 + " o'clock");
        }
    }

    @Override
    public void onLinkAdded(Link link) {
        System.out.println("Nodes " + link.endpoint(0) + " and " + link.endpoint(1) + " got in touch !");
    }

    @Override
    public void onLinkRemoved(Link link) {
        System.out.println("Nodes " + link.endpoint(0) + " and " + link.endpoint(1) + " left each other !");
    }

    @Override
    public void onNodeAdded(Node node) {
        System.out.println("Hi " + node+ node.getID());
    }

    @Override
    public void onNodeRemoved(Node node) {
        System.out.println("Goodbye " + node);
    }
}
