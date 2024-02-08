package es.accenture.ejercicioFilmoteca;

import java.util.Scanner;

public class Alquiler {
	Serie[] listaSeries = new Serie[4];
	Pelicula[] listaPeliculas = new Pelicula[4];
	int contadorMaterialAlquilado = 0;
	String materialAlquilado = "";
	String materialDisponible = "";

	public Serie existeTituloSerie(String titulo) {
		Serie existe = null;

		for (int i = 0; i < listaSeries.length; i++) {
			if (titulo.equals(listaSeries[i].getTitulo())) {
				existe = listaSeries[i];
				break;
			}
		}

		return existe;
	}

	public Pelicula existeTituloPelicula(String titulo) {
		Pelicula existe = null;

		for (int i = 0; i < listaPeliculas.length; i++) {
			if (titulo.equals(listaPeliculas[i].getTitulo())) {
				existe = listaPeliculas[i];
				break;
			}
		}
		return existe;
	}

	public void pedidoUsuario(String tipoEleccion, String accion, String titulo) {
		/**
		 * debes recorrer el arreglo de la serie o pelicula para buscar el titulo tip:
		 * if(tituloInput == arreglo[indice].getTitulo()) { {existe = true; break;
		 * //break para terminar el ciclo porque ya lo has encontrado }
		 * 
		 * se escribe un mensaje en la consola si no existe ese titulo (ver resultado
		 * esperado caso 2)
		 * 
		 * ejecutar el metodo entregar() o devolver() segun la opcion seleccionada
		 */

		switch (tipoEleccion) {
		case "serie":
			Serie serie = existeTituloSerie(titulo);
			if (serie != null) {
				// la serie existe
				if (accion.equals("A")) {
					if (serie.alquilar()) {
						System.out.println("Se ha alquilado la serie " + serie.getTitulo());
					} else {
						System.out.println("No se ha alquilado la serie " + serie.getTitulo());
					}
				}

				if (accion.equals("D")) {
					if (serie.devolver()) {
						System.out.println("Ha devuelto la serie " + serie.getTitulo());
					} else {
						System.out.println("No se ha devuelto la serie " + serie.getTitulo());
					}
				}
			} else {
				// no existe en el listado
				System.out.println("No tenemos esa serie en el listado");
			}
			break;

		case "pelicula":
			Pelicula pelicula = existeTituloPelicula(titulo);

			if (pelicula != null) {
				// la pelicula existe
				if (accion.equals("A")) {
					if (pelicula.alquilar()) {
						System.out.println("Se ha alquilado la pelicula " + pelicula.getTitulo());
					} else {
						System.out.println("No se ha alquilado la pelicula " + pelicula.getTitulo());

					}
				}

				if (accion.equals("D")) {
					if (pelicula.devolver()) {
						System.out.println("Ha devuelto la pelicula " + pelicula.getTitulo());
					} else {
						System.out.println("No se ha devuelto la pelicula " + pelicula.getTitulo());

					}
				}
			} else {
				// no existe en el listado
				System.out.println("No tenemos esa pelicula en el listado");
			}
			break;
		default:
			// opcion invalida
			System.out.println("Ha ingresado una opcion invalida");
		}

		/**
		 * recorrrer las listas de series y peliculas disponibles es decir, que el
		 * atributo entregado sea true
		 */

		/**
		 * recorrer las listas de series y peliculas que estan alquiladas es decir, que
		 * el atributo entregado sea false (se debe crear una variable contador para las
		 * series y peliculas)
		 */

		/**
		 * mostrar el total de series/peliculas alquiladas (tip: la suma de los
		 * contadores)
		 */
	}

	public void listaSeriesDisponibles() {

		for (int pos = 0; pos < listaSeries.length; pos++) {
			if (listaSeries[pos].getEntregado()) {
				materialDisponible += listaSeries[pos].getTitulo() + " - " + "Si disponible \n";
			} else {
				materialAlquilado += listaSeries[pos].getTitulo() + " - " + "No disponible \n";
				contadorMaterialAlquilado++;
			}
		}
	}

	public void listaPeliculasDisponibles() {
		for (int pos = 0; pos < listaPeliculas.length; pos++) {
			if (listaPeliculas[pos].getEntregado()) {
				materialDisponible += listaPeliculas[pos].getTitulo() + " - " + "Si disponible \n";
			} else {
				materialAlquilado += listaPeliculas[pos].getTitulo() + " - " + "No disponible \n";
				contadorMaterialAlquilado++;
			}
		}
	}

	public static void main(String[] args) {
		// se crea un array para series
		// Serie[] listaSeries = new Serie[4];

		Alquiler alquiler = new Alquiler();

		alquiler.listaSeries[0] = new Serie("Juego de tronos", 8, false, "Aventuras", "George R. R. Martin");
		alquiler.listaSeries[1] = new Serie("Los Simpsons", 25, false, "Humor", "Matt Groening");
		alquiler.listaSeries[2] = new Serie("Padre de familia", 12, false, "Humor", "Seth MacFarlane");
		alquiler.listaSeries[3] = new Serie("Breaking Bad", 5, false, "Thriller", "Vince Gilligan");

		// se crea array para peliculas
		alquiler.listaPeliculas[0] = new Pelicula("Memorias de una Geisha", "Drama", "Rob Marshall", false);
		alquiler.listaPeliculas[1] = new Pelicula("La milla verde", "Drama/Fantastico", "Frank Darabont", false);
		alquiler.listaPeliculas[2] = new Pelicula("Hermanos por pelotas", "Comedia", "Adam McKay", false);
		alquiler.listaPeliculas[3] = new Pelicula("El resplandor", "Terror", "Stanley Kubrick", false);

		/**
		 * System.out.println("ANTES DE EJECUTAR EL METODO DEVOLVER");
		 * System.out.println(listaSeries[0].toString()); (Comprobar)
		 **/

		/** entregar o alquiladas series o peliculas. Caso 1 **/

		/*
		 * listaSeries[0].entregar(); System.out.println(listaSeries[0].toString());
		 * listaSeries[1].entregar(); System.out.println(listaSeries[1].toString());
		 * listaSeries[3].entregar(); System.out.println(listaSeries[3].toString());
		 * 
		 * listaPeliculas[0].entregar();
		 * System.out.println(listaPeliculas[0].toString());
		 * listaPeliculas[2].entregar();
		 * System.out.println(listaPeliculas[2].toString());/*
		 * 
		 * /** devolver o disponibles series o peliculas. Caso 1
		 **/

		/*
		 * listaSeries[2].devolver(); System.out.println(listaSeries[2].toString());
		 * 
		 * listaPeliculas[1].devolver();
		 * System.out.println(listaPeliculas[1].toString());
		 * listaPeliculas[3].devolver();
		 * System.out.println(listaPeliculas[3].toString()); /*
		 * 
		 * 
		 * /** solicitar al usuario los siguientes datos haciendo uso de la clase
		 * Scanner tipo material: serie o pelicula (String) la accion: alquilar o
		 * devolver (String) el titulo(String)
		 **/
		Scanner input = null;
		input = new Scanner(System.in);

		System.out.println("Indica si quieres una serie o pelicula: ");
		String tipoEleccion = input.nextLine().toLowerCase();
		System.out.println("¿Quieres alquilar (A) o devolver (D): ");
		String accion = input.nextLine();
		System.out.println("Título de la serie o pelicula: ");
		String titulo = input.nextLine();

		alquiler.pedidoUsuario(tipoEleccion, accion, titulo);

		alquiler.listaPeliculasDisponibles();
		alquiler.listaSeriesDisponibles();

		System.out.println("Listado de series y peliculas disponibles");
		System.out.println("-----------------------------------------");
		System.out.println(alquiler.materialDisponible);

		System.out.println("Listado de series y peliculas alquiladas");
		System.out.println("----------------------------------------");
		System.out.println(alquiler.materialAlquilado);

		System.out.println("Numero total de peliculas y series alquiladas es " + alquiler.contadorMaterialAlquilado);

		input.close();
	}

}
