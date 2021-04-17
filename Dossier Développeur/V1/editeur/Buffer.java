package editeur;

public class Buffer extends EspaceMemoire {

	private Selection selection;
	public Buffer(String contenu, Selection selection) {
		super(contenu);
		this.selection = selection;
	}

	/**
	 * @return la valeur du String stocké dans le buffer
	 */
	@Override
	public String get() {
		return this.contenu;
	}

	/**
	 * @param valeur : nouvelle valeur du Buffer
	 */
	@Override
	public void affecte(String valeur) {
		this.contenu = valeur;
	}
	
	/**
	 * Permet de mettre à jour la sélection de l'utilisateur
	 * @param start : le début de la nouvelle sélection
	 * @param end : la fin de al nouvelle sélection
	 */
	public void updateSelection(int start, int end) {
		this.selection.setStart(start);
		this.selection.setEnd(end);
	}
	
}
