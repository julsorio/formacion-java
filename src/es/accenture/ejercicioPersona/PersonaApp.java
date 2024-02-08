package es.accenture.ejercicioPersona;

import java.util.Scanner;

public class PersonaApp {

	public static void main(String[] args) {
		Persona persona = new Persona();
		Scanner input = new Scanner(System.in);
		System.out.print("Introduzca el nombre: ");
		String nombre = input.nextLine();
		persona.setNombre(nombre);

		System.out.print("Introduzca el sexo: ");
		char sexo = input.next().toUpperCase().charAt(0);
		persona.setSexo(sexo);

		System.out.print("Introduzca la edad: ");
		int edad = input.nextInt();
		persona.setEdad(edad);
		if (persona.getEdad() > 18) {
			System.out.print("Introduzca el DNI: ");
			String dni = input.next();
			persona.setDni(dni);

			System.out.print("Introduzca el peso (en kilogramos): ");
			int peso = input.nextInt();
			persona.setPeso(peso);

			System.out.print("Introduzca la altura (en centímetros): ");
			double altura = input.nextDouble();
			persona.setAltura(altura);
		}

		System.out.println(persona.toString());
		if (persona.getEdad() > 18) {
			System.out.println(persona.calcularIMC());
		}
		
		input.close();
	}

}
