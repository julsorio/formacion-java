package es.accenture.ejerciciosInterfaces;

/**
 * @author andrea ravagli
 */
public class Coche extends Vehiculos {
	
	//constructor vacio
	public Coche() {
		
	}
	
	//constructor de copia
	public Coche(Coche coche) {
		
	}

	@Override
	public String frenar(int cuanto) {
		this.setVelocidad(this.getVelocidad() - cuanto);		
		return "El coche ha frenado ya y va a " + this.getVelocidad() + " km/hora";
	}

	@Override
	public String acelerar(int cuanto) {
		String mensaje = "";
		
		this.setVelocidad(this.getVelocidad() + cuanto);
		if(this.getVelocidad() > VELOCIDAD_MAX) {
			mensaje = "Exceso de velocidad. El coche ha acelerado y va a " + this.getVelocidad() + " km/hora";
		} else {
			mensaje = "El coche ha acelerado y va a " + this.getVelocidad() + " km/hora";
		}
		
		return mensaje;
	}

}
