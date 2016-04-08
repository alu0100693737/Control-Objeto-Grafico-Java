package controlBola;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotones extends JPanel {
	
	private JButton btnUp;
	private JButton btnDown;
	private JButton btnLeft;
	private JButton btnRight;
	private static final int BUTTON_LOCATION_X = 250;  // location x 
	private static final int BUTTON_LOCATION_Y = 50;   // location y 
	private static final int BUTTON_SIZE_X = 100;      // size height
	private static final int BUTTON_SIZE_Y = 30;       // size width
	private static final int ESPACIO_HORIZONTAL = 60;
	private static final int ESPACIO_VERTICAL = 40;
	public PanelBotones() {
		
		setLayout(null);
		setSize(new Dimension(100, 600));
		btnUp = new JButton("Up");
		btnDown = new JButton("Down");
		btnLeft = new JButton("Left");
		btnRight = new JButton("Right");
		
		getbtnUp().setBounds(BUTTON_LOCATION_X, 0
				, BUTTON_SIZE_X, BUTTON_SIZE_Y );
		getbtnLeft().setBounds(BUTTON_LOCATION_X - BUTTON_LOCATION_Y, ESPACIO_VERTICAL, 
				BUTTON_SIZE_X, BUTTON_SIZE_Y );
		getbtnRight().setBounds(BUTTON_LOCATION_X + ESPACIO_HORIZONTAL, ESPACIO_VERTICAL, 
				BUTTON_SIZE_X, BUTTON_SIZE_Y );
		getbtnDown().setBounds(BUTTON_LOCATION_X, ESPACIO_VERTICAL + ESPACIO_VERTICAL
				, BUTTON_SIZE_X, BUTTON_SIZE_Y );
		
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
