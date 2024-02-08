package es.accenture.ejercicioSupermercado;

/**
 * @author andrea ravagli
 */
public class Detergente implements EsLiquido, ConDescuento {
	
	private String marca;
	private double precio;
	private double volumen;
	private String tipoEnvase;
	private double descuento;
	
	/**
	 * 
	 */
	public Detergente() {
		
	}
	
	/**
	 * 
	 * @param detergente
	 */
	public Detergente(Detergente detergente) {
		this.marca = detergente.marca;
		this.precio = detergente.precio;
		this.volumen = detergente.volumen;
		this.tipoEnvase = detergente.tipoEnvase;
		this.descuento = detergente.descuento;
	}

	@Override
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public double getDescuento() {
		return this.descuento;
	}

	@Override
	public double getPrecioDescuento() {
		double porc = (this.precio * this.descuento / 100);
		return this.precio - porc;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	@Override
	public double getVolumen() {
		return this.volumen;
	}

	@Override
	public void setTipoEnvase(String tipoEnvase) {
		this.tipoEnvase = tipoEnvase;
	}

	@Override
	public String getTipoEnvase() {
		return this.tipoEnvase;
	}

	@Override
	public String toString() {
		return "Detergente [marca=" + marca + ", precio=" + precio + ", volumen=" + volumen + ", tipoEnvase="
				+ tipoEnvase + ", descuento=" + descuento + ", precioDescuento=" + getPrecioDescuento() + "]";
	}

	
}
