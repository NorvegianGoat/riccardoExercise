import fattoria.Animale;
import fattoria.Fattoria;
import fattoria.animali.Cane;
import fattoria.animali.Gallina;
import fattoria.animali.Mucca;

public class FattoriaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nella vecchia fattoria ia ia OOObjectOriented");

		Fattoria fattoriaDiTest = creaFattoriaDiTest(3);
	
		fattoriaDiTest.faiAppello();
	}

	/**
	 * Test method, create a fake farm
	 * @return
	 */
	public static Fattoria creaFattoriaDiTest(int numGalline) {
		Fattoria fattoriaDiTest = new Fattoria();
		
		Animale fido = new Cane("Fido");
		fattoriaDiTest.aggiungiAnimale(fido);
		
		Animale erminia = new Mucca("erminia");
		fattoriaDiTest.aggiungiAnimale(erminia);
		
		Animale matilde = new Mucca("Matilde");
		fattoriaDiTest.aggiungiAnimale(matilde);
		
		
		for (int i = 0; i < numGalline; i++) {
			Animale pita= new Gallina("Gallina "+i);
			fattoriaDiTest.aggiungiAnimale(pita);
		}
		return fattoriaDiTest;
	}
}
