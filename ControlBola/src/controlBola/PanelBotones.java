package controlBola;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotones extends JPanel {
	
	private JButton btnUp;
	private JButton btnDown;
	private JButton btnLeft;
	private JButton btnRight;
	public PanelBotones() {
		setLayout(new GridLayout(4, 1));
		btnUp = new JButton("Up");
		btnDown = new JButton("Down");
		btnLeft = new JButton("Left");
		btnRight = new JButton("Right");
		
		add(getbtnUp());
		add(getbtnDown());
		add(getbtnLeft());
		add(getbtnRight());
		
	}
	
	public JButton getbtnUp() {
		return btnUp;
	}
	
	public JButton getbtnDown() {
		return btnDown;
	}
	
	public JButton getbtnLeft() {
		return btnLeft;
	}

	public JButton getbtnRight() {
		return btnRight;
	}
}
