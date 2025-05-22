package TP14;

import io.jbotsim.core.Node;
import io.jbotsim.core.Topology;
import io.jbotsim.core.event.ClockListener;
import io.jbotsim.ui.JViewer;
import io.jbotsim.ui.painting.BackgroundPainter;
import io.jbotsim.ui.painting.UIComponent;

import java.awt.*;
/*
public class Main implements ClockListener, BackgroundPainter {

    Topology tp;
    boolean finished = false;
    static Node center;

    public Main(Topology tp) {
        this.tp = tp;
        tp.addClockListener(this);
    }

    private  boolean isFinished() {
        for(Node node : tp.getNodes()) {
            if(node instanceof Cow)
                if ( node.distance(125,125) > 75)
                    return false;
        }
    }

    @Override
    public void onClock(){
        finished = isFinished();
    }

    @Override
    public void paintBackground(UIComponent uiComponent,Topology tp) {
        Graphics2D g = (Graphics2D) uiComponent.getComponent();
        g.setFont(new Font("TimeRoman", Font.PLAIN, 20));
        g.drawString("YEAH !", 300, 150);
    }
    }
public static void main (String[] args){
    Topology tp = new Topology();
    tp.addNode(100,100,Cow.farmer =new Farmer());
    tp.addNode(-1,-1,new Crow());
    tp.addNode(-1,-1,new Crow());
    JViewer jv = new JViewer(tp);
    jv.getJTopology().addBackgroundPainter(new main(tp));
    tp.start();
}*/
