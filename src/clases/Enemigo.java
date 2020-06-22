package clases;

import implementacion.Juego;
import javafx.scene.shape.Rectangle;
import clases.Jugador;

public class Enemigo extends Personaje{
	
	private boolean capturado;

	public Enemigo(int x, int y, int velocidad, String indiceImagen, int xImagen, int yImagen, int anchoImagen,
			int altoImagen) {
		super(x, y, velocidad, indiceImagen, xImagen, yImagen, anchoImagen, altoImagen);

	}

	public void mover(){
		if (Juego.accion) {
			this.velocidad = 10;
			this.indiceImagen = "fantasma";
		}else {
			this.velocidad = 8;
			this.indiceImagen = "fantasma";
		}

		if (Juego.derecha)
			x-=velocidad+10;

		if (Juego.izquierda)
			x-=velocidad+2;

		if (Juego.arriba)
			y-=velocidad;

		if (Juego.abajo)
			y+=velocidad;

		//Limitadores de pantalla
		/*if (x>=500)
			x=-120;*/

		if (y<0)
			y=0;

		if (y>=490)
			y=490;

	}

	public Rectangle obtenerRectangulo() {
		return new Rectangle(this.x, this.y, this.anchoImagen, this.altoImagen);
		
	}
	
	public boolean isCapturado() {
		return capturado;
	}

	public void setCapturado(boolean capturado) {
		this.capturado = capturado;
	}
	
	
}
