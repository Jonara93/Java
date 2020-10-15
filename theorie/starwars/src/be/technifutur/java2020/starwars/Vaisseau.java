package be.technifutur.java2020.starwars;

public class Vaisseau {

	// champs ----------------------------------

	public String name;
	public int nbMissile;

	// constructeur ---------------------------------

	// method -------------------------------------

	// tirer un missile
	public void tirer() {

		if (this.nbMissile <= 0) {
			System.out.println("Pouf");
		} else {
			System.out.println("Pan");
			this.nbMissile--;
		}
	}
}