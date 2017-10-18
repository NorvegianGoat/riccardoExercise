package fattoria;

/**
 * Classe astratta
 * 
 * @author Ale
 *
 */
public abstract class Animale {

	private String nome;

	/**
	 * assumiamo che siano animali domestici, ovvero che TUTTI abbiano, almeno,
	 * un nome
	 * 
	 * @param nomeAnimale
	 */
	public Animale(String nomeAnimale) {
		nome = nomeAnimale;
	}

	/**
	 * Def. getter
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Def. setter
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * gli animali abbaiano, miagolano, nitriscono, chissa`. Richiediamo a chi
	 * eredita l'implementazione
	 */
	public abstract void emettiVerso();
}
