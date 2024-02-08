package es.accenture.ejercicioFigurasSuperheroes;

/**
 * @author andrea ravagli
 */
public class Superheroe {
	private String nombre;
	private String descripcion;
	private boolean capa;
	
	//constructor vacio
	public Superheroe() {
		
	}
	
	public Superheroe(String nombre, String descripcion, boolean capa) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.capa = capa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isCapa() {
		return capa;
	}

	public void setCapa(boolean capa) {
		this.capa = capa;
	}

	@Override
	public String toString() {
		return "Superheroe [nombre=" + nombre + ", descripcion=" + descripcion + ", capa=" + capa + "]";
	}
	
	
}