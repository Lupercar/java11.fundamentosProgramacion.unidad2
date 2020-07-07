package main;

import java.time.LocalDateTime;

public class Juego {

	private String nombre;
	private int vidas;
	private long duracion; //en teoria por ser milisegundos deberia ser este tipo
	
	public Juego(int vidas, long duracion) {
		this.vidas = vidas;
		this.duracion = duracion;
		//FALTA INICIAR
		//Al crearse un objeto Juego se debe guardar la fecha actual del sistema para 
		//determinar después durante cuánto tiempo se ha jugado
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public long getDuracion() {
		return duracion;
	}

	public void setDuracion(long duracion) {
		this.duracion = duracion;
	}
	
	public void  finJuego() {
		LocalDateTime.now(); //preguntar
	}
	
	public boolean isTimeout() {
		//FALTA HACER devuelva true si el jugador ha excedido la duración máxima del juego, y false en caso contrario.
		return false;
	}
	
	public static void main(String[] args) {
		
		Juego juego1 = new Juego(5,63);
		juego1.setNombre("Juan");
		System.out.println(juego1.getVidas());
		juego1.setVidas(juego1.getVidas()-1);
		System.out.println(juego1.getVidas());
		
		Juego juego2 = new Juego(5,53);
		juego2.setNombre("Marta");
		System.out.println(juego1.getVidas());
		System.out.println(juego2.getVidas());
		juego1.finJuego();
		System.out.println(juego1.isTimeout());
		
	}
	
}
