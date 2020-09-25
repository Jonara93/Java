package be.technifutur.java2020.projethello;

public class Hello {
	public static void main(String[] args){
		int a = 5; // var a:N <-5
		double b = 5.5; // var b : N <- 5.5
		boolean f = true; //var f:B <- vrai
		String texte = "toto est mignon"; // var texte:T <- toto est mignon
		
		a = a + 1; // a <- a + 1
		
		if (a < b){ // SI a < b
			System.out.println("Hello l'été !"); // afficher "Hello l'été"
		}
		else { // sinon
			System.out.println("C'est balo");
		} //finsi
		
		
	}	// end main
} //end class