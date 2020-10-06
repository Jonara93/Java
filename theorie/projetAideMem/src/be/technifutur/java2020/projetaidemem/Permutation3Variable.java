package be.technifutur.java2020.projetaidemem;

public class Permutation3Variable {
	
	public static void main(String[] args){
		
		int x = 3;
		int y = 5;
		int z = 1;
		int temp;
		
		System.out.println("x vaut :" + x);
		System.out.println("y vaut :" + y);
		System.out.println("z vaut :" + z);
		
		temp = x;
		x = y;
		y = z;
		z = temp;
		
		System.out.println("x vaut :" + x);
		System.out.println("y vaut :" + y);
		System.out.println("z vaut :" + z);
		
	}
	
}