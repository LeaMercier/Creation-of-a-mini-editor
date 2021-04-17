package editeur;

public abstract class EspaceMemoire {

	protected String contenu;
	public EspaceMemoire (String contenu) {
		this.contenu = contenu;
	}
	
	/**
	 * Permet de r�cup�rer le contenu de l'espace m�moire
	 * @return le string contenu dand l'espace m�moire
	 */
	public abstract String get();
	
	/**
	 * Permet de remplacer le contenu de l'espace m�moire
	 * @param contenu : le nouveau contenu
	 */
	public abstract void affecte(String contenu);
}
