package personnages;

public class Guerrier extends Personnage {

    public Guerrier(String nomPersonnage, int niveau, int force, int agilite, int intelligence) {
        super(nomPersonnage, niveau, force, agilite, intelligence);
    }

    @Override
    public String getCri(){
        return "Woarg !";
    }

    @Override
    public String getNomClasse(){
        return "Guerrier";
    }

    @Override
    public int attaque1(){
        return this.force;
    }

}
