package TP13;
/**
 * LCMNode implémente un comportement basé sur la détection locale (Local Collective Movement).
 * Chaque nœud détecte ses voisins proches et se déplace lentement vers un d’entre eux choisi au hasard.
 *
 * Fonctionnement par cycle :
 * - `onPreClock()` : Le nœud détecte les autres nœuds dans son rayon de détection et enregistre leurs positions.
 * - `onClock()` : Il choisit aléatoirement une de ces positions comme cible (`target`).
 * - `onPostClock()` : Il se dirige vers cette cible en avançant d'une unité maximum par cycle.
 *
 * Objectif :
 * Simuler un comportement de regroupement, comme dans des systèmes biologiques (ex : migration de poissons,
 * formation de troupeaux) ou des robots collectifs cherchant à se rapprocher les uns des autres.
 */

import io.jbotsim.core.Node;
import io.jbotsim.core.Point;

import java.util.ArrayList;
import java.util.Random;

public class LCMNode extends Node {

    ArrayList<Point> locations;
    Point target;

    @Override
    public void onPreClock(){
        locations = new ArrayList<>();
        for(Node node : getSensedNodes())
            locations.add(node.getLocation());
    }

    @Override
    public void onClock(){
        if(!locations.isEmpty()){
            target = locations.get((new Random()).nextInt(locations.size()));
        }
    }

    @Override
    public void onPostClock(){
        if(target == null){
            return;
        }

        setDirection(target);
        move(Math.min(1, distance(target)));
    }
}
