package be.technifutur.java2020.starwars;

public class Soldat extends Rebelle{

    public Soldat(String name) {
        super(name);
    }

    @Override
    public void combattre() {
        System.out.println("Je combat comme un soldat, Piou Piou");
    }
}
