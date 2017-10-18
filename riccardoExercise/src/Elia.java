import java.util.Scanner;

public class Elia {
	public static void main (String[] args) {
		System.out.println ("Scrivi il tuo anno di nascita");
		Scanner inputTastiera = new Scanner(System.in);
		int annoDiNascita = inputTastiera.nextInt();
		System.out.println ("Scrivi i tuoi anni");
		int anniDellUtente = inputTastiera.nextInt();
		int annoInCuiSiCompionoGliAnni = ( anniDellUtente + annoDiNascita );
		System.out.println ("compierai questi anni nel:"+ (annoInCuiSiCompionoGliAnni));
	}
}	