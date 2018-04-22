package ClasesPojos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Personaje {
	private int posicionX;
	private int posicionY;
	private int vida;
	public Personaje(int posicionX, int posicionY, int vida) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.vida = vida;
		
	}
	
	
	public static void cuerpoPersonaje(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.RED);
		g2d.fillRect(500, 50, 30, 30);
		g2d.drawRect(500, 50, 30, 30);
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
