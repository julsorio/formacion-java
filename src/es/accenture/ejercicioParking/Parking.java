package es.accenture.ejercicioParking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author andrea ravagli
 */
public class Parking {
	private String nombre;
	private Map<Integer, String> matriculas;

	// constructor vacio
	public Parking() {
		matriculas = new HashMap<>();
		matriculas.put(0, "(vacia)");
		matriculas.put(1, "(vacia)");
		matriculas.put(2, "(vacia)");
		matriculas.put(3, "(vacia)");
		matriculas.put(4, "(vacia)");
		matriculas.put(5, "(vacia)");
		matriculas.put(6, "(vacia)");
		matriculas.put(7, "(vacia)");
		matriculas.put(8, "(vacia)");
		matriculas.put(9, "(vacia)");

	}

	public void entrada(String matricula, int plaza) throws ParkingException {
		if (plaza < 0) {
			throw new ParkingException("Plaza incorrecta", matricula);
		}

		if (matricula == null || matricula.length() < 4) {
			throw new ParkingException("Matricula incorrecta", matricula);
		}

		if (matriculas.get(plaza) != "(vacia)") {
			throw new ParkingException("Plaza ocupada", matricula);
		}

		if (matriculas.containsValue(matricula)) {
			throw new ParkingException("Matricula repetida", matricula);
		}
		
		matriculas.put(plaza, matricula);
		System.out.println("El coche " + matricula + " se coloco en la plaza " + plaza);
	}

	public int salida(String matricula) throws ParkingException {
		int plaza = 0;
		
		if (!matriculas.containsValue(matricula)) {
			throw new ParkingException("Matricula no existente", matricula);
		}

		Iterator<Map.Entry<Integer, String>> iterator = matriculas.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			if (entry.getValue().equals(matricula)) {
				plaza = entry.getKey();
				break;
			}
		}
		
		matriculas.put(plaza, "(vacia)");
		
		return plaza;

	}

	public int getPlazasTotales() {
		return matriculas.size();
	}
	
	public int getPlazasOcupadas() {
		int plazasOcupadas = 0;
		
		Iterator<Map.Entry<Integer, String>> iterator = matriculas.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			if (!entry.getValue().equals("(vacia)")) {
				plazasOcupadas ++;
			}
		}
		
		return plazasOcupadas;
	}
	
	public int getPlazasLibres() {
		return Collections.frequency(new ArrayList<String>(matriculas.values()), "(vacia)");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		String contenido = "Parking Avenida \n";
		contenido += "---------------------- \n";
		Iterator<Map.Entry<Integer, String>> iterator = matriculas.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			contenido += "Plaza " + entry.getKey() + " : " + entry.getValue() + "\n";
		}
		
		
		return contenido;
	}
}
