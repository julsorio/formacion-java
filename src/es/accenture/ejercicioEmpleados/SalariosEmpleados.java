package es.accenture.ejercicioEmpleados;

public class SalariosEmpleados {

	public static void main(String[] args) {
		Empleado empleado = new Empleado("12345678A", "Lucas Guerrero Arjona",  1150.00, 4, 15.0, true, 2);
		System.out.println(empleado.toString());
		System.out.println("El salario de " + empleado.getNombre() + " es " + empleado.calcularSueldo());
		
		Empleado empleado2 = new Empleado("11111111H", "Francisco Perez Anton", 1150.00, 4, 15.0, false, 0);
		System.out.println(empleado2.toString());
		System.out.println("El salario de " + empleado2.getNombre() + " es " + empleado2.calcularSueldo());
		
		Empleado empleado3 = new Empleado("22222222G", "Marta Anton Sanz", 1150.00, 0, 15.0, true, 0);
		System.out.println(empleado3.toString());
		System.out.println("El salario de " + empleado3.getNombre() + " es " + empleado3.calcularSueldo());
		
	}

}
