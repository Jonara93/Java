package be.technifutur.java2020.projetaidemem;
import java.util.Scanner;

public class PremierDegree {
	
	public static void main(String[] args){
		
		double a,b;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Le programme va résoudre une équation du premier degrée de type : ax + b = 0");
		System.out.println("Insérer une valeur pour a");		
		a = in.nextInt();
		System.out.println("Insérer une valeur pour b");		
		b = in.nextInt();
		
		if (a == 0) {
			if ( b == 0  ){
				System.out.println("Réponse indeterminée");
			}else{
				System.out.println("Réponse impossible");
			}
			
		} else {
			System.out.println("X vaut : " + ( (-b) / a ));
		}
		
		
		
	}
	
}