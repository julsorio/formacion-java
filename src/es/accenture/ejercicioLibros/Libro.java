package es.accenture.ejercicioLibros;

public class Libro {
	private String titulo;
	private String isbn;
	private String autor;
	private int numPaginas;
	
	//constructor vacio
	public Libro() {
		
	}
	
	//constructor copia
	public Libro(Libro libro) {
		this.titulo = libro.titulo;
		this.isbn = libro.isbn;
		this.autor = libro.autor;
		this.numPaginas = libro.numPaginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	@Override
	public String toString() {
		String texto = "El libro " + this.titulo + " con ISBN " + this.isbn + " creado por el autor " + this.autor +
		" tiene " + this.numPaginas + " páginas";
		
		return texto;
	}
}
