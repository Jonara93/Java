package be.technifutur.java2020.projetaidemem;
import java.util.Scanner;  

public class Circonference {
	
	public static void main(String[] args){
		
		int rayon;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Le programme va vous afficher la circonference du cercle de rayon que vous allez saisir");
		System.out.println("Veuillez saisir un nombre entier positif");
		rayon = in.nextInt();
		in.nextLine(); 
		System.out.println("La circonference vaut : " + ( 2 * 3.14 * rayon  ));		
		
	}
	
}