package Pantalla;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;

import ClasesPojos.Personaje;

public class Pantalla extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3117915633234918734L;
	Dimension tama�oPantalla = Toolkit.getDefaultToolkit().getScreenSize();// hace que tenga el tama�o de la pantalla
	Graphics cuerpo= null;
	public Pantalla() {
		super();
		configurarPantalla();
		inicializarComponentes();
	}

	private void configurarPantalla() {
		this.setTitle("Prueba movimiento"); // colocamos titulo a la ventana
		this.setSize(tama�oPantalla.width, tama�oPantalla.height); // colocamos tamanio a la ventana (ancho, alto)
		this.setLocationRelativeTo(null); // centramos la ventana en la pantalla
		this.setLayout(null); // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
		this.setResizable(false); // hacemos que la ventana no sea redimiensio.nable
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	public void paint(Graphics g) {
		Personaje.cuerpoPersonaje(g);
		

	}
	
	private void inicializarComponentes() {
		// Aqui dentro iria todos los componentes graphics para pintar algo e intentar
		// moverlo
		
	}

}
