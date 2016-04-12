/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 11/04/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Control de una Bola en pantalla mediante botones.
 * Prueba de la aplicacion
 * 
 * Uso de Excepciones propias y JFrame
 */

package controlBola;
//import test.java.controlBola.*;
import javax.swing.JFrame;

public class Principal {
	public static void main(String[] args) throws WrongParameterException {
		try {
			ControllerBola prueba = new ControllerBola(Integer.parseInt(args[0]));
			prueba.getVentanaBola().setTitle("Bola");
			prueba.getVentanaBola().setSize(600, 600);
			prueba.getVentanaBola().setLocationRelativeTo(null);
			prueba.getVentanaBola().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			prueba.getVentanaBola().pack();
			prueba.getVentanaBola().setVisible(true);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new WrongParameterException("Debe introducir la velocidad de la bola como argumento para ejecutar este programa");
			// TODO: handle exception
		}
	}
}
