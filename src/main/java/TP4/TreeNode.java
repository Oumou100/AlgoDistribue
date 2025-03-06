package TP4;
import io.jbotsim.core.Color;
import io.jbotsim.core.Link;
import io.jbotsim.core.Message;
import io.jbotsim.core.Node;
import java.util.ArrayList;
import java.util.List;
/*Résumé visuel du fonctionnement
1️⃣ Le nœud de départ s’active 🔴 et envoie des messages.
2️⃣ Chaque nœud reçoit un message et choisit son premier expéditeur comme parent.
3️⃣ Il propage ensuite le message à ses voisins.
4️⃣ L’arbre couvrant est formé en suivant ces connexions.*/
public class TreeNode extends Node {
    Node parent;
    List<Node> children;
    @Override
    public void onStart() {
        parent = null; // Stocke le parent du nœud dans l’arbre
        children = new ArrayList<Node>(); // Liste des enfants (non utilisée ici)

        setColor(null);

        List<Link> links =getLinks();
        for(int i=0; i<links.size(); i++){
            Link link = links.get(i);
            link.setWidth(1);
        }
        for (Node neighbor : getNeighbors()) {
            System.out.println(neighbor);
            getCommonLinkWith(neighbor).setWidth(1);
        }
    }
    @Override
    public void onSelection(){
        parent = this; // Le nœud sélectionné devient la racine
        sendAll(new Message(this)); // Envoie un message à tous ses voisins
        setColor(Color.red); // Change la couleur pour indiquer qu’il est la racine
    }
//traitement à appliquer lors qu'on recoit un message
    @Override
    public void onMessage(Message message){
        if(parent == null){ // Si le nœud n'a pas encore de parent
            parent = message.getSender(); // L'expéditeur devient le parent
            getCommonLinkWith(parent).setWidth(4); // Épaissit le lien avec le parent
            sendAll(new Message(parent)); // Propage le message aux voisins
        } else {
            if(message.getContent() == this){
                children.add(message.getSender()); // Ajoute un enfant (non utilisé ici)
            }
        }
    }
}
