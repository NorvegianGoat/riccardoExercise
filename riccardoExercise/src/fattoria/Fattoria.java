package fattoria;
import java.util.HashSet;
import java.util.Set;

import fattoria.animali.Cane;


/**
 * Implementazione di una fattoria di animali
 * @author Ale
 * 
 * @version 1.0
 *
 */
public class Fattoria {
	
	//ECCO la encapsulation
	private Set<Animale> animali;
	private Contadino proprietario;
	
	public Fattoria() {
		animali = new HashSet<Animale>();
		proprietario = new Contadino("Zio Tobia");
	}
	 
	/**
	 * Aggiungi un animale alla fattoria
	 * @param inputAnimale
	 */
	public void aggiungiAnimale(Animale inputAnimale){
		animali.add(inputAnimale);
	}
	
	
	/**
	 * Elenca tutti
	 */
	public void faiAppello(){
		System.out.println("Appello fattoria: ");
		for (Animale animale : animali) {
			//ECCO il polimorfismo
			animale.emettiVerso();
			
			if (animale instanceof Cane)
				((Cane)animale).incazzati();
		}
		System.out.println("Proprietario: ");
		//in fondo anche Zio Tobia e` un animale
		proprietario.emettiVerso();
	}
	

}
