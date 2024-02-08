package es.accenture.ejercicioParking;

import java.util.Scanner;

/**
 * @author andrea ravagli
 */
public class AppParking {

	public static void main(String[] args) {
		Parking parkingCentro = new Parking();
		int opcion = 0;
		String matricula = "";
		int plaza = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("GESTION DEL PARKING Centro");
		System.out.println("--------------------------");
		do {

			try {
				System.out.println("1) Entrada de coche");
				System.out.println("2) Salida de coche");
				System.out.println("3) Mostrar parking");
				System.out.println("4) Salir del programa");
				System.out.println("Indica una opcion (1-4)");
				opcion = input.nextInt();

				switch (opcion) {
				case 1: // entrada de coche
					System.out.println("Introduzca matricula");
					matricula = input.next();
					System.out.println("Introduzca la plaza");
					plaza = input.nextInt();
					parkingCentro.entrada(matricula, plaza);

					mostrarResumen(parkingCentro);
					break;
				case 2: // salida de coche
					System.out.println("Introduzca matricula");
					matricula = input.next();
					System.out.println("El coche " + matricula + " salio de la plaza " + parkingCentro.salida(matricula));

					mostrarResumen(parkingCentro);
					break;
				case 3: // mostrar parking
					System.out.println(parkingCentro.toString());
					break;
				case 4:
					System.out.println("Fin del programa");
					input.close();
				}
			} catch (ParkingException e) {
				System.out.println("ERROR: " + e.getMensaje() + "\n" + "No se realizo entrada del coche con matricula "
						+ e.getMatricula() + " en el parking");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (opcion != 4);

	}

	public static void mostrarResumen(Parking parkingCentro) {
		System.out.println("Plazas totales: " + parkingCentro.getPlazasTotales());
		System.out.println("Plazas ocupadas: " + parkingCentro.getPlazasOcupadas());
		System.out.println("Plazas libres: " + parkingCentro.getPlazasLibres());
	}

}
