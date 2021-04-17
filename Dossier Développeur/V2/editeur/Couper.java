package editeur;

public class Couper extends Action implements ModifieTexte{

	private String sauvegarde;
	private String annulation;
	
	public Couper(PressePapier cache, Selection selection, Buffer buffer) {
		super(cache, selection, buffer);
		sauvegarde = buffer.get();
		annulation = buffer.get();
	}
	
	/**
	 * Permet d'affecter la valeur de la sélection au cache et de l'enlever du buffer
	 */
	public void couper () {
		RetourArriereEtAvant.addAction(this);
		//on met la selection dans le cache (le presse papier)
		cache.affecte(buffer.get().substring(selection.getStart(), selection.getEnd()));
		//puis on affecte au buffer la valeur de base avec la selection en moins
		buffer.affecte((buffer.get().substring(0,selection.getStart()) + buffer.get().substring(selection.getEnd())));
	}

	/**
	 * Permet d'annuler l'action de couper
	 * enregistre l'état précédent du texte
	 */
	@Override
	public void undo() {
		annulation = buffer.get();
		buffer.affecte(sauvegarde);
	}

	/**
	 * Permet de renoncer à l'annulation de l'action de couper
	 */
	@Override
	public void redo() {
		buffer.affecte(annulation);
	}
}
