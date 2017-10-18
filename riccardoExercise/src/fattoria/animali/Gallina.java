package fattoria.animali;

import fattoria.Animale;

//ECCO l'INHERITANCE
public class Gallina extends Animale {

	/**
	 * Delego al costruttore di animale basato sul nome, che mi va bene
	 * @param string
	 */
	public Gallina(String string) {
		super(string);
	}

	@Override
	public void emettiVerso() {
		System.out.println(getNome() + ":" + " CO CO CO");
	}

}
