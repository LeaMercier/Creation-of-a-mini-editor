package composants;

import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.event.*;

import editeur.*;
import V2.*;

public class Window extends Frame{

	class Global extends WindowAdapter {
		
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	private double x;
	private double y;
	public Window (double x, double y) {
		setTitle("Editeur de texte, groupe Blandel-Mercier");
		this.x = x;
		this.y = y;
		setSize((int)x,(int)y);
		addWindowListener(new Global());
	}
	
	/**
	 * Fonction permettant d'initialiser la fonction que l'on va afficher
	 */
	public void init() {
		/**
		 * Intialisation des variables utilisées dans tout le programme
		 */
		PressePapier cache = new PressePapier("");
		Selection selection = new Selection(0,0);
		Buffer memoire = new Buffer("", selection);
		ComponentTexte texte = new ComponentTexte(selection, memoire);
		BoutonCopier copier = new BoutonCopier(cache, selection, memoire);
		BoutonColler coller = new BoutonColler(cache, selection, memoire, texte);
		BoutonCouper couper = new BoutonCouper(cache, selection, memoire, texte);
		
		/**
		 * Mise en place de la fenêtre d'affichage
		 */

		GridBagLayout gl = new GridBagLayout();
		GridBagConstraints glc = new GridBagConstraints();
		glc.gridx = 1;
		setLayout(gl);
	    gl.setConstraints(texte, glc);
		add(texte);
		Panel p = new Panel();
		p.add(copier);
		p.add(coller);
		p.add(couper);
	    gl.setConstraints(p, glc);
		add(p);
		pack();
		show();
	}
}
