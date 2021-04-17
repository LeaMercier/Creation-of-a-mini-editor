package composants;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import editeur.*;

public class BoutonColler extends Bouton {

	private ComponentTexte texte;
	public BoutonColler (PressePapier cache, Selection selection, Buffer buffer, ComponentTexte texte) {
		super("coller", cache, selection, buffer);
		this.texte = texte;
		this.setSize(getPreferredSize());
	}
	
	/**
	 * Permet d'effectuer les modifications appliquées par le bouton coller
	 * C'est à dire qu'on appelle la fonction coller
	 * sur une nouvelle instance de la classe Coller
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void effectuModif() {
		new Coller(cache, selection, buffer).coller();
		texte.update();		
	}
}
