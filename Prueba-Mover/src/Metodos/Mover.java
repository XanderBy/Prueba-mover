package Metodos;

import ClasesPojos.Personaje;

public class Mover {

	public static void moverAdelante(Personaje p) {
		p.setPosicionY(p.getPosicionY()-10);
	}
	public static void moverAbajo(Personaje p) {
		p.setPosicionY(p.getPosicionY()+1);
	}
	public static void moverDerecha(Personaje p) {
		p.setPosicionY(p.getPosicionX()+1);
	}
	public static void moverIzquierda(Personaje p) {
		p.setPosicionY(p.getPosicionY()-1);
	}
}
