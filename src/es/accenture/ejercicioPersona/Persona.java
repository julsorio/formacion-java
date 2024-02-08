package es.accenture.ejercicioPersona;

public class Persona {
	private String nombre;
	private char sexo;
	private int edad;
	private String dni;
	private int peso;
	private double altura;

//constructor vacio
	public Persona() {

	}

//constructor copia
	public Persona(Persona pr) {
		this.nombre = pr.nombre;
		this.sexo = pr.sexo;
		this.edad = pr.edad;
		this.dni = pr.dni;
		this.peso = pr.peso;
		this.altura = pr.altura;
	}

	public boolean comprobarSexo() {
		boolean cumple = false;

		if (getSexo() == 'H' || getSexo() == 'M') {
			cumple = true;
		}

		return cumple;
	}

	public boolean esMayorDeEdad() {
		boolean cumple = false;

		if (getEdad() > 18) {
			cumple = true;
		}
		return cumple;
	}

	public String calcularIMC() {
		String texto = "";
		
		//formula IMC -> peso (kg) / estatura (m)^2
		
		double alturaEnMetros = (this.altura / 100);
		
		double resultado = this.peso / Math.pow(alturaEnMetros, 2);

		if ((int) resultado < 20) {
			texto = "Esta por debajo de su peso ideal";
		} else if ((int)resultado >= 20 && (int) resultado <= 25) {
			texto = "Esta en su peso ideal";

		} else {
			texto = "Esta en sobrepeso";

		}
		
		return texto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;

		if (!comprobarSexo()) {
			this.sexo = 'H';
		}

	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		String texto = "Datos personales \n";

		texto += "Nombre: " + getNombre() + "\n" + "Sexo: "
				+ ((getSexo() == 'h' || getSexo() == 'H') ? "Hombre" : "Mujer") + "\n" + "Edad: "
				+ Integer.toString(getEdad()) + "\n" + ((getEdad() > 18) ? "DNI: " + getDni() : "") + "\n"
				+ ((getEdad() > 18) ? "Su Peso: " + getPeso() : "") + "\n"
				+ ((getEdad() > 18) ? "Su Altura: " + getAltura() : "") + "\n";

		return texto;
	}

}
