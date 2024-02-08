package es.accenture.ejercicioElectrodomesticos;
/**
 * @author andrea ravagli
 */
public class Electrodomestico {
	private String tipo;
	private String marca;
	private double potencia;
	
	//constructor vacio
	public Electrodomestico() {
		
	}
	
	//constructor de copia
	public Electrodomestico(Electrodomestico electrodomestico) {
		this.tipo = electrodomestico.tipo;
		this.marca = electrodomestico.marca;
		this.potencia = electrodomestico.potencia;
	}
	
	//constructor de parametros
	public Electrodomestico(String tipo, String marca, double potencia) {
		this.tipo = tipo;
		this.marca = marca;
		this.potencia = potencia;
	}
	
	public double getConsumo(int horas) {
		return this.potencia * horas;
	}
	
	public double getCosteConsumo(int horas, double costeHora) {
		return getConsumo(horas) * costeHora;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	@Override
	public String toString() {
		return "Electrodomestico [tipo=" + tipo + ", marca=" + marca + ", potencia=" + potencia + "kW]";
	}
}
