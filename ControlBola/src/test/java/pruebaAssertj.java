package test.java;

import controlBola.ControllerBola;
import controlBola.PanelBola;
import controlBola.PanelBotones;
import controlBola.VistaControlBola;

public class pruebaAssertj {
	public static void main(String[] args) {
		ControllerBola pruebaController = new ControllerBola(Integer.parseInt(args[0]));
		PanelBola pruebaPanelBola = new PanelBola(10);
		PanelBotones pruebaPanelBotones = new PanelBotones();
		VistaControlBola pruebaVistaControlBola = new VistaControlBola(10);
		
		//Pruebas con Clase Controller
		ControllerBolaAssert prueba1 = new ControllerBolaAssert(pruebaController);
		prueba1.hasVentanaBola(pruebaController.getVentanaBola());
		prueba1.assertThat(pruebaController);
		
		//Pruebas Clase PanelBola
		PanelBolaAssert prueba2 = new PanelBolaAssert(pruebaPanelBola);
		prueba2.assertThat(pruebaPanelBola);
		prueba2.hasDiffXInicio(0);
		prueba2.hasDiffYInicio(0);
		prueba2.hasPosInicioX(0);
		prueba2.hasPosInicioY(0);
		prueba2.hasVelocidad(pruebaPanelBola.getVelocidad());
		
		//Pruebas Panel Botones
		PanelBotonesAssert prueba3 = new PanelBotonesAssert(pruebaPanelBotones);
		prueba3.assertThat(pruebaPanelBotones);
		prueba3.hasAutor(pruebaPanelBotones.getAutor());
		
		//Pruebas VistaControlBola
		VistaControlBolaAssert prueba4 = new VistaControlBolaAssert(pruebaVistaControlBola);
		prueba4.assertThat(pruebaVistaControlBola);
	}
}
