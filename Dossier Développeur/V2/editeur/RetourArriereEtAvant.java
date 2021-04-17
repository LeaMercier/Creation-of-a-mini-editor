package editeur;

import java.util.LinkedList;
import java.util.List;

public class RetourArriereEtAvant {
	
	private static LinkedList<ModifieTexte> actionEfectuees = new LinkedList<ModifieTexte>();
	private static LinkedList<ModifieTexte> actionAnulees = new LinkedList<ModifieTexte>();
	
	public static void addAction(ModifieTexte action) {
		actionEfectuees.add(action);
	}
	
	public static void effectuArriere() {
		if (!actionEfectuees.isEmpty()) {
			ModifieTexte lastElement = actionEfectuees.pollLast();
			actionAnulees.add(lastElement);
			lastElement.undo();		
		}
	}
	
	public static void effectuAvant() {
		if (!actionAnulees.isEmpty()) {
			ModifieTexte lastElement = actionAnulees.pollLast();
			actionEfectuees.add(lastElement);
			lastElement.redo();
		}		
	}
}
