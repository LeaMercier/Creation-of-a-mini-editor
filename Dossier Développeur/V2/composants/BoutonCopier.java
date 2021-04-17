package composants;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import editeur.*;

public class BoutonCopier extends Bouton {

	
	public BoutonCopier (PressePapier cache, Selection selection, Buffer buffer) {
		super("copier", cache, selection, buffer);
		addActionListener(this);
		this.setSize(getPreferredSize());
	}

	/**
	 * Permet d'effectuer les modifications appliquées par le bouton copier
	 * C'est à dire qu'on appelle la fonction copier 
	 * sur une nouvelle instance de la classe Copier
	 */
	@Override
	public void effectuModif() {
		new Copier(cache, selection, buffer).copier();	
	}

}
