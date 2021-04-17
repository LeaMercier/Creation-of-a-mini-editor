package editeur;

public abstract class Action {
	
	protected PressePapier cache;
	protected Selection selection;
	protected Buffer buffer;
	
	Action(PressePapier cache, Selection selection, Buffer buffer){
		this.cache= cache;
		this.selection = selection;
		this.buffer = buffer;
	}
}
