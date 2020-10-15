package be.technifutur.java2020.starwars;

public abstract class Empire extends Personne{

    public Empire(String name) {
        super(name);
    }

    @Override
    public void afficheCamp() {
        System.out.println("Je suis de l'Empire !");
    }
}
