package composants;

import java.awt.*;
import java.awt.event.*;
import editeur.*;

public class ComponentTexte extends TextArea implements MouseMotionListener, TextListener, KeyListener {

	private Selection selection;
	private Buffer memoire;
	boolean update = false;
	public ComponentTexte(Selection selection, Buffer memoire) {
		this.selection = selection;
		this.memoire = memoire;
		this.setEditable(true);
	    this.addMouseMotionListener(this);
	    addTextListener(this);
		this.setSize(getPreferredSize());

	}

	public Dimension getPreferredSize() {
		return new Dimension((int)(MainActivity.XGLOBAL), (int)(MainActivity.YGLOBAL*5/6));
	}
	
	/**
	 * 
	 * @param selection
	 */
	public void updateSelection(Selection selection) {
		selection.setEnd(this.getSelectionEnd());
		selection.setStart(this.getSelectionStart());
	}
	
	/**
	 * 
	 * @param buffer
	 */
	public void updateBuffer(Buffer buffer) {
		buffer.affecte(this.getText());
	}

	/**
	 * met à jour la selection
	 */
	@Override
	public void mouseDragged(MouseEvent e) {
		updateSelection(selection);
	}

	/**
	 * met la jour à la selection
	 */
	@Override
	public void mouseMoved(MouseEvent e) {		
		updateSelection(selection);
	}

	@Override
	public void textValueChanged(TextEvent e) {
		updateBuffer(memoire); 
		if (!update) {
			Texte tmp = new Texte(memoire);
			tmp.addTexte(memoire.get());
		}
	}
	
	public void update() {
		update = true;
		this.setText(memoire.get());
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		update = false;
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	
}
