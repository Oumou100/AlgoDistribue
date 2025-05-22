package TP13;
/**
 * Classe principale qui initialise une simulation JBotSim avec 20 nœuds utilisant le modèle LCMNode.
 *
 * Fonctionnalités :
 * - Désactive la communication sans fil (disableWireless), les nœuds ne communiquent donc pas par messages.
 * - Active un rayon de détection (sensing range) de 100 unités pour permettre aux nœuds
 *   de détecter les autres dans leur voisinage immédiat.
 * - Définit une unité de temps de 100 ms entre chaque cycle (setTimeUnit).
 * - Ajoute 20 nœuds aléatoirement positionnés dans la topologie.
 *
 * Objectif :
 * Cette configuration prépare le terrain pour simuler un comportement basé uniquement sur la détection
 * de proximité entre nœuds, sans communication explicite.
 */

import io.jbotsim.core.Topology;
import io.jbotsim.ui.JViewer;

public class Main {
    public static void main(String[] args){
        Topology tp = new Topology();
        tp.setDefaultNodeModel(LCMNode.class);
        tp.disableWireless();
        tp.setSensingRange(100);
        tp.setTimeUnit(100);
        for( int i= 0; i<20; i++ ){
            tp.addNode(-1,-1);
        }
        new JViewer(tp);
        tp.start();
    }
}
