package es.accenture.ejerciciosInterfaces;

/**
 * @author andrea ravagli
 */
public interface IVehiculo {
	public static final int VELOCIDAD_MAX = 120;
	
	String frenar(int cuanto);
	
	String acelerar(int cuanto);
}
