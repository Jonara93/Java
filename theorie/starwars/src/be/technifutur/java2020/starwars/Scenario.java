package be.technifutur.java2020.starwars;

public abstract class Scenario {
    private String name;

    // Constructeur ------

    public Scenario(String name) {
        this.name = name;
    }

    // get and setter

    public String getName() {
        return this.name;
    }

    public abstract void run();
}
