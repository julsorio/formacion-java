package es.accenture.ejercicioLibros;

public class LibroApp {

	public static void main(String[] args) {
		Libro libro1 = new Libro();	
		libro1.setTitulo("El resplandor");
		libro1.setIsbn("9788490328729");
		libro1.setAutor("Stephen King");
		libro1.setNumPaginas(688);
		
		Libro libro2 = new Libro();
		libro2.setTitulo("El cementerio de animales");
		libro2.setIsbn("9788497930994");
		libro2.setAutor("Stephen King");
		libro2.setNumPaginas(488);

		Libro libro3 = new Libro();
		libro3.setTitulo("El código Da Vinci");
		libro3.setIsbn("9788408176022");
		libro3.setAutor("Dan Brown");
		libro3.setNumPaginas(624);
		
		Libro libro4 = new Libro();
		libro4.setTitulo("Inferno");
		libro4.setIsbn("9788408176039");
		libro4.setAutor("Dan Brown");
		libro4.setNumPaginas(640);
		
		Libro[] arregloLibros = new Libro[4];
		arregloLibros[0] = libro1;
		arregloLibros[1] = libro2;
		arregloLibros[2] = libro3;
		arregloLibros[3] = libro4;
		
		int numeroPaginas = 0;
		String titulo = "";
		String autor = "Stephen King";
		String libros = "";
		
		for(int pos = 0; pos < arregloLibros.length; pos ++) {
			if(arregloLibros[pos].getNumPaginas() > numeroPaginas) {
				numeroPaginas = arregloLibros[pos].getNumPaginas();
				titulo = arregloLibros[pos].getTitulo();
			}
			
			if(arregloLibros[pos].getAutor().equals(autor)) {
				libros = libros +  arregloLibros[pos].getTitulo() + "\n";
			}
		}
		
		System.out.println("Listado de los libros que tenemos");
		System.out.println("---------------------------------");
		for(int in = 0; in < arregloLibros.length; in ++) {
			System.out.println(arregloLibros[in].toString());
		}
		
		System.out.println("");
		System.out.println("El libro con mayor numero de paginas es " + titulo);
		System.out.println("");
		
		System.out.println("Listado de los libros de Stephen King");
		System.out.println("---------------------------------");
		System.out.println(libros);
		
	}

}
