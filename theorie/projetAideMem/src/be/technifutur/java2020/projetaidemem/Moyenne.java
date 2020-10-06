package be.technifutur.java2020.projetaidemem;
import java.util.Scanner;

public class Moyenne {
	public static void main(String[] args){
		double nb1;
		double nb2;
		double nb3;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Veuillez saisir le premier nombre.");
		nb1 = in.nextInt();
		System.out.println("Veuillez saisir le deuxieme nombre.");
		nb2 = in.nextInt();
		System.out.println("Veuillez saisir le troisieme nombre.");
		nb3 = in.nextInt();
		
		System.out.println("La moyenne vaut : " + ( (nb1+nb2+nb2 )/3));
		
		
	}
	
}