package be.technifutur.java2020.starwars;

public class VaisseauBlinde{
	
	// champs ----------------------------------
	
	private String name = "Sans nom";	
	private int nbMissile;
	private boolean estEnvol = false;
	private boolean estAuSol = true;
	private static int nbEnVol = 0; // démarre à 0, augmente de 1 quand un vaisseau s'envole, et diminue de 1 quand un vaisseau atterit 

	// constructeur ---------------------------
	
	public VaisseauBlinde(String name, int nb){
		super(); // sera toujours en premier. Appel le constructeur de la classe de l'ancetre.
		this.setName(name);
		this.addMissile(nb);
	}
	
	//methode ----------------------------------
	
	// envoler
	
	// atterir
	
	// tirer un missile
	public void tirer(){
		
		if (this.nbMissile <= 0 ){
			System.out.println("Pouf");
		}else {
			System.out.println("Pan");
			this.nbMissile--;
		}
	}
	
	//ajouter des missiles
	
	public void addMissile(int nb){
		if (nb > 0){
			if (nb + this.nbMissile > 20){
				this.nbMissile= 20;
			} else {
				this.nbMissile += nb;
			}
		}
	}
	
	// décoler
	
	public void decoller(){
		if (this.estAuSol){
			System.out.println("Je m'envole !!");
			this.setEstAuSol(false);
			this.setEstEnvol(true);
		}else {
			System.out.println("Je suis déjà en vol !!");
		}
	}
	
	// atterir
	
	public void atterir(){
		if (this.estEnvol){
			System.out.println("Je me pose au sol !!");
			this.setEstEnvol(false);
			this.setEstAuSol(true);
		}else{
			System.out.println("Je suis déjà au sol !!");
		}
	}
	
	// radar
	
	public static void radar(){
		
	}
	
	
	
	//setter(donner) getter(recevoir) ----------------------------
	
	public int getNbMissile(){
		return this.nbMissile;
	}
	
	public void setName(String name){
		if(name != null && name.length()>0){
			this.name = name;
		}
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setEstEnvol(boolean bool){
		this.estEnvol = bool;
	}
	
	public boolean getEstEnvole(){
		
		return this.estEnvol;
	}
	
	
	
	public void setEstAuSol(boolean bool){
		this.estAuSol = bool;
	}
	
	public boolean getEstAuSol(){
		
		
		return this.estAuSol;
	}
	
}