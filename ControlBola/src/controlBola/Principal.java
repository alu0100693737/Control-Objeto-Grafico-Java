package controlBola;

import javax.swing.JFrame;

public class Principal {
	public static void main(String[] args) throws WrongParameterException {
		try {
			
		ControllerBola prueba = new ControllerBola(Integer.parseInt(args[0]));
		prueba.getVentanaBola().setTitle("Bola");
		prueba.getVentanaBola().setSize(600, 600);
		prueba.getVentanaBola().setLocationRelativeTo(null); // Center the frame
		prueba.getVentanaBola().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prueba.getVentanaBola().setResizable(false);
		prueba.getVentanaBola().setVisible(true);
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new WrongParameterException("Debe introducir la velocidad de la bola como argumento para ejecutar este programa");
			// TODO: handle exception
		}
	}
}
