/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 11/04/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Control de una Bola en pantalla mediante botones.
 * Panel de Botones.
 * 
 * Uso de Excepciones propias y JFrame
 */

package controlBola;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelBotones extends JPanel {

	private JButton btnUp;
	private JButton btnDown;
	private JButton btnLeft;
	private JButton btnRight;
	private JTextField txtAutor;

	private final static int tamanoXporDefecto = 600;
	private final static int tamanoYporDefecto = 200;

	private static final int ESPACIADO_EXTRA_AUTOR = 150;
	private static final int BUTTON_LOCATION_X = 250;  // location x 
	private static final int BUTTON_LOCATION_Y = 50;   // location y 
	private static final int BUTTON_SIZE_X = 100;      // size height
	private static final int BUTTON_SIZE_Y = 30;       // size width
	private static final int ESPACIO_HORIZONTAL = 60;
	private static final int ESPACIO_VERTICAL = 40;

	public PanelBotones() {

		setLayout(null);
		setSize(new Dimension(tamanoXporDefecto, tamanoYporDefecto));
		setPreferredSize(new Dimension((int)getSize().getWidth(), (int)getSize().getHeight()));
		btnUp = new JButton("Up");
		btnDown = new JButton("Down");
		btnLeft = new JButton("Left");
		btnRight = new JButton("Right");
		txtAutor = new JTextField("Autor: Iv�n Garc�a Campos");

		//btnLocalizacionX = (int)(getSize().getWidth()/2 - BUTTON_SIZE_X/2);
		System.out.println("Button " + BUTTON_LOCATION_X);
		getbtnUp().setBounds(BUTTON_LOCATION_X, 0
				, BUTTON_SIZE_X, BUTTON_SIZE_Y );
		getbtnLeft().setBounds(BUTTON_LOCATION_X - BUTTON_LOCATION_Y, ESPACIO_VERTICAL, 
				BUTTON_SIZE_X, BUTTON_SIZE_Y );
		getbtnRight().setBounds(BUTTON_LOCATION_X + ESPACIO_HORIZONTAL, ESPACIO_VERTICAL, 
				BUTTON_SIZE_X, BUTTON_SIZE_Y );
		getbtnDown().setBounds(BUTTON_LOCATION_X, ESPACIO_VERTICAL + ESPACIO_VERTICAL
				, BUTTON_SIZE_X, BUTTON_SIZE_Y );
		getAutor().setHorizontalAlignment(JTextField.CENTER);
		getAutor().setBounds(BUTTON_LOCATION_X-BUTTON_LOCATION_Y, ESPACIO_VERTICAL + ESPACIO_VERTICAL + ESPACIO_VERTICAL,
				ESPACIADO_EXTRA_AUTOR + ESPACIO_HORIZONTAL, ESPACIO_VERTICAL);

		getbtnUp().addActionListener(new ControllerBola.MoverUp());
		getbtnDown().addActionListener(new ControllerBola.MoverDown());
		getbtnLeft().addActionListener(new ControllerBola.MoverLeft());
		getbtnRight().addActionListener(new ControllerBola.MoverRight());
		add(getbtnUp());
		add(getbtnDown());
		add(getbtnLeft());
		add(getbtnRight());
		add(getAutor());
	}

	public JButton getbtnUp() {
		return btnUp;
	}

	public JButton getbtnDown() {
		return btnDown;
	}

	public JButton getbtnLeft() {
		return btnLeft;
	}

	public JButton getbtnRight() {
		return btnRight;
	}

	public JTextField getAutor() {
		return txtAutor;
	}
}
