package editeur;

public class Copier extends Action{
	
	public Copier(PressePapier cache, Selection selection, Buffer buffer) {
		super(cache, selection, buffer);
	}
	
	/**
	 * permet d'affecter la valeur du buffer comprise entre les bornes du buffer au presse papier
	 */
	public void copier () {
		cache.affecte(buffer.get().substring(selection.getStart(), selection.getEnd()));	
		System.out.println(cache.get());
	}
}
