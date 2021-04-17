package editeur;

public class PressePapier extends EspaceMemoire {

	public PressePapier(String contenu) {
		super(contenu);
	}

	/**
	 * Permet d'obtenir le contenu du presse papier
	 */
	@Override
	public String get() {
		return this.contenu;
	}

	/**
	 * Permet de modifier le contenu du presse papier
	 * @param affectation : la nouvelle valeur 
	 */
	@Override
	public void affecte(String affectation) {
		this.contenu = affectation;
	}

}
