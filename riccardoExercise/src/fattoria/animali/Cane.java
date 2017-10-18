package fattoria.animali;

import fattoria.Animale;

//ECCO l'INHERITANCE
public class Cane extends Animale {

	/**
	 * Delego al costruttore di animale basato sul nome, che mi va bene
	 * @param string
	 */
	public Cane(String string) {
		super(string);
	}

	@Override
	public void emettiVerso() {
		System.out.println(getNome() + ":" + " BAU BAU");
	}
	
	public void incazzati() {
		System.out.println(getNome() + ":" + " WARF!!WARF!! GHRRRRRRR");
	}

}
