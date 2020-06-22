package clases;

import implementacion.Juego;
import javafx.scene.shape.Rectangle;

public class Jugador extends Personaje{

	private int puntuacion=0;
	
	public int getPuntuacion() {
		return puntuacion;
	}


	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}


	public Jugador(int x, int y, int velocidad, String indiceImagen, int xImagen, int yImagen, int anchoImagen,
			int altoImagen) {
		super(x, y, velocidad, indiceImagen, xImagen, yImagen, anchoImagen, altoImagen);
		}

	
	public void mover(){
		if (Juego.accion) {
			this.velocidad = 10;
			this.indiceImagen = "GK";
		}else {
			this.velocidad = 8;
			this.indiceImagen = "GK";
		}


		if (Juego.derecha){
			this.yImagen = 192;
			if (this.xImagen<256){
				this.xImagen+=64;
				pausa();
			}else{
					this.xImagen=0;
				}
		}

		if (Juego.izquierda){
			this.yImagen = 64;
			if (this.xImagen<256){
				this.xImagen+=64;
				pausa();
			}else{
					this.xImagen=0;
				}
		}
		if (Juego.arriba){
			y-=velocidad;
			this.yImagen=0;
			if (this.xImagen<256){
				this.xImagen+=64;
				pausa();
			}else{
					this.xImagen=0;
				}
		}

		if (Juego.abajo){
			y+=velocidad;
			this.yImagen=128;
			if (this.xImagen<256){
				this.xImagen+=64;
				pausa();
			}else{
					this.xImagen=0;
				}
		}


		//Limitadores de pantalla
		if (x>=500)
			x=-120;

		if (y<0)
			y=0;

		if (y>=490)
			y=490;

	}
	
	public void pausa(){
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public Rectangle obtenerRectangulo() {
		return new Rectangle(this.x+20, this.y, this.anchoImagen-30, this.altoImagen);
	}
	
	public void agregarPuntuacion(int puntuacion) {
		this.puntuacion+=puntuacion;
	}

	public boolean verificarColision(Item item) {
		if (obtenerRectangulo().intersects(item.obtenerRectangulo().getBoundsInLocal()) && !item.isCapturado()) {
			item.setCapturado(true);
			agregarPuntuacion(1);
			System.out.println("Colisionaron");
			
			return true;
		}
		
		return false;
	}
	
	public boolean verificarColision0(Enemigo enemigo0) {
		if (obtenerRectangulo().intersects(enemigo0.obtenerRectangulo().getBoundsInLocal())) {
			//enemigo0.setCapturado(true);
			agregarPuntuacion(-1);
			System.out.println("Colision detectada: jugador contra enemigo #0");
			
			return true;
		}
		
		return false;
	}
	
	public boolean verificarColision1(Enemigo enemigo1) {
		if (obtenerRectangulo().intersects(enemigo1.obtenerRectangulo().getBoundsInLocal())) {
			//enemigo0.setCapturado(true);
			agregarPuntuacion(-1);
			System.out.println("Colision detectada: jugador contra enemigo #1");
			
			return true;
		}
		
		return false;
	}
	
	public boolean verificarColision2(Enemigo enemigo2) {
		if (obtenerRectangulo().intersects(enemigo2.obtenerRectangulo().getBoundsInLocal())) {
			//enemigo0.setCapturado(true);
			agregarPuntuacion(-1);
			System.out.println("Colision detectada: jugador contra enemigo #2");
			
			return true;
		}
		
		return false;
	}
	
	public boolean verificarColision3(Enemigo enemigo3) {
		if (obtenerRectangulo().intersects(enemigo3.obtenerRectangulo().getBoundsInLocal())) {
			//enemigo0.setCapturado(true);
			agregarPuntuacion(-1);
			System.out.println("Colision detectada: jugador contra enemigo #3");
			
			return true;
		}
		
		return false;
	}
	
	public boolean verificarColision4(Enemigo enemigo4) {
		if (obtenerRectangulo().intersects(enemigo4.obtenerRectangulo().getBoundsInLocal())) {
			//enemigo0.setCapturado(true);
			agregarPuntuacion(-1);
			System.out.println("Colision detectada: jugador contra enemigo #4");
			
			return true;
		}
		
		return false;
	}
	
	public boolean verificarColision5(Enemigo enemigo5) {
		if (obtenerRectangulo().intersects(enemigo5.obtenerRectangulo().getBoundsInLocal())) {
			//enemigo0.setCapturado(true);
			agregarPuntuacion(-1);
			System.out.println("Colision detectada: jugador contra enemigo #5");
			
			return true;
		}
		
		return false;
	}
	
}

