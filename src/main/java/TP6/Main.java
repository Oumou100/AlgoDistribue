package TP6;

import io.jbotsim.core.Topology;
import io.jbotsim.ui.JViewer;

public class Main {

    public static void main(String[] args) {
        Topology tp = new Topology();
        tp.setDefaultNodeModel(LonerMessageBased.class);
        new JViewer(tp);
        tp.start();
    }
}
/*
🔍 Résumé des points clés
Graph-based : Un nœud voit ses voisins immédiatement (getNeighbors()), pas besoin d'envoyer des messages.
Message passing : Un nœud doit échanger des messages pour découvrir ses voisins.
💡 Avantage du Graph Algorithm : Plus rapide, car aucune communication n’est nécessaire.
💡 Avantage du Message Passing : Plus réaliste pour les systèmes où les nœuds ne connaissent pas la structure du réseau à l’avance. 🚀
 */