package controlBola;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class PanelBola extends JPanel {
	
	private final int RADIO = 50;
	private final int POS_INICIO_X = 275;
	private final int POS_INICIO_Y = 175;
	private int diffXInicio;
	private int diffYInicio;
	private static int velocidad;
	
	public PanelBola(int vel) {
		setBackground(Color.CYAN);	
		diffXInicio = 0;
		diffYInicio = 0;
		velocidad = vel;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//cara
		g.setColor(Color.RED);
		g.fillOval(POS_INICIO_X + getDiffXInicio(), POS_INICIO_Y + getDiffYInicio(), RADIO, RADIO);
	}
	
	public int getDiffXInicio() {
		return diffXInicio;
	}
	
	public int getDiffYInicio() {
		return diffYInicio;
	}
	
	//valor 0 para left 1 para right
	public void setDiffXInicio(int val) {
		diffXInicio += val * getVelocidad();
	}
	
	//valor 0 para up, 1 para down
	public void setDiffYInicio(int val) {
		diffYInicio += val * getVelocidad();
	}
	
	public static int getVelocidad() {
		return velocidad;
	}
	
	
}
