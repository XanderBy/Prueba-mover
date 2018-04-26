package Vista;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import Modelo.MetodosBasicosPersonaje;
import Modelo.Personaje;

public class Pantalla extends JFrame implements KeyListener, Runnable {

	Dimension tamañoPantalla = Toolkit.getDefaultToolkit().getScreenSize();// hace que tenga el tamaño de la pantalla
	Personaje p = new Personaje(tamañoPantalla.width / 2, tamañoPantalla.height / 2, 10);

	private Canvas canvas;
	private Thread thread;// Se crea un hilo para poder permitir procesos secundarios
	private boolean running = false;
	private BufferStrategy bs;// Es el espacio que se deja en la memoria
	private Graphics g;

	public Pantalla() {
		super();
		configurarPantalla();
		addKeyListener(this);
		initComponents();
		
	}

	private void configurarPantalla() {
		this.setTitle("Prueba movimiento"); // colocamos titulo a la ventana
		this.setSize(tamañoPantalla.width, tamañoPantalla.height-50); // colocamos tamanio a la ventana (ancho, alto)
		this.setLocationRelativeTo(null); // centramos la ventana en la pantalla
		this.setResizable(true); // hacemos que la ventana no sea redimiensio.nable
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);// Para que se pueda ver la pantalla
		canvas = new Canvas();// Aun no se bien que es

		canvas.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		canvas.setMaximumSize(new Dimension(WIDTH, HEIGHT));
		canvas.setMinimumSize(new Dimension(WIDTH, HEIGHT));
		canvas.setFocusable(true);// Para poder recibir eventos por el teclado
		add(canvas);
	}
	private void initComponents() {
		
	}
	private void update() {//Aqui dentro iría cosas automaticas

	}

	private void draw() {
		bs = canvas.getBufferStrategy();

		if (bs == null) {
			canvas.createBufferStrategy(3);// Si es nulo se crearan 3 espacios en la memoria atras(renderiza)
											// medio(procesa) frente(donde muestra)
			return;
		}

		g = bs.getDrawGraphics();
		
		g.clearRect(0, 0, tamañoPantalla.width, tamañoPantalla.height);// Limpia la pantalla para que no deje rastro
		p.cuerpoPersonaje(g);// Pinta el cuerpo del personaje
		g.drawString("Primera Prueba", tamañoPantalla.width-200, tamañoPantalla.height-100);
		g.dispose();
		bs.show();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (running) {
			update();
			draw();
		}
		stop();
	}

	public void start() {
		thread = new Thread(this);// creas un hilo solo para la pantalla
		thread.start();// inicias el hilo
		running = true;
	}

	public void stop() {
		try {
			thread.join();// El hilo muere
			running = false;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.VK_W == e.getKeyCode()) {// Si la tecla presionada es igual a W

			MetodosBasicosPersonaje.moverAdelante(p);

			System.out.println(p.getPosicionY());
			repaint();// llama a paint para que siga avanzando

		}
		if (e.VK_A == e.getKeyCode()) {// Si la tecla presionada es igual a a
			MetodosBasicosPersonaje.moverIzquierda(p);
			System.out.println(p.getPosicionX());
			repaint();// llama a paint para que siga avanzando

		}
		if (e.VK_S == e.getKeyCode()) {// Si la tecla presionada es igual a s

			MetodosBasicosPersonaje.moverAbajo(p);

			System.out.println(p.getPosicionY());
			repaint();// llama a paint para que siga avanzando

		}
		if (e.VK_D == e.getKeyCode()) {// Si la tecla presionada es igual a d

			MetodosBasicosPersonaje.moverDerecha(p);

			System.out.println(p.getPosicionX());
			repaint();// llama a paint para que siga avanzando

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
