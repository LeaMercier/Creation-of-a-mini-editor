package editeur;

public class Texte implements ModifieTexte {

	private String sauvegarde;
	private String annulation;
	private Buffer buffer;
	
	public Texte(Buffer buffer) {
		sauvegarde = buffer.get();
		annulation = buffer.get();
		this.buffer = buffer;
	}
	
	public void addTexte(String texte) {
		System.out.println(texte);
		buffer.affecte(texte);
		RetourArriereEtAvant.addAction(this);
	}

	@Override
	public void undo() {
		annulation = buffer.get();
		buffer.affecte(sauvegarde);		
	}

	@Override
	public void redo() {
		buffer.affecte(annulation);		
	}

}
