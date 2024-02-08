package es.accenture.ejercicioFigurasSuperheroes;

import java.util.Collections;
import java.util.Comparator;

/**
 * @author andrea ravagli
 */
public class AppColeccionFigurasSuperheroes {

	public static void main(String[] args) {
		
		//se crean instancias de superheroe
		Superheroe spiderman = new Superheroe("Spiderman", "puede volar y lanza rayos por los ojos", false);
		Superheroe batman = new Superheroe("Batman", "tiene los poderes de un murcielago", true);
		Superheroe ironman = new Superheroe("Ironman", "superheroe con traje de metal capaz de volar", false);
		Superheroe thor = new Superheroe("Thor", "Dios del trueno", true);
		Superheroe hulk = new Superheroe("Hulk", "una bestia verde con superfuerza", false);
		Superheroe hulk1 = new Superheroe("Hulk", "superfuerza", false);
		
		//se crean instancias de dimesion
		Dimension dimensionPequeno = new Dimension(20, 5, 6);
		Dimension dimensionGrande = new Dimension(70, 20, 20);
		
		//se crean instancias de figura
		Figura figuraSpiderman = new Figura("super-01", 30.0, dimensionPequeno, spiderman);
		Figura figuraBatman = new Figura("bat-02", 30.0, dimensionPequeno, batman);
		Figura figuraIronman = new Figura("iron-03", 50.0, dimensionGrande, ironman);
		Figura figuraThor = new Figura("thor-01", 50.0, dimensionGrande, thor);
		Figura figuraHulk = new Figura("hulk-01", 50.0, dimensionGrande, hulk);
		Figura figuraHulk1 = new Figura("hulk-01", 150.0, dimensionGrande, hulk1);
		
		//se crea instancia de coleccion
		Coleccion coleccionMarvel = new Coleccion();
		//se agregan figuras a la coleccion
		coleccionMarvel.incluirFigura(figuraSpiderman);
		coleccionMarvel.incluirFigura(figuraBatman);
		coleccionMarvel.incluirFigura(figuraIronman);
		coleccionMarvel.incluirFigura(figuraHulk);
		coleccionMarvel.incluirFigura(figuraHulk1);
		coleccionMarvel.incluirFigura(figuraThor);
		
		//se incrementa el precio de la figura usando su Id
		coleccionMarvel.subirPrecio(20, "thor-01");
		
		System.out.println("Colecion Marvel");
		System.out.println("-------------------------");
		System.out.println(coleccionMarvel.toString());
		
		System.out.println("Valor total de la coleccion: " + coleccionMarvel.getValorColeccion());
		
		System.out.println("Volumen total de la coleccion: " + coleccionMarvel.getVolumenColeccion());
		
		System.out.println(coleccionMarvel.masValioso());
		
		System.out.println("Figuras de superheroes con capa en la coleccion Marvel: ");
		System.out.println("--------------------------------------------------------");
		System.out.println(coleccionMarvel.conCapa());
		
		Collections.sort(coleccionMarvel.getListaFiguras(), new Comparator<Figura>() {

			@Override
			public int compare(Figura figura1, Figura figura2) {
				int diferencia = figura1.getSuperheroe().getNombre().compareTo(figura2.getSuperheroe().getNombre());
				
				return (diferencia != 0) ? diferencia : Double.compare(figura1.getPrecio(), figura2.getPrecio());
				
			}
			
		});
		System.out.println("Listado de figuras de la coleccion ordenada por nombre y precio");
		System.out.println("---------------------------------------------------------------");
		for(Figura fig : coleccionMarvel.getListaFiguras()) {
			System.out.println(fig.getSuperheroe().getNombre() + " - " + fig.getPrecio());
		}
	}

}
