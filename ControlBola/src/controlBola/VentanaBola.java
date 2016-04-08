package controlBola;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class VentanaBola extends JFrame {
	private PanelBola bola;
	private PanelBotones botones;
	public VentanaBola() {
		setLayout(new GridLayout(2, 1, 5, 5));
		bola = new PanelBola();
		botones = new PanelBotones();
		add(bola);
		add(botones);
	}

}
