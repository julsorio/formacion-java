package es.accenture.ejerciciosInterfaces;

/**
 * @author andrea ravagli
 */
public class Moto extends Vehiculos {
	
	//constructor vacio
	public Moto() {
		
	}
	
	//constructor copia
	public Moto(Moto moto) {
		
	}

	@Override
	public String frenar(int cuanto) {
		this.setVelocidad(this.getVelocidad() - cuanto);		
		return "La moto ha frenado ya y va a " + this.getVelocidad() + " km/hora";
	}

	@Override
	public String acelerar(int cuanto) {
		String mensaje = "";
		
		this.setVelocidad(this.getVelocidad() + cuanto);
		if(this.getVelocidad() > VELOCIDAD_MAX) {
			mensaje = "Exceso de velocidad. La moto ha acelerado y va a " + this.getVelocidad() + " km/hora";
		} else {
			mensaje = "La moto ha acelerado y va a " + this.getVelocidad() + " km/hora";
		}
		
		return mensaje;
	}

}
