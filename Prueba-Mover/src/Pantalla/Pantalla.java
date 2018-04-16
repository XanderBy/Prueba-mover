package Pantalla;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Pantalla extends JFrame {
	Dimension tamañoPantalla= Toolkit.getDefaultToolkit().getScreenSize();//hace que tenga el tamaño de la pantalla
	public Pantalla() {
		super();
		configurarPantalla();
		inicializarComponentes();
	}

	private void configurarPantalla() {
		this.setTitle("Prueba movimiento"); // colocamos titulo a la ventana
		this.setSize(tamañoPantalla.width, tamañoPantalla.height); // colocamos tamanio a la ventana (ancho, alto)
		this.setLocationRelativeTo(null); // centramos la ventana en la pantalla
		this.setLayout(null); // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
		this.setResizable(false); // hacemos que la ventana no sea redimiensionable
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void inicializarComponentes() {
		//Aqui dentro iria todos los componentes graphics para pintar algo e intentar moverlo
	}

}
