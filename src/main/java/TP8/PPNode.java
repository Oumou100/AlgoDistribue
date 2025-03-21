package TP8;

import io.jbotsim.core.Node;

public abstract  class PPNode extends Node {

    public abstract  void onStart();

    public abstract  void onSelection();

    public abstract  void interactWith(Node responder);

}
