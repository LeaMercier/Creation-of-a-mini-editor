package editeur;

public class Coller extends Action{

	public Coller(PressePapier cache, Selection selection, Buffer buffer) {
		super(cache, selection, buffer);
	}
	
	/**
	 * affecte la valeur du cache au buffer
	 */
	public void coller () {
		buffer.affecte(buffer.get().substring(0,selection.getStart()) + cache.get() +buffer.get().substring(selection.getEnd()));
	}
	

}
