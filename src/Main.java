import jeu.Combat;
import personnages.*;

public class Main {

    final static boolean MODE_TEST = false;

    public static void main(String[] args) {

        Personnage p1, p2;

        //en mode de test, pour passer directement au combat, on crée automatiquement 2 personnages
        if(MODE_TEST) {
            p1 = new Guerrier("joueur 1", 10, 10, 0,0);
            p2 = new Mage("joueur 2", 10, 0, 0,10);
        }else{
            p1 = Personnage.creerPersonnage("joueur 1");
            p2 = Personnage.creerPersonnage("joueur 2");
        }

        Combat.duel(p1, p2);
    }

}
