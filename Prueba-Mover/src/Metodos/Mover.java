package Metodos;

import ClasesPojos.Personaje;

public class Mover {

	public static void moverAdelante(Personaje p) {
		p.setPosicionY(p.getPosicionY()-10);
	}
	public static void moverAbajo(Personaje p) {
		p.setPosicionY(p.getPosicionY()+10);
	}
	public static void moverDerecha(Personaje p) {
		p.setPosicionX(p.getPosicionX()+10);
	}
	public static void moverIzquierda(Personaje p) {
		p.setPosicionX(p.getPosicionX()-10);
	}
}
