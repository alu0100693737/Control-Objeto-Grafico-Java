package controlBola;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class VentanaBola extends JFrame {
	private PanelBola bola;
	private PanelBotones botones;
	
	public VentanaBola(int velocidad) {
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		bola = new PanelBola(velocidad);
		botones = new PanelBotones();
		getpnlBola().setPreferredSize(new Dimension(600, 400));
		getpnlBotones().setPreferredSize(new Dimension(600, 200));
		add(getpnlBola());
		add(getpnlBotones());
	}
	
	public PanelBola getpnlBola() {
		return bola;
	}
	
	public PanelBotones getpnlBotones() {
		return botones;
	}
	
	

}
