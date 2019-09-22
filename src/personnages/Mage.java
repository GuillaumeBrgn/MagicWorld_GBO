package personnages;

public class Mage extends Personnage {

    public Mage(String nomPersonnage, int niveau, int force, int agilite, int intelligence) {
        super(nomPersonnage, niveau, force, agilite, intelligence);
    }

    @Override
    public String getCri(){
        return "Abracadabra !";
    }

    @Override
    public String getNomClasse(){
        return "Mage";
    }

    @Override
    public int attaque1(){
        return this.intelligence;
    }

}
