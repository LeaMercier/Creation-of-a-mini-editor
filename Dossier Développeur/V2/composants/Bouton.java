package composants;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import editeur.Buffer;
import editeur.Copier;
import editeur.PressePapier;
import editeur.Selection;

public abstract class Bouton extends JButton implements ActionListener{
	
	PressePapier cache;
	Selection selection;
	Buffer buffer;
	
	public Bouton (PressePapier cache, Selection selection, Buffer buffer) {
		super();
		this.cache = cache;
		this.selection = selection;
		this.buffer = buffer;
	}
	
	public Bouton (String nom,PressePapier cache, Selection selection, Buffer buffer) {
		super(nom);
		this.cache = cache;
		this.selection = selection;
		this.buffer = buffer;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == this) {
			effectuModif();
		}	
	}
	

	
	/**
	 * Permet de définir la taille du bouton pour l'affichage
	 */
	public Dimension getPreferredSize() {
		return new Dimension((int)(MainActivity.XGLOBAL/3), (int)(MainActivity.YGLOBAL/6));
	}
	
	/**
	 * Permet d'effectuer les modifications appliquées par le bouton
	 */
	public abstract void effectuModif();
}
