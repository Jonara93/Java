package be.technifutur.java2020.projetaidemem;

public class Permutation2Variable {
	
	public static void main(String[] args){
		
		int x = 2;
		int y = 3;
		int temp;
		
		System.out.println("x vaut :" + x);
		System.out.println("y vaut :" + y);
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x vaut :" + x);
		System.out.println("y vaut :" + y);
		
	}
	
}