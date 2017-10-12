import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Shine {
	public static void main(String[] args) {
		//formato con cui voglio RAPPRESENTARE i numeri
		DecimalFormat riccardoDecimalFormat = new DecimalFormat("0.00");

		/* Presentazione programma */
		System.out.println(
				"Ciao sono Capra, dopo un'ora di ripetizioni di analisi ho ben pensato di fare un programmino in java");
		System.out.println("Scrivi la dimensione del lato di un quadrato, io calcolero' le dimensioni dell'area...");
		/* Istanzio scanner per lettura input utente */
		Scanner in = new Scanner(System.in);
		try {// provo. non si sa mai che l'utente sia stupido
			double secondoNumero = in.nextDouble();
			//Calcolo e presentazione risultato tramite funzionalita` privata
			System.out.println("Calcolo l'area, attendere prego.");
			System.out.println(("L'area del quadrato è: ") + riccardoDecimalFormat.format(calculateSquareArea(secondoNumero)));
			// tutto OK, ciao ciao			
		} catch (Exception seiUnCretino) {// utente stupido
			System.out.println("Ti ho chiesto un numero, cazzo!!");
			
			// magari quel cretino del utente ignora la virgola, spiegamoglielo
			DecimalFormatSymbols dfs = riccardoDecimalFormat.getDecimalFormatSymbols();
			// spiega all'utente cosa usare come virgola decimale
			System.out.println("Sappi che il separatore decimale e`: " + "\"" + dfs.getDecimalSeparator() + "\"");
			// digli il danno causato
			System.out
					.println("Tanto perche` tu capisca, questo e` quello che hai causato: " + seiUnCretino.toString());

			// non possiamo calcolare una minchia senza in.nextDouble(),
			// mandiamo tutto a monte
			throw new RuntimeException("Adesso muoio senza aver fatto nulla, pentiti.");
		} finally {
			//comunque vadano le cose, libero le risorse
			in.close();
			System.out.println("-Grazie e graziella, risorse liberate-");
		}

	}

	// questo e` un metodo privato, non visibile dal mondo
	private static double calculateSquareArea(double sideLenght) {
		return Math.pow(sideLenght, 2);
	}
}
