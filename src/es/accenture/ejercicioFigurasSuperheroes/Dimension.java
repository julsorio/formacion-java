package es.accenture.ejercicioFigurasSuperheroes;

/**
 * @author andrea ravagli
 */
public class Dimension {
	private double alto;
	private double ancho;
	private double profundidad;
	
	public Dimension() {
		this.alto = 0;
		this.ancho = 0;
		this.profundidad = 0;
	}
	
	public Dimension(double ancho, double alto, double profundidad) {
		this.ancho = ancho;
		this.alto = alto;
		this.profundidad = profundidad;
	}
	
	public double getVolumen() {
		return ancho * alto * profundidad;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}

	@Override
	public String toString() {
		return "Dimension [alto=" + alto + ", ancho=" + ancho + ", profundidad=" + profundidad + "]";
	}
	
	
}
