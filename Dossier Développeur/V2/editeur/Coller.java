package editeur;

import editeur.RetourArriereEtAvant;
public class Coller extends Action implements ModifieTexte{

	private String sauvegarde;
	private String annulation;
	
	public Coller(PressePapier cache, Selection selection, Buffer buffer) {
		super(cache, selection, buffer);
		sauvegarde = buffer.get();
		annulation = buffer.get();
	}
	
	/**
	 * affecte la valeur du cache au buffer
	 */
	public void coller () {
		RetourArriereEtAvant.addAction(this);
		buffer.affecte(buffer.get().substring(0,selection.getStart()) + cache.get() +buffer.get().substring(selection.getEnd()));
	}

	/**
	 * Permet d'annuler l'action de coller
	 * enregistre l'état précédent du texte
	 */
	@Override
	public void undo() {
		annulation = buffer.get();
		buffer.affecte(sauvegarde);
	}

	/**
	 * Permet de renoncer à l'annulation de l'action de coller
	 */
	@Override
	public void redo() {
		buffer.affecte(annulation);
	}
	
}
