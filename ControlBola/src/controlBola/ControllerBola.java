package controlBola;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerBola {
	private static VentanaBola bola;
	
	public ControllerBola(int velocidad) {
		bola = new VentanaBola(velocidad);
	}

	public static VentanaBola getVentanaBola() {
		return bola;
	}
	
	//-1 para Up y Left
	public static class MoverUp implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			getVentanaBola().getpnlBola().setDiffYInicio(-1);
			getVentanaBola().getpnlBola().repaint();
		}
	}
	
	public static class MoverDown implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			getVentanaBola().getpnlBola().setDiffYInicio(1);
			getVentanaBola().getpnlBola().repaint();
		}
	}
	
	public static class MoverLeft implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			getVentanaBola().getpnlBola().setDiffXInicio(-1);
			getVentanaBola().getpnlBola().repaint();
		}
	}
	
	public static class MoverRight implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			getVentanaBola().getpnlBola().setDiffXInicio(1);
			getVentanaBola().getpnlBola().repaint();
		}
	}
}
