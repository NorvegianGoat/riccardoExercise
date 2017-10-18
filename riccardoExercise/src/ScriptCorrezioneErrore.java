/*Un semplice script con correzione dell'errore da parte dell'utente*/
import java.util.Scanner;

public class ScriptCorrezioneErrore {
	public static void main (String[] args) {
		Scanner scannerTastiera = new Scanner(System.in);
		 System.out.println ("Inserisci il tuo anno di nascita");
		 int annoDiNascita = scannerTastiera.nextInt();
		 System.out.println ("Inserisci gli anni che compierai");
		 int anniCompiuti = scannerTastiera.nextInt();
		 int annoInCuiCompi = (annoDiNascita+anniCompiuti);
		 System.out.println (("Compierai questi anni nel")+(annoInCuiCompi));
	}
}