package TP8;

import io.jbotsim.core.Link;
import io.jbotsim.core.Topology;
import io.jbotsim.core.event.ClockListener;

import java.util.List;

public class PPScheduler implements ClockListener {

    Topology tp;

    public PPScheduler(Topology tp) {
        this.tp = tp;
        tp.addClockListener(this);
    }

    @Override
    public void onClock(){
        List<Link> links = tp.getLinks();
        if( ! links.isEmpty()) {
            Link selectedLink = links.get((int) (Math.random() * links.size()));
            drawInteraction(selectedLink);

            PPNode initiator = (PPNode) selectedLink.endpoint((int) (Math.random() * 2));

            PPNode responder = (PPNode) selectedLink.getOtherEndpoint(initiator);
            initiator.interactWith(responder);
        }
    }

    public void drawInteraction(Link selectedLink) {
        for(Link link : tp.getLinks()) {
            link.setWidth(1);
        }
        selectedLink.setWidth(3);
    }
}
