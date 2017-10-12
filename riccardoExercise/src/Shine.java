import java.util.Scanner;

public class Shine {
	public static void main(String[] args) {
		/* Presentazione programma */
		System.out.println(
				"Ciao sono Capra, dopo un'ora di ripetizioni di analisi ho ben pensato di fare un programmino in java");
		System.out.println("Scrivi la dimensione del lato di un quadrato, io calcolero' le dimensioni dell'area...");
		/* Istanzio scanne per lettura input utente */
		Scanner in = new Scanner(System.in);
		try {
			double secondoNumero = in.nextDouble();
			/* Calcolo e presentazione risultato tramite funzionalita` privata */
			System.out.println("Calcolo l'area");
			System.out.println(("L'area è: ") + calculateSquareArea(secondoNumero));
			//tutto OK, ciao ciao
		} catch (Exception seiUnCretino) {
			System.out.println("Ti ho chiesto un numero, cazzo!!");
			System.out.println("Tanto perche` tu capisca, questo e` quello che hai causato: " + seiUnCretino.toString());
			System.out.println("Adesso muoio senza aver fatto nulla, pentiti.");
		}

	}

	// questo e` un metodo privato, non visibile dal mondo
	private static double calculateSquareArea(double sideLenght) {
		return Math.pow(sideLenght, 2);
	}
}
