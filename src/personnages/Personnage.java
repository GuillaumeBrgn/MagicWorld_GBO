package personnages;

import outils.Clavier;

public abstract class Personnage {

    public String nomPersonnage;

    int niveau;
    public int vie;
    int vieInitiale;
    int force;
    int agilite;
    int intelligence;

    //pour créer un perso avec toutes ses caratéristiques en arguments
    public Personnage(String nomPersonnage, int niveau, int force, int agilite, int intelligence) {
        this.nomPersonnage = nomPersonnage;
        this.niveau = niveau;
        this.vie = 5 * niveau;
        this.vieInitiale = vie;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;

        System.out.println(getCri() + " " +
                "Je suis le "+getNomClasse()+" "+ nomPersonnage +" niveau "+niveau + ". " +
                "Je possède "+vie+" de vitalité, " +
                force+" de force, " +
                agilite+" d'agilité et "+
                intelligence+" d'intelligence !");
        System.out.println("================");
    }

    //pour créer un perso à partir d'entrées clavier
    public static Personnage creerPersonnage(String nomPersonnage){

        System.out.println("Création du personnage de "+nomPersonnage);

        //1) Classe
        System.out.println("Veuillez choisir la classe de votre personnage (" +
                "1 : Guerrier, " +
                "2 : Rôdeur, " +
                "3 : Mage)");
        int classe = Clavier.readInt(1,3);

        //2) Niveau
        System.out.println("Niveau du personnage ?");
        int niveau = Clavier.readInt(1,100);

        //3) Force
        int maxForce = niveau;
        System.out.println("Force du personnage ?");
        int force = Clavier.readInt(0,maxForce);

        //4) Agilité
        int maxAgilite = maxForce - force;
        System.out.println("Agilité du personnage ?");
        int agilite = Clavier.readInt(0,maxAgilite);

        //5) Intelligence
        int maxIntelligence = maxAgilite - agilite;
        System.out.println("Intelligence du personnage ?");
        int intelligence = Clavier.readInt(maxIntelligence,maxIntelligence);

        //6) Création du personnage
        if(classe == 1)
            return new Guerrier(nomPersonnage, niveau, force, agilite, intelligence);
        else if(classe == 2)
            return new Rodeur(nomPersonnage, niveau, force, agilite, intelligence);
        else
            return new Mage(nomPersonnage, niveau, force, agilite, intelligence);
    }

    //les fonctions abstraite (définies dans les classes Guerrier, Rodeur et Mage

    public abstract String getCri();

    public abstract String getNomClasse();

    public abstract int attaque1();

}
