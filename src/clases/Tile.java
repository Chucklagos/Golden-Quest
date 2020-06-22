package clases;

import implementacion.Juego;
import javafx.scene.canvas.GraphicsContext;

public class Tile {
	private int xImagen;
	private int yImagen;
	private int anchoImagen;
	private int altoImagen;
	//Coordenadas de en que parte del canvas se dibujara el tile
	private int x;
	private int y;
	private String indiceImagen;
	private int tipo;
	private int velocidad;

	public Tile(int xImagen, int yImagen, int anchoImagen, int altoImagen, int x, int y, String indiceImagen) {
		this.xImagen = xImagen;
		this.yImagen = yImagen;
		this.anchoImagen = anchoImagen;
		this.altoImagen = altoImagen;
		this.x = x;
		this.y = y;
		this.indiceImagen = indiceImagen;
	}


	public Tile(int x, int y, String indiceImagen, int tipo) {
		this.tipo = tipo;
		switch(this.tipo) {
			case 0: subImagen(0,0,32,32); break;
			case 1: subImagen(32,32,32,32); break;
			case 2: subImagen(0,0,32,32); break;
			case 3: subImagen(96,0,32,32); break;
			case 4: subImagen(0,224,32,32); break;
			case 5: subImagen(96,64,32,32); break;
			case 6: subImagen(96,224,32,32); break;
			case 7: subImagen(96,160,32,32); break;
			case 8: subImagen(136,20,43,90); break;
			case 9: subImagen(280,136,144,111); break;
			case 10: subImagen(461,98,173,148); break;
			case 11: subImagen(516,17,59,35); break;
			case 12: subImagen(263,22,42,29); break;
			case 13: subImagen(325,31,45,28); break;
		}

		this.x = x;
		this.y = y;
		this.indiceImagen = indiceImagen;
	}

	public void subImagen(int x, int y, int ancho, int alto) {
		this.xImagen = x;
		this.yImagen = y;
		this.anchoImagen = ancho;
		this.altoImagen = alto;
	}


	public void mover() {
		if (Juego.accion) {
			this.velocidad = 10;
		}else {
			this.velocidad = 8;
		}

		if (Juego.derecha)
			x-=velocidad;

		if (Juego.izquierda)
			x+=velocidad;
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
	public String getIndiceImagen() {
		return indiceImagen;
	}
	public void setIndiceImagen(String indiceImagen) {
		this.indiceImagen = indiceImagen;
	}
	public void setTipo(int tipo){
		this.tipo=tipo;
	}
	public int getTipo(){
		return tipo;
	}

	public void pintar(GraphicsContext graficos) {
		//graficos.strokeRect(this.x, this.y, this.anchoImagen, this.altoImagen);
		graficos.drawImage(Juego.imagenes.get(indiceImagen), xImagen, yImagen, anchoImagen, altoImagen, x, y, anchoImagen, altoImagen);
	}
}
