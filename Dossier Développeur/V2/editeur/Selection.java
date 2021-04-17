package editeur;

public class Selection {

	private int start;
	private int end;

	/**
	 * constructeur de la classe de sÃ©lection
	 * 
	 * @param start : le début de la sélection
	 * @param end : la fin de la sélection
	 */
	public Selection(int start, int end) {
		this.start = start;
		this.end = end;
	}

	/**
	 * setteur de start
	 * 
	 * @param start : la nouvelle valeur de start
	 */
	public void setStart(int start) {
		this.start = start;
	}

	/**
	 * setteur de end
	 * 
	 * @param end : la nouvelle valeur de end
	 */
	public void setEnd(int end) {
		this.end = end;
	}

	/**
	 * getteur de start
	 * 
	 * @return la valeur de start
	 */
	public int getStart() {
		return this.start;
	}

	/**
	 * getteur de end
	 * 
	 * @return la valeur de end
	 */
	public int getEnd() {
		return this.end;
	}
}
