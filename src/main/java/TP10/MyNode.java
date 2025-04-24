package TP10;

import io.jbotsim.core.Node;
import io.jbotsim.ui.icons.Icons;
public class MyNode extends Node{
    public MyNode(){
        setIcon(Icons.ROBOT);
        setIconSize(16);
        //setIcon(getClass().getResource("/TP10/Oumou_Tech_Logo.png"));
    }
}
