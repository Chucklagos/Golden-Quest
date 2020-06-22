package clases;

import implementacion.Juego;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Rectangle;

public class Item {

	protected int x;
	protected int y;
	protected int ancho;
	protected int alto;
	protected int velocidad;
	protected String indiceImagen;
	protected boolean capturado;


	public Item(int x, int y, int velocidad, String indiceImagen) {
		this.x = x;
		this.y = y;
		this.velocidad = velocidad;
		this.indiceImagen = indiceImagen;
		this.ancho = (int)Juego.imagenes.get(this.indiceImagen).getWidth();
		this.alto = (int)Juego.imagenes.get(this.indiceImagen).getHeight();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void mover() {
		if (Juego.accion) {
			this.velocidad = 10;
			this.indiceImagen = "boostVelocidad";
		}else {
			this.velocidad = 8;
			this.indiceImagen = "boostVelocidad";
		}

		if (Juego.derecha)
			x-=velocidad;

		if (Juego.izquierda)
			x+=velocidad;
	}

	public Rectangle obtenerRectangulo() {
		return new Rectangle(this.x, this.y, this.ancho, this.alto);
	}

	public void pintar(GraphicsContext graficos) {
		if (this.capturado)
			return;

		//graficos.strokeRect(this.x, this.y, this.ancho, this.alto);
		graficos.drawImage(Juego.imagenes.get(indiceImagen), x, y);
	}

	public boolean isCapturado() {
		return capturado;
	}

	public void setCapturado(boolean capturado) {
		this.capturado = capturado;
	}

	public boolean verificarColision0(Enemigo enemigo0) {
		if (obtenerRectangulo().intersects(enemigo0.obtenerRectangulo().getBoundsInLocal())) {
			enemigo0.setCapturado(true);
			System.out.println("Colision detectada: hacha contra enemigo #0");

			return true;
		}

		return false;
	}
	
	public boolean verificarColision1(Enemigo enemigo1) {
		if (obtenerRectangulo().intersects(enemigo1.obtenerRectangulo().getBoundsInLocal())) {
			enemigo1.setCapturado(true);
			System.out.println("Colision detectada: hacha contra enemigo #1");

			return true;
		}

		return false;
	}

	public boolean verificarColision2(Enemigo enemigo2) {
		if (obtenerRectangulo().intersects(enemigo2.obtenerRectangulo().getBoundsInLocal())) {
			enemigo2.setCapturado(true);
			System.out.println("Colision detectada: hacha contra enemigo #2");

			return true;
		}

		return false;
	}

	public boolean verificarColision3(Enemigo enemigo3) {
		if (obtenerRectangulo().intersects(enemigo3.obtenerRectangulo().getBoundsInLocal())) {
			enemigo3.setCapturado(true);
			System.out.println("Colision detectada: hacha contra enemigo #3");

			return true;
		}

		return false;
	}

	public boolean verificarColision4(Enemigo enemigo4) {
		if (obtenerRectangulo().intersects(enemigo4.obtenerRectangulo().getBoundsInLocal())) {
			enemigo4.setCapturado(true);
			System.out.println("Colision detectada: hacha contra enemigo #4");

			return true;
		}

		return false;
	}

	public boolean verificarColision5(Enemigo enemigo5) {
		if (obtenerRectangulo().intersects(enemigo5.obtenerRectangulo().getBoundsInLocal())) {
			enemigo5.setCapturado(true);
			System.out.println("Colision detectada: hacha contra enemigo #5");

			return true;
		}

		return false;
	}


}
