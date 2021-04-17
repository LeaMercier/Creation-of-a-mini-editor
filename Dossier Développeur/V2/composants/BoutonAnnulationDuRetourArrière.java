package composants;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import editeur.*;

public class BoutonAnnulationDuRetourArrière extends JButton implements ActionListener, EffectuAction{

	private ComponentTexte text;
	public BoutonAnnulationDuRetourArrière(ComponentTexte text) {
		super("<-");
		addActionListener(this);
		this.setSize(getPreferredSize());
		this.text = text;
	}

	/**
	 * Réeffectu les actions annulées tant qu'il y en a
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == this) {
			effectuModif();
		}
	}

	/**
	 * 
	 */
	public Dimension getPreferredSize() {
		return new Dimension((int)(MainActivity.XGLOBAL/5), (int)(MainActivity.YGLOBAL/6));
	}

	/**
	 * 
	 */
	@Override
	public void effectuModif() {
		RetourArriereEtAvant.effectuArriere();
		text.update();	
	}

}
