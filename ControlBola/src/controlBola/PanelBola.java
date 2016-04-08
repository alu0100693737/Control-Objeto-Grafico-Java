package controlBola;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class PanelBola extends JPanel {
	public PanelBola() {
		setBackground(Color.CYAN);	
	}
	
	public void paintComponent( Graphics g) {
		super.paintComponent( g );
		//cara
		g.setColor(Color.RED);
		g.fillOval( 275, 175, 50, 50);
	}
	

}
