package editeur;

public class Couper extends Action{

	public Couper(PressePapier cache, Selection selection, Buffer buffer) {
		super(cache, selection, buffer);
	}
	
	/**
	 * Permet d'affecter la valeur de la sélection au cache et de l'enlever du buffer
	 */
	public void couper () {
		//on met la selection dans le cache (le presse papier)
		cache.affecte(buffer.get().substring(selection.getStart(), selection.getEnd()));
		//puis on affecte au buffer la valeur de base avec la selection en moins
		buffer.affecte((buffer.get().substring(0,selection.getStart()) + buffer.get().substring(selection.getEnd())));
	}
}
