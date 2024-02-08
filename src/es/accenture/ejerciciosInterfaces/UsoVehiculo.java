package es.accenture.ejerciciosInterfaces;

/**
 * @author andrea ravagli
 */
public class UsoVehiculo {

	public static void main(String[] args) {
		Coche coche = new Coche();
		coche.setVelocidad(100);
		System.out.println(coche.acelerar(30));
		System.out.println(coche.frenar(10));
		
		Moto moto = new Moto();
		moto.setVelocidad(80);
		System.out.println(moto.acelerar(30));
		System.out.println(moto.frenar(10));
		
		
	}

}
