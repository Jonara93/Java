package be.technifutur.java2020.structure; // correspond au nom des dossiers à partir de src --> séparé par des "."
import java.util.Scanner;

public class Main{
	
	public static void main(String... args){
		
		System.out.println("Exercice Pile");
		
		Pile maPile = new Pile(); // instanciation de la structure Pile
		int sizeMaPile;
		int readValPile;
		int posRead = 2;
		int posRemove;
		Scanner in = new Scanner(System.in);
		
		maPile.valeur = 10;
		
		//ajouter une pile
		maPile = add(maPile, 51);
		maPile = add(maPile, 154);		
		maPile = add(maPile, 74);		
		maPile = add(maPile, 94);		
		maPile = add(maPile, 25);		
		
		//show all element in maPile
		display(maPile);
		
		//size of the pile
		sizeMaPile = sizePile(maPile);
		System.out.println();
		System.out.println("La pille à une taille de : " + sizeMaPile);
		
		//read an element
		readValPile = read(maPile, posRead);
		System.out.println("La valeur en position "+(posRead+1)+" est : "+readValPile);
		
		System.out.println("Insérer la position de la valeur à supprimer");
		posRemove = in.nextInt() - 1;
		//remove function
		maPile = remove(maPile, posRemove);
		
		//show all element in maPile
		display(maPile);
		
		//reverse pile
		System.out.println();
		maPile = reverse(maPile);
		display(maPile);
		
		
	}//end main
	
	public static Pile add(Pile p,int valeur){
		Pile newPile = new Pile();
		newPile.valeur = valeur;
		newPile.suivant = p;
		
		return newPile;		
		
	}
	
	public static int sizePile(Pile p){
		
		int size = 0;
		
		while (p != null) {
			size++;
			p = p.suivant;
		}
		
		return size;
		
	}
	
	public static void display(Pile p){
		while (p != null) {
			System.out.print(p.valeur+" ");
			p = p.suivant;
		}
	}
	
	public static int read(Pile p, int pos){
		int val;
		
		while(pos > 0){
			p = p.suivant;
			pos--;
		}
		val = p.valeur;
		
		return val;
	}
	
	public static Pile remove(Pile p, int pos){		
		
		if (pos == 0){
			System.out.println("La valeur supprimée est : "+ p.valeur);
			p = p.suivant;
		}else {
			Pile tp = new Pile();
			tp = p;
			while(pos > 1){
				tp = tp.suivant;
				pos--;
			}
			System.out.println("La valeur supprimée est : "+ tp.suivant.valeur);
			tp.suivant = tp.suivant.suivant;
		}	
		
		return p;
	}
	
	public static Pile reverse(Pile p){
	
		Pile pRetour = null;
	
		while(p!= null){
			pRetour = add(pRetour,p.valeur);
			p = p.suivant;
		}	
	
		return pRetour;
	}
	
	
	
}// end Main