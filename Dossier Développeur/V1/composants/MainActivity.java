package composants;

import java.awt.*;
import editeur.*;

public class MainActivity {
	
	/**
	 * Intialisation des variables globales 
	 */
	public static double YGLOBAL  = 900;
	public static double XGLOBAL = 800;
	
	public static void main(String args[]) {
		Window fenetrePrincipale = new Window(YGLOBAL, XGLOBAL);
		fenetrePrincipale.init();
	}

}
