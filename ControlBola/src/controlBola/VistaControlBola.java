/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 11/04/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Control de una Bola en pantalla mediante botones.
 * Clase que contiene un PanelBola y PanelBotones. 
 * Extiende de JFrame
 * Uso de Excepciones propias y JFrame
 */

package controlBola;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class VistaControlBola extends JFrame {
	private PanelBola bola;
	private PanelBotones botones;

	public VistaControlBola(int velocidad) {
		setLayout(new BorderLayout(5, 5));
		bola = new PanelBola(velocidad);
		botones = new PanelBotones();
		add(getpnlBola(), BorderLayout.CENTER);
		add(getpnlBotones(), BorderLayout.SOUTH);
		
	}

	public PanelBola getpnlBola() {
		return bola;
	}

	public PanelBotones getpnlBotones() {
		return botones;
	}
}
