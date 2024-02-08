package es.accenture.ejercicioFigurasSuperheroes;

/**
 * @author andrea ravagli
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coleccion {
	private String nombreColeccion;
	private List<Figura> listaFiguras;
	
	public Coleccion() {
		listaFiguras = new ArrayList<>();
	}
	
	/**
	 * 
	 * @param figura
	 */
	public void incluirFigura(Figura figura) {
		this.listaFiguras.add(figura);
	}
	
	/**
	 * 
	 * @param cantidad
	 * @param id
	 */
	public void subirPrecio(double cantidad, String id) {
		for(int pos = 0; pos < listaFiguras.size(); pos ++) {
			if(listaFiguras.get(pos).getCodigo().equals(id)) {
				listaFiguras.get(pos).setPrecio(listaFiguras.get(pos).getPrecio() + cantidad);
				break;
			}
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public String conCapa() {
		String texto = "";
		
		for(int pos = 0; pos < listaFiguras.size(); pos ++) {
			if(listaFiguras.get(pos).getSuperheroe().isCapa()) {
				texto += listaFiguras.get(pos).getSuperheroe().getNombre() + "\n";
			}
		}
		
		return texto;
	}
	
	/**
	 * 
	 * @return
	 */
	public String masValioso() {
		double precioMayor = 0;
		String figura = "";
		
		for(int pos = 0; pos < listaFiguras.size(); pos ++) {
			if(listaFiguras.get(pos).getPrecio() > precioMayor) {
				precioMayor = listaFiguras.get(pos).getPrecio();
				figura = listaFiguras.get(pos).getSuperheroe().getNombre();
			}
		}
		
		return "La figura de " + figura + " tiene el mayor precio de la coleccion: " + precioMayor;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getValorColeccion() {
		double valorColeccion = 0;
		
		for(int pos = 0; pos < listaFiguras.size(); pos ++) {
			valorColeccion += listaFiguras.get(pos).getPrecio();
		}
		
		return valorColeccion;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getVolumenColeccion() {
		double volumenColeccion = 0;
		
		for(int pos = 0; pos < listaFiguras.size(); pos ++) {
			volumenColeccion += listaFiguras.get(pos).getDimension().getVolumen();
		}
		
		return 200 + volumenColeccion;
	}

	public String getNombreColeccion() {
		return nombreColeccion;
	}

	public void setNombreColeccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
	}

	public List<Figura> getListaFiguras() {
		return listaFiguras;
	}

	public void setListaFiguras(List<Figura> listaFiguras) {
		this.listaFiguras = listaFiguras;
	}

	@Override
	public String toString() {
		return Arrays.toString(listaFiguras.toArray());
	}

}
