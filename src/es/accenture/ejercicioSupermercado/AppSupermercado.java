package es.accenture.ejercicioSupermercado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author andrea ravagli
 */
public class AppSupermercado {

	public static void main(String[] args) {
		Detergente detergente = new Detergente();
		detergente.setMarca("Limpiamas");
		detergente.setPrecio(2.5);
		detergente.setVolumen(33);
		detergente.setTipoEnvase("Botella de plastico");
		detergente.setDescuento(2);
		
		System.out.println(detergente.toString());
		
		Cereales cereales = new Cereales();
		cereales.setMarca("Crunchy");
		cereales.setTipoCereal("Espelta");
		cereales.setPrecio(3.0);
		cereales.setCaducidad(LocalDate.of(2022, 8, 2));
		
		System.out.println(cereales.toString());
		
		Vino vino = new Vino();
		vino.setMarca("Plimplar");
		vino.setTipoVino("Tinto");
		vino.setGradosAlcohol(12.0);
		vino.setPrecio(8.0);
		vino.setVolumen(330);
		vino.setTipoEnvase("Botella de cristal");
		vino.setCaducidad(LocalDate.of(2023, 7, 12));
		vino.setDescuento(5);
		
		System.out.println(vino.toString());
		
		List<Object> listaProductos = new ArrayList<>();
		listaProductos.add(cereales);
		listaProductos.add(vino);
		
		double totalProductos = 0;
		totalProductos += detergente.getPrecioDescuento();
		totalProductos += cereales.getPrecio();
		totalProductos += vino.getPrecioDescuento();
		
		System.out.println("Precio total de todos los productos: " + totalProductos);
		
		int totalCalorias = 0;
		
		ArrayList<EsAlimento> listaAlimentos = new ArrayList<>();
		listaAlimentos.add(cereales);
		listaAlimentos.add(vino);
		
		for(EsAlimento obj : listaAlimentos) {
			totalCalorias += obj.getCalorias();
		}
		
		System.out.println("Total calorias: " + totalCalorias);
	}

}
