package es.accenture.ejercicioSupermercado;

import java.time.LocalDate;

/**
 * @author andrea ravagli
 */
public class Vino implements ConDescuento, EsAlimento, EsLiquido {
	private String marca;
	private double precio;
	private String tipoVino;
	private double gradosAlcohol;
	private double descuento;
	private String tipoEnvase;
	private LocalDate fechaCaducidad;
	private double volumen;

	public Vino() {

	}

	public Vino(Vino vino) {
		this.marca = vino.marca;
		this.precio = vino.precio;
		this.tipoVino = vino.tipoVino;
		this.gradosAlcohol = vino.gradosAlcohol;
		this.descuento = vino.descuento;
		this.tipoEnvase = vino.tipoEnvase;
		this.fechaCaducidad = vino.fechaCaducidad;
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

	public String getTipoVino() {
		return tipoVino;
	}

	public void setTipoVino(String tipoVino) {
		this.tipoVino = tipoVino;
	}

	public double getGradosAlcohol() {
		return gradosAlcohol;
	}

	public void setGradosAlcohol(double gradosAlcohol) {
		this.gradosAlcohol = gradosAlcohol;
	}

	public String getTipoEnvase() {
		return tipoEnvase;
	}

	public void setTipoEnvase(String tipoEnvase) {
		this.tipoEnvase = tipoEnvase;
	}

	@Override
	public LocalDate getCaducidad() {
		return this.fechaCaducidad;
	}

	@Override
	public void setCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public int getCalorias() {
		return (int) getGradosAlcohol() * 10;
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
	public String toString() {
		return "Vino [marca=" + marca + ", precio=" + precio + ", tipoVino=" + tipoVino + ", gradosAlcohol="
				+ gradosAlcohol + ", descuento=" + descuento + ", precioDescuento=" + getPrecioDescuento() + ", tipoEnvase="
				+ tipoEnvase + ", fechaCaducidad=" + fechaCaducidad + ", volumen=" + volumen + ", calorias=" + getCalorias() + "]";
	}


}
