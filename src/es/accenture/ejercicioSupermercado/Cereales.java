package es.accenture.ejercicioSupermercado;

import java.time.LocalDate;

/**
 * @author andrea ravagli
 */
public class Cereales implements EsAlimento {
	private String marca;
	private double precio;
	private String tipoCereal;
	private LocalDate fechaCaducidad;

	public Cereales() {

	}

	public Cereales(Cereales cereales) {
		this.marca = cereales.marca;
		this.precio = cereales.precio;
		this.tipoCereal = cereales.tipoCereal;
		this.fechaCaducidad = cereales.fechaCaducidad;
	}

	@Override
	public void setCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public LocalDate getCaducidad() {
		return this.fechaCaducidad;
	}

	@Override
	public int getCalorias() {
		int calorias = 0;

		switch (this.getTipoCereal()) {
		case "Espelta":
			calorias = 5;
			break;
		case "Maiz":
			calorias = 8;
			break;
		case "Trigo":
			calorias = 12;
			break;
		default:
			calorias = 15;
		}

		return calorias;
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

	public String getTipoCereal() {
		return tipoCereal;
	}

	public void setTipoCereal(String tipoCereal) {
		this.tipoCereal = tipoCereal;
	}

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "Cereales [marca=" + marca + ", precio=" + precio + ", tipoCereal=" + tipoCereal + ", fechaCaducidad="
				+ fechaCaducidad + ", calorias=" + getCalorias() + "]";
	}

}
