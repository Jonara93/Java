package be.technifutur.java2020.starwars;

public class Sith extends Empire implements Force{

    public Sith(String name) {
        super(name);
    }

    @Override
    public void utiliserForce() {
        System.out.println("J'utilise la force mieux que les Jedi, car je suis un Sith");
    }

    @Override
    public void combattre() {
        System.out.println("Je combats extremement bien car je suis un Sith");
    }
}
