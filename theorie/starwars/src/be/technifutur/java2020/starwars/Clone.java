package be.technifutur.java2020.starwars;

public class Clone extends Empire{

    public Clone() {
        super("Clone");
    }

    @Override
    public void combattre() {
        System.out.printf("Je combat comme une personne de l'Empire, Piou Piou, je touche personne");
    }
}
