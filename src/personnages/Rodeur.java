package personnages;

public class Rodeur extends Personnage {

    public Rodeur(String nomPersonnage, int niveau, int force, int agilite, int intelligence) {
        super(nomPersonnage, niveau, force, agilite, intelligence);
    }

    @Override
    public String getCri(){
        return "Fufufu !";
    }

    @Override
    public String getNomClasse(){
        return "Rôdeur";
    }

    @Override
    public int attaque1(){
        return this.agilite;
    }

}
