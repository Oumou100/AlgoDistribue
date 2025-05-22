package TP13GarbageCollector;

import io.jbotsim.core.Color;
import io.jbotsim.core.Node;
import io.jbotsim.ui.icons.Icons;
import java.util.List;
public class RobotNode extends Node {
    @Override
    public void onStart() {
        setDirection(2 * Math.PI * Math.random()); // direction initial aléatoire
        setIcon(Icons.ROBOT);
        setIconSize(20);
        setSensingRange(30);
    }

    @Override
    public void onClock() {
        wrapLocation();
        move(1); // déplacement simple
       /* for (Node neighbor : getSensedNodes()) {
            if (neighbor instanceof GarbageNode) {
                getTopology().removeNode(neighbor);
                setColor(Color.orange);
            }*/
        List<Node> sensedObjects= this.getSensedNodes();
        for(Node n : sensedObjects) {
            if (n instanceof GarbageNode) {
                if (n instanceof GarbageNode) {
                    getTopology().removeNode(n);
                }
            }
        }
        if (Math.random() < 0.01) {
            setDirection(2 * Math.PI * Math.random()); // changer direction

        }
    }
}