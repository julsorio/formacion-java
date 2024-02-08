package es.accenture.ejercicioElectrodomesticos;

/**
 * @author andrea ravagli
 */
public class AppElectrodomesticos {
	public static int HORAS = 10;
	public static double PRECIO_KWH = 0.5;

	public static void main(String[] args) {
		Electrodomestico electrodomestico = new Electrodomestico();
		electrodomestico.setTipo("Frigorifico");
		electrodomestico.setMarca("Balay");
		electrodomestico.setPotencia(0.67);
		
		Lavadora lavadora = new Lavadora("Lavadora", "Zanussi", 0.5, 595.0, false);
		Lavadora lavadora1 = new Lavadora("Lavadora", "Zanussi", 0.5, 490.0, true);
		
		System.out.println(electrodomestico.toString());
		System.out.println("Consumo del frigorifico en 10 horas: " + electrodomestico.getConsumo(HORAS));
		System.out.println("Coste del consumo en 10 horas: " + electrodomestico.getCosteConsumo(HORAS, PRECIO_KWH));
		System.out.println("");
		
		System.out.println(lavadora.toString());
		System.out.println("Consumo de la lavadora en 10 horas: " + lavadora.getConsumo(HORAS));
		System.out.println("Coste del consumo en 10 horas: " + lavadora.getCosteConsumo(HORAS, PRECIO_KWH));
		System.out.println("");
		
		System.out.println(lavadora1.toString());
		System.out.println("Consumo de la lavadora en 10 horas: " + lavadora1.getConsumo(HORAS));
		System.out.println("Coste del consumo en 10 horas: " + lavadora1.getCosteConsumo(HORAS, PRECIO_KWH));
		
	}

}
