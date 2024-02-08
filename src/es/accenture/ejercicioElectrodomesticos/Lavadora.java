package es.accenture.ejercicioElectrodomesticos;

/**
 * @author andrea ravagli
 */
public class Lavadora extends Electrodomestico {
	private double precio;
	private boolean aguaCaliente;
	
	//constructor vacio
	public Lavadora() {
		
	}
	
	//constructor copia
	public Lavadora(Lavadora lavadora) {
		this.precio = lavadora.precio;
		this.aguaCaliente = lavadora.aguaCaliente;
	}
	
	//constructor parametros
	public Lavadora(String tipo, String marca, double potencia, double precio, boolean aguaCaliente) {
		super.setTipo(tipo);
		super.setMarca(marca);
		super.setPotencia(potencia);
		this.precio = precio;
		this.aguaCaliente = aguaCaliente;
	}
	
	@Override
	public double getConsumo(int horas) {
		double resultado = 0;
		
		if(aguaCaliente) {
			resultado = horas * (this.getPotencia() + this.getPotencia() * 0.20);
		} else {
			resultado = this.getPotencia() * horas;
		}
		
		return resultado;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isAguaCaliente() {
		return aguaCaliente;
	}

	public void setAguaCaliente(boolean aguaCaliente) {
		this.aguaCaliente = aguaCaliente;
	}

	@Override
	public String toString() {
		return "Lavadora [marca=" + getMarca() + ", potencia=" + getPotencia() + " precio=" + precio + ", aguaCaliente=" + aguaCaliente + "]";
	}

	
	
	
}
