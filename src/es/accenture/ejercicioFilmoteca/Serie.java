package es.accenture.ejercicioFilmoteca;

public class Serie {
	private String titulo;
	private int numeroTemporadas;
	private boolean disponible;
	private String genero;
	private String creador;

	// constructor vacio
	public Serie() {

	}

	// constructor copia
	public Serie(Serie serie) {
		this.titulo = serie.titulo;
		this.numeroTemporadas = serie.numeroTemporadas;
		this.disponible = serie.disponible;
		this.genero = serie.genero;
		this.creador = serie.creador;
	}

	// constructor de parametros
	public Serie(String titulo, int numeroTemporadas, boolean entregado, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.disponible = entregado;
		this.genero = genero;
		this.creador = creador;
	}
	
	public boolean alquilar() {
		boolean realizaOperacion = true;
		
		if(!this.disponible) {
			//no está disponible - ya ha sido alquilado
			realizaOperacion = false;
		} else {
			this.disponible = false;
		}
		
		return realizaOperacion;
	}
	
	public boolean devolver() {
		boolean realizaOperacion = true;
		
		if(this.disponible) {
			//está disponible - no se puede hacer devolución
			realizaOperacion = false;
		} else {
			this.disponible = true;
		}
		
		return realizaOperacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public boolean getEntregado() {
		return disponible;
	}

	public void setEntregado(boolean entregado) {
		this.disponible = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		String texto = "Datos de la serie/libro \n";
		texto += "Titulo: " + this.titulo + "\n";
		texto += "Creador: " + this.creador + "\n";
		texto += "Genero: " + this.genero + "\n";
		texto += "No. de temporadas: " + this.numeroTemporadas + "\n";
		texto += "Disponible: " + ((this.disponible) ? "Si" : "No") + "\n";
		
		return texto;
	}
}
