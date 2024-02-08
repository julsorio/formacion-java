package es.accenture.ejercicioFigurasSuperheroes;

/**
 * @author andrea ravagli
 */
public class AppFigurasSuperheroes {

	public static void main(String[] args) {
		Figura[] arrayFiguras = new Figura[4];
		
		Superheroe spiderman = new Superheroe("Spiderman", "Lanza tela de araña y viste de rojo", false);
		Superheroe batman = new Superheroe("Batman", "Tiene los poderes de un murcielago", true);
		Superheroe ironman = new Superheroe("Ironman", "Superheroe con traje de metal capaz de volar", false);
		Superheroe thor = new Superheroe("Thor", "Dios del trueno", true);
		
		Dimension dimPeq = new Dimension(20, 5, 6);
		Dimension dimGra = new Dimension(70, 20, 20);
		
		Figura figura1 = new Figura("ABC123", 30, dimPeq, spiderman);
		Figura figura2 = new Figura("DEF456", 30, dimPeq, batman);
		Figura figura3 = new Figura("GHI789", 50, dimGra, ironman);
		Figura figura4 = new Figura("JKL012", 50, dimGra, thor);
		
		arrayFiguras[0] = figura1;
		arrayFiguras[1] = figura2;
		arrayFiguras[2] = figura3;
		arrayFiguras[3] = figura4;
		
		System.out.println("Creamos nuestros superheroes");
		System.out.println("----------------------------");
		System.out.println(spiderman.toString());
		System.out.println(batman.toString());
		System.out.println(ironman.toString());
		System.out.println(thor.toString());
		
		System.out.println("Listado de figuras");
		System.out.println("------------------");
		for(int pos = 0; pos < arrayFiguras.length; pos ++) {
			System.out.println(arrayFiguras[pos].getSuperheroe().getNombre() + " con un precio de " + arrayFiguras[pos].getPrecio() + " y un volumen de " 
		+ arrayFiguras[pos].getDimension().getVolumen());
		}
		
		for(int pos = 0; pos < arrayFiguras.length; pos ++) {
			arrayFiguras[pos].subirPrecio(10);
		}
		
		System.out.println("Listado de figuras con el precio actualizado");
		System.out.println("------------------");
		for(int pos = 0; pos < arrayFiguras.length; pos ++) {
			System.out.println(arrayFiguras[pos].getSuperheroe().getNombre() + " con un precio de " + arrayFiguras[pos].getPrecio());
		}
	}

}
