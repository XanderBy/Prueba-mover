package Pantalla;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import ClasesPojos.Personaje;
import Metodos.Mover;

public class Pantalla extends JFrame implements KeyListener {
	
	/**
	 * 
	 */
	 
	private static final long serialVersionUID = 3117915633234918734L;
	Dimension tamañoPantalla = Toolkit.getDefaultToolkit().getScreenSize();// hace que tenga el tamaño de la pantalla
	Personaje p=new Personaje(tamañoPantalla.width/2, tamañoPantalla.height/2, 10);
	public Pantalla() {
		super();
		configurarPantalla();
		inicializarComponentes();
		addKeyListener(this);
		
	}
	
	private void configurarPantalla() {
		this.setTitle("Prueba movimiento"); // colocamos titulo a la ventana
		this.setSize(tamañoPantalla.width, tamañoPantalla.height); // colocamos tamanio a la ventana (ancho, alto)
		this.setLocationRelativeTo(null); // centramos la ventana en la pantalla
		this.setLayout(null); // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
		this.setResizable(true); // hacemos que la ventana no sea redimiensio.nable
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	
	public void paint(Graphics g) {//pinta el personaje
		update(g);

	}
	public void update(Graphics g) {//Actuliza
		p.cuerpoPersonaje(g);
		System.out.println("prueba");
	}
	private void inicializarComponentes() {
		// Aqui dentro iria todos los componentes graphics para pintar algo e intentar
		// moverlo
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.VK_W==e.getKeyCode()) {//Si la tecla presionada es igual a W
			Mover.moverAdelante(p);
			System.out.println(p.getPosicionY());
			repaint();//llama a paint para que siga avanzando
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
