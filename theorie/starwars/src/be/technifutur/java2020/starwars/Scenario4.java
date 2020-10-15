package be.technifutur.java2020.starwars;

public class Scenario4 extends Scenario {

    public Scenario4() {
        super("La Force des interfaces");
    }

    @Override
    public void run() {
        Personne[] pers = new Personne[4]; // de base initialisé à "null"
        Force f;

        pers[0] = new Soldat("Tom");
        pers[1] = new Jedi("Luke");
        pers[2] = new Sith("Dark Vador");
        pers[3] = new Clone();

        for (Personne p : pers) { // chaque tour de boucle, p va prendre la valeur suivante dans le tableau --> for  each
            System.out.println(p.getName());
            p.afficheCamp();
            if (p instanceof Force) {
                f = (Force) p;
                f.utiliserForce();
            }
            p.combattre();
            System.out.println();
        }//foreach

    }
}//end scenario4
