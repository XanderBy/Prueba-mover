package Modelo;

import java.awt.Dimension;
import java.awt.Toolkit;

public class MetodosBasicosPersonaje {
	public static void moverAdelante(Personaje p) {

		if (p.getPosicionY() != 0) {
			p.setPosicionY(p.getPosicionY() - 10);
		}

	}

	public static void moverAbajo(Personaje p) {
		Dimension tamañoPantalla = Toolkit.getDefaultToolkit().getScreenSize();// hace que tenga el tamaño de la
		// pantalla

		if (p.getPosicionY() != tamañoPantalla.height-130) {
			p.setPosicionY(p.getPosicionY() + 10);
		}
	}

	public static void moverDerecha(Personaje p) {
		Dimension tamañoPantalla = Toolkit.getDefaultToolkit().getScreenSize();// hace que tenga el tamaño de la
		// pantalla

		if (p.getPosicionX() != tamañoPantalla.width-50) {
			p.setPosicionX(p.getPosicionX() + 10);
		}
	}

	public static void moverIzquierda(Personaje p) {

		if (p.getPosicionX() != 0) {
			p.setPosicionX(p.getPosicionX() - 10);
		}
	}

}
