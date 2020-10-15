package be.technifutur.java2020.starwars;

public class Scenario2 extends Scenario {

    public Scenario2() {
        super("gestion des variables de classes");
    }

    @Override
    public void run() {
        VaisseauBlinde v2 = new VaisseauBlinde("x-wing2",48);
        VaisseauBlinde v3 = new VaisseauBlinde("x-wing 3", 5);
        VaisseauBlinde v4 = new VaisseauBlinde("x-wing 4", 6);
        VaisseauBlinde v5 = new VaisseauBlinde("x-wing 5", 8);
        VaisseauBlinde v6 = new VaisseauBlinde("x-wing 6", 50);
        VaisseauBlinde v7 = new VaisseauBlinde("x-wing 7", 5);
        VaisseauBlinde v8 = new VaisseauBlinde("x-wing 8", 14);
        VaisseauBlinde v9 = new VaisseauBlinde("x-wing 9", 18);
        VaisseauBlinde v10 = new VaisseauBlinde("x-wing 10", 3);

        v3.decoller();
        v4.decoller();
        v7.decoller();
        v2.decoller();
        v5.decoller();
        v7.atterir();
        v7.atterir();
        v6.decoller();
        v10.decoller();
        v9.atterir();
        v9.decoller();
        v8.decoller();

        System.out.println("\nIl y a " + VaisseauBlinde.getNbEnVolVaisseau() + " vaisseau en vol !\n");

        v2.atterir();
        v3.atterir();
        v4.atterir();
        v5.atterir();
        v6.atterir();
        v7.atterir();
        v8.atterir();
        v9.atterir();
        v10.atterir();

        System.out.println("\nIl y a " + VaisseauBlinde.getNbEnVolVaisseau() + " vaisseau en vol !");
    }

}
