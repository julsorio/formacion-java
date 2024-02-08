package es.accenture.ejercicioFilmoteca;

public class Pelicula {
	private String titulo;
	private String genero;
	private String director;
	private boolean disponible;
	
	//constructor vacio
	public Pelicula() {
		
	}
	
	//constructor copia
	public Pelicula(Pelicula pelicula) {
		this.titulo = pelicula.titulo;
		this.genero = pelicula.genero;
		this.director = pelicula.director;
		this.disponible = pelicula.disponible;
	}
	
	//constructor de parametros
	public Pelicula(String titulo,String genero, String director, boolean entregado) {
		this.titulo = titulo;
		this.genero = genero;
		this.director = director;
		this.disponible = entregado;
	}
	
	public boolean alquilar() {
		boolean realizaOperacion = true;
		
		if(!this.disponible) {
			//no esta disponible - ya ha sido alquilado
			realizaOperacion = false;
		}else {
			this.disponible = true;
		}
		
		return realizaOperacion;
	}
	
	public boolean devolver() {
		boolean realizaOperacion = true;
		
		if(this.disponible) {
			//esta disponible - no se puede hacer devolucion
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public boolean getEntregado() {
		return disponible;
	}

	public void setEntregado(boolean entregado) {
		this.disponible = entregado;
	}
	
	@Override
	public String toString() {
		String texto = "Datos de la serie/libro \n";
		texto += "Titulo: " + this.titulo + "\n";
		texto += "Director: " + this.director + "\n";
		texto += "Genero: " + this.genero + "\n";
		texto += "Disponible: " + ((this.disponible) ? "Si" : "No") + "\n";
		
		return texto;
		
	}

}
