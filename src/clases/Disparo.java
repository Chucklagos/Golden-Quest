package clases;

import implementacion.Juego;
import javafx.scene.canvas.GraphicsContext;

public class Disparo extends Item {

	public Disparo(int x, int y, int velocidad, String indiceImagen) {
		super(x, y, velocidad, indiceImagen);
	}

	public void mover() {
		if (Juego.accion) {
			//this.velocidad = 10;
			this.indiceImagen = "hacha";
		}else {
			//this.velocidad = 8;
			this.indiceImagen = "hacha";
		}

		if (Juego.derecha)
			x+=velocidad;

		if (Juego.izquierda)
			x+=velocidad;

	}
	

}