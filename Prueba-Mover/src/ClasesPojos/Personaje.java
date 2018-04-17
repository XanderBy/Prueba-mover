package ClasesPojos;

import java.awt.Color;
import java.awt.Graphics;

public class Personaje {
	private int posicionX;
	private int posicionY;
	private int vida;

	public Personaje(int posicionX, int posicionY, int vida) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.vida = vida;
	}

	

	public int getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

}
