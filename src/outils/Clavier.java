package outils;

import java.util.Scanner;

public class Clavier {

    static Scanner sc = new Scanner(System.in);

    public static int readInt(int min, int max){

        //1) Affichage avant saisie
        if(min==max)
            System.out.println("(choisir "+min+")");
        else
            System.out.println("(choisir un entier entre "+min+" et "+max+")");

        //2) Saisie au clavier
        String ligne = sc.nextLine();

        //3) Traitement de la ligne et vérifications
        int res;

        //3.1) Vérif n°1 : Si le texte entré n'est pas un entier, on le signale à l'utilisateur et on recommence
        try {
            res = Integer.parseInt(ligne);
        }catch (Exception e){
            System.out.println("Cette valeur n'est pas autorisée");
            return readInt(min,max);
        }

        //3.2) Vérif n°2 : Si l'entier entré n'est pas entre min et max : on le signale à l'utilisateur et on recommence
        if(res<min || res>max){
            System.out.println("Cette valeur n'est pas autorisée");
            return readInt(min, max);
        }

        //4) Retour de la valeur
        //si la fonction n'a pas été interrompue avant : tout est OK, on retourne le resultat
        return res;

    }



}
