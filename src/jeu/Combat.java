package jeu;

import outils.Clavier;
import personnages.Personnage;

public class Combat {

    static int tour = 1;

    public static void duel(Personnage p1, Personnage p2) {

        Personnage persoAttaquant, persoDefenseur;
        int choixAttaque, degats;

        do {

            System.out.println("=== Tour n°" + tour + " ===");

            //1) Sélection du personnage qui va jouer
            if(tour%2==1) {
                persoAttaquant = p1;
                persoDefenseur = p2;
            }
            else {
                persoAttaquant = p2;
                persoDefenseur = p1;
            }

            //2) Choix de l'attaque
            System.out.println(persoAttaquant.nomPersonnage+" ("+persoAttaquant.vie+" vitalité) " +
                    "veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale)");
            choixAttaque = Clavier.readInt(1,2);

            //3) Calcul des dégats
            if(choixAttaque == 1)
                degats = persoAttaquant.attaque1();
            else
                degats = 0; //à implémenter

            //4) Bilan de l'attaque et fin de tour
            persoDefenseur.vie -= degats;
            System.out.println(persoDefenseur.nomPersonnage+" perd "+degats+" points de vie ("+persoDefenseur.vie+" restants)");
            System.out.println();

            tour++;

        }while (p1.vie > 0 && p2.vie > 0);

        //5) Fin de partie
        System.out.println(persoDefenseur.nomPersonnage+" a perdu !");

    }

}
