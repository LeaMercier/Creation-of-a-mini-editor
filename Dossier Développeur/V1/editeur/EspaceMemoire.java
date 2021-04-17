package editeur;

public abstract class EspaceMemoire {

	protected String contenu;
	public EspaceMemoire (String contenu) {
		this.contenu = contenu;
	}
	
	/**
	 * Permet de récupérer le contenu de l'espace mémoire
	 * @return le string contenu dand l'espace mémoire
	 */
	public abstract String get();
	
	/**
	 * Permet de remplacer le contenu de l'espace mémoire
	 * @param contenu : le nouveau contenu
	 */
	public abstract void affecte(String contenu);
}
