import java.util.Scanner;

public class Shine {
	public static void main (String[] args) {
		/*Presentazione programma*/
		System.out.println ("Ciao sono Capra, dopo un'ora di ripetizioni di analisi ho ben pensato di fare un programmino in java");
		System.out.println ("Scrivi la dimensione del lato di un quadrato, io calcolero' le dimensioni dell'area");
		Scanner in = new Scanner(System.in);
		double secondoNumero =	in.nextDouble ();
		System.out.println ("Calcolo l'area");
		System.out.println (("L'area e'") + (secondoNumero*secondoNumero));
	}
}
