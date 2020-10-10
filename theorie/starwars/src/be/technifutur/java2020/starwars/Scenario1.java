package be.technifutur.java2020.starwars;

public class Scenario1 {

	// champs ------------------------------------------

	// constructeur -----------------------------------------------

	// methode -------------------------------------------------------

	public void run() {
		Vaisseau v1 = new Vaisseau();
		v1.name = "X-Wing";
		System.out.println(v1.name);

		VaisseauBlinde v2 = new VaisseauBlinde("Faucon Millenium", 5);
		// v2.setName("Faucon Millenium");

		System.out.println(v2.getName());

		v1.nbMissile = 5;
		v2.addMissile(2);
		v2.addMissile(-2);
		System.out.println(v2.getNbMissile());
		v2.addMissile(5);
		System.out.println(v2.getNbMissile());
		v2.addMissile(25);
		System.out.println(v2.getNbMissile());

		for (int i = 0; i < 10; i++) {
			System.out.println(v1.name + " : ");
			v1.tirer();
			System.out.println(v2.getName() + " : ");
			v2.tirer();
		}

		VaisseauBlinde v3 = new VaisseauBlinde("x-wing 3", 5);
		VaisseauBlinde v4 = new VaisseauBlinde("x-wing 4", 5);
		VaisseauBlinde v5 = new VaisseauBlinde("x-wing 5", 5);
		VaisseauBlinde v6 = new VaisseauBlinde("x-wing 6", 5);
		VaisseauBlinde v7 = new VaisseauBlinde("x-wing 7", 5);

		v3.decoller();
		v4.decoller();
		v7.decoller();
		v2.decoller();
		v5.decoller();
		v7.atterir();
		v7.atterir();
		v6.decoller();

		System.out.println(VaisseauBlinde.getNbEnVol());

	}

}