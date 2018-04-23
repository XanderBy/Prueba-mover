package Eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import ClasesPojos.Personaje;
import Metodos.Mover;

public class Eventos implements KeyListener {
	Personaje p=new Personaje(0, 0, 0);
		@Override
		public void keyPressed(KeyEvent e) {
			adelanteKeyPressed(e);
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}  
		
	
	private void adelanteKeyPressed(KeyEvent e) {                                   
	       Mover.moverAdelante(p);
	       
	    }

}
