package be.technifutur.java2020.starwars;

public abstract class Personne {
    private String name;

    public Personne(String name){
        setName(name);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public abstract void afficheCamp();

    public abstract void combattre();
}
