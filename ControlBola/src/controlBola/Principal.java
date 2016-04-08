package controlBola;

import javax.swing.JFrame;

public class Principal {
	public static void main(String[] args) {
		ControllerBola prueba = new ControllerBola(5);
		prueba.getVentanaBola().setTitle("Bola");
		prueba.getVentanaBola().setSize(600, 600);
		prueba.getVentanaBola().setLocationRelativeTo(null); // Center the frame
		prueba.getVentanaBola().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prueba.getVentanaBola().setResizable(false);
		prueba.getVentanaBola().setVisible(true);
	}
}
