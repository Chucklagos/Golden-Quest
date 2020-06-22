package clases;

import implementacion.Juego;
import javafx.scene.canvas.GraphicsContext;

public class Personaje {

	protected int x;
	protected int y;
	protected int velocidad;
	protected String indiceImagen;

	protected int xImagen;
	protected int yImagen;
	protected int anchoImagen;
	protected int altoImagen;

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
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public String getIndiceImagen() {
		return indiceImagen;
	}
	public void setIndiceImagen(String indiceImagen) {
		this.indiceImagen = indiceImagen;
	}
	public int getxImagen() {
		return xImagen;
	}
	public void setxImagen(int xImagen) {
		this.xImagen = xImagen;
	}
	public int getyImagen() {
		return yImagen;
	}
	public void setyImagen(int yImagen) {
		this.yImagen = yImagen;
	}
	public int getAnchoImagen() {
		return anchoImagen;
	}
	public void setAnchoImagen(int anchoImagen) {
		this.anchoImagen = anchoImagen;
	}
	public int getAltoImagen() {
		return altoImagen;
	}
	public void setAltoImagen(int altoImagen) {
		this.altoImagen = altoImagen;
	}

	public Personaje(int x, int y, int velocidad, String indiceImagen, int xImagen, int yImagen, int anchoImagen,
			int altoImagen) {
		super();
		this.x = x;
		this.y = y;
		this.velocidad = velocidad;
		this.indiceImagen = indiceImagen;
		this.xImagen = xImagen;
		this.yImagen = yImagen;
		this.anchoImagen = anchoImagen;
		this.altoImagen = altoImagen;
	}


	public void pintar(GraphicsContext graficos) {
		//graficos.strokeRect(this.x, this.y, this.anchoImagen, this.altoImagen);
		graficos.drawImage(Juego.imagenes.get(indiceImagen), xImagen, yImagen, altoImagen, anchoImagen, x, y, anchoImagen, altoImagen);
	}

}
