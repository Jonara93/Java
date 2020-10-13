package be.technifutur.java2020.starwars;

public class Jedi extends Empire implements Force{

    public Jedi(String name) {
        super(name);
    }

    @Override
    public void utiliserForce() {
        System.out.println("J'utilise la Force comme personne !");
    }

    @Override
    public void combattre() {
        System.out.println("Je suis un Maitre Jedi et je combat comme un Jedi !");
    }
}
