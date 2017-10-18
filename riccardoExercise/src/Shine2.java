import java.util.Scanner;

public class Shine2 {
	public static void main (String[] args) {
		/*Presentazione programma*/
		System.out.println ("Ciao sono Capra e questo e' il nuovo programma");
		System.out.println ("Calcolo l'area di un triangolo rettangolo");
		/*Dati*/
		System.out.println ("Inserisci la base");
		Scanner in = new Scanner(System.in);
		double base = in.nextDouble();
		System.out.println  ("Inserisci l'altezza");
		double altezza = in.nextDouble();
		System.out.println ("Calcolo l'area..." + ((base*altezza/2)));
	}
	
}	