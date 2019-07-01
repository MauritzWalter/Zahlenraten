 

import java.util.Scanner;

public class Controll {
	
	//function to compare the values.
	public static boolean vergleich(int zahl,int input){
		boolean out=false;//set the return value to false.		
		
		// compare the values and set a new return.
		if(zahl<input){
			System.out.println("Gesuchte Zahl ist kleiner.");
		} else if(zahl>input){
			System.out.println("Gesuchte Zahl ist grÃ¶sser.");
		} else {
			System.out.println("****************************");
			System.out.println("Die gesuchte Zahl ist "+zahl);
			System.out.println("****************************");
			out=true;
		}
		
		return out;
	}
	
	//function to get a input.
	public static boolean eingabe(int zahl){
		boolean out=false;//set the return value to false.
		
		//output a question and input the value to compare.
		System.out.print("Zahl zwischen 1 und 50 eingeben: ");
		if(vergleich(zahl,new Scanner(System.in).nextInt())){
			out=true;
		}
		
		return out;
	}
	
	//main function which generate a random number.
	public static void main(String[] args) {
		int zahl = (int) (Math.random()*50+1);//random number.
		
		//is repeated until it is properly.
		do{
		}while(!eingabe(zahl));
	}
}