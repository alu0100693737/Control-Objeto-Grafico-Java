package controlBola;

import javax.swing.JFrame;

public class Principal {
	public static void main(String[] args) {
		VentanaBola prueba = new VentanaBola();
		prueba.setTitle("TestCaracteristicasComunes");
		prueba.setSize(600, 600);
		prueba.setLocationRelativeTo(null); // Center the frame
		prueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prueba.setResizable(false);
		prueba.setVisible(true);
	}
}
