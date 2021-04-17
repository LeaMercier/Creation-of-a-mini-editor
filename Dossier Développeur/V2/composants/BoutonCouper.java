package composants;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import editeur.*;

public class BoutonCouper extends Bouton {

	private ComponentTexte texte;
	public BoutonCouper (PressePapier cache, Selection selection, Buffer buffer, ComponentTexte texte) {
		super("couper", cache, selection, buffer);
		this.texte=texte;
		this.setSize(getPreferredSize());
		addActionListener(this);
	}

	/**
	 * Permet d'effectuer les modifications appliquées par le bouton couper
	 * C'est à dire qu'on appelle la fonction couper 
	 * sur une nouvelle instance de la classe Couper
	 */
	@Override
	public void effectuModif() {
		new Couper(cache, selection, buffer).couper();
		texte.update();		
	}
}
