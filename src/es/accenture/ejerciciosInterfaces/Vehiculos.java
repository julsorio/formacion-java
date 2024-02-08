package es.accenture.ejerciciosInterfaces;

/**
 * @author andrea ravagli
 */
public abstract class Vehiculos implements IVehiculo {
	private int velocidad;
	
	//constructor vacio
	public Vehiculos() {
		
	}
	
	//constructor de copia
	public Vehiculos(Vehiculos vehiculos) {
		this.velocidad = vehiculos.velocidad;
	}

	public abstract String frenar(int cuanto);

	public abstract String acelerar(int cuanto);

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	
}
