package es.accenture.ejercicioFigurasSuperheroes;

/**
 * @author andrea ravagli
 */
public class Figura implements Comparable<Figura> {
	private String codigo;
	private double precio;
	private Dimension dimension;
	private Superheroe superheroe;

	// constructor vacio
	public Figura() {

	}

	// constructor copia
	public Figura(Figura figura) {
		this.codigo = figura.codigo;
		this.precio = figura.precio;
		this.dimension = figura.dimension;
		this.superheroe = figura.superheroe;
	}

	// constructor parametros
	public Figura(String codigo, double precio, Dimension dimension, Superheroe superheroe) {
		this.codigo = codigo;
		this.precio = precio;
		this.dimension = dimension;
		this.superheroe = superheroe;
	}

	public void subirPrecio(double cantidad) {
		this.precio = this.precio + cantidad;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public Superheroe getSuperheroe() {
		return superheroe;
	}

	public void setSuperheroe(Superheroe superheroe) {
		this.superheroe = superheroe;
	}

	@Override
	public String toString() {
		return "Figura [codigo=" + codigo + ", precio=" + precio + ", dimension=" + dimension + ", superheroe="
				+ superheroe + "]";
	}

	@Override
	public int compareTo(Figura o) {
		return this.getSuperheroe().getNombre().compareTo(o.getSuperheroe().getNombre());
	}

}
