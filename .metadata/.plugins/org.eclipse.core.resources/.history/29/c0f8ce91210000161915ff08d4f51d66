/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 11/04/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Control de una Bola en pantalla mediante botones.
 * Panel para la representacion de la bola. Contiene la logica para el movimiento.
 * 
 * Uso de Excepciones propias y JFrame
 */

package controlBola;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelBola extends JPanel {
	
	private final int RADIO = 50;
	
	private final static int tamanoXporDefecto = 600;
	private final static int tamanoYporDefecto = 400;
	//puede ser reescalable
	private int PosInicioX;
	private int PosInicioY;
	private int diffXInicio;
	private int diffYInicio;
	private static int velocidad;
	
	public PanelBola(int vel) {
		setBackground(Color.CYAN);	
		diffXInicio = 0;
		diffYInicio = 0;
		velocidad = vel;
		setPreferredSize(new Dimension(tamanoXporDefecto, tamanoYporDefecto));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//bola
		PosInicioX = (int)getSize().getWidth()/2;
		PosInicioY = (int)getSize().getHeight()/2;
		setPreferredSize(new Dimension((int)getSize().getWidth()/2, (int)getSize().getHeight()/2));
		g.setColor(Color.RED);
		
		//Reescalable en Y Height
		if (((PosInicioY + (diffYInicio - getVelocidad()) < 0))) {
			//diffYInicio = 2;
			g.fillOval(PosInicioX + getDiffXInicio(), 0, RADIO, RADIO);
		} else if (((PosInicioX + (diffXInicio - getVelocidad()) < 0))) {
			g.fillOval(0, PosInicioY + getDiffYInicio(), RADIO, RADIO);
		}else {
			g.fillOval(PosInicioX + getDiffXInicio(), PosInicioY + getDiffYInicio(), RADIO, RADIO);
		}		
	}
	
	public int getDiffXInicio() {
		return diffXInicio;
	}
	
	public int getDiffYInicio() {
		return diffYInicio;
	}
	
	//valor -1 para left 1 para right
	public void setDiffXInicio(int val) {
		//posibilidad reescalado
				PosInicioX = (int) getSize().getWidth()/2;
				System.out.println("Tamaño ventana anchura" + getSize().getWidth());
				int aux = diffXInicio + val * getVelocidad();
				if ((val == -1 && (PosInicioX + aux) > 0) || (val == 1 && (PosInicioX - aux) > RADIO)) {
					diffXInicio = aux;
					System.out.println("X: " + PosInicioX + " " + diffXInicio);
					repaint();
				}
	}
	
	//valor -1 para up, 1 para down
	public void setDiffYInicio(int val) {
		//posibilidad reescalado
		PosInicioY = (int) getSize().getHeight()/2;
		System.out.println("Tamaño ventana altura" + getSize().getHeight());
		int aux = diffYInicio + val * getVelocidad();
		if ((val == -1 && (PosInicioY + aux) >= 0) || (val == 1 && (PosInicioY - aux) > RADIO)) {
			diffYInicio = aux;
			System.out.println("Y: " + PosInicioY + " " + diffYInicio);
			repaint();
		}
	}
	
	public static int getVelocidad() {
		return velocidad;
	}
}
