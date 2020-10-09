package be.technifutur.java2020.starwars;

public class Scenario1 {

	// champs ------------------------------------------
	
	

	// constructeur -----------------------------------------------
	
	

	// methode -------------------------------------------------------
	
	public void run(){
		Vaisseau v1 = new Vaisseau();
		v1.name = "X-Wing";
		System.out.println(v1.name);
		
		VaisseauBlinde v2 = new VaisseauBlinde("Faucon Millenium", 5);
		//v2.setName("Faucon Millenium");
		System.out.println( v2.getName() );
		
		v1.nbMissile = 5;
		v2.addMissile(2);
		v2.addMissile(-2);
		System.out.println(v2.getNbMissile() );
		v2.addMissile(5);
		System.out.println(v2.getNbMissile() );
		v2.addMissile(25);
		System.out.println(v2.getNbMissile() );
		
		for (int i = 0; i < 10 ; i++){
			System.out.println(v1.name + " : ");
			v1.tirer();
			System.out.println(v2.getName() + " : ");
			v2.tirer();
		}
		
		v2.atterir();
		v2.atterir();
		v2.decoller();
		v2.decoller();
		v2.decoller();
		v2.atterir();
		v2.atterir();
		v2.atterir();
		v2.atterir();
		
	}
	
}