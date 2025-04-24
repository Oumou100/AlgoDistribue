package TP12;
/**
 * MyBackgroundPainter est une classe personnalisée qui implémente l'interface BackgroundPainter de JBotSim.
 * Elle permet de dessiner une grille grise en arrière-plan de la topologie.
 *
 * Fonctionnement :
 * - Une ligne verticale est dessinée toutes les 50 unités sur l'axe X.
 * - Une ligne horizontale est dessinée toutes les 50 unités sur l'axe Y.
 * - Cela crée un quadrillage visuel utile pour repérer les positions des nœuds,
 *   structurer l'espace de simulation ou simuler un environnement cartésien.
 *x1 = 0 → départ à gauche
 *
 * y1 = j*50 → hauteur actuelle (ligne n°j)
 *
 * x2 = tp.getHeight() → longe toute la largeur (⚠️ erreur probable ici)
 *
 * y2 = j*50 → même hauteur ⇒ ligne horizontale
 * Remarque :
 * - Utilise Graphics2D pour le rendu graphique.
 * - Corrigé pour utiliser tp.getWidth() sur l'axe horizontal (au lieu de tp.getHeight()).
 */


import io.jbotsim.core.Topology;
import io.jbotsim.ui.painting.BackgroundPainter;
import io.jbotsim.ui.painting.UIComponent;

import java.awt.*;

public class MyBackgroundPainter implements BackgroundPainter {
    @Override
    public void paintBackground(UIComponent uiComponent, Topology tp) {
        Graphics2D g = (Graphics2D) uiComponent.getComponent();
        g.setColor(Color.GRAY);
        for(int i=0; i<tp.getWidth(); i++){
            for(int j=0; j<tp.getHeight(); j++){
                g.drawLine(i*50, 0,i*50, tp.getHeight());
                g.drawLine(0,j*50, tp.getWidth(),j*50);
            }
        }
    }
}
