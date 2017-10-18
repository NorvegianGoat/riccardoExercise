package fattoria.animali;

import fattoria.Animale;

public class Mucca extends Animale{

	int litriDiLatte;
	
	/**
	 * Delego al costruttore di animale basato sul nome, che mi va bene
	 * @param string
	 */
	public Mucca(String nomeAnimale) {
		super(nomeAnimale);
	}

	@Override
	public void emettiVerso() {
		System.out.println(getNome() + ":" + " BAU BAU");
	}

}
