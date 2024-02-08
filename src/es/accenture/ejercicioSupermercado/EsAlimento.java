package es.accenture.ejercicioSupermercado;

import java.time.LocalDate;

/**
 * @author andrea ravagli
 */
public interface EsAlimento {
	public void setCaducidad(LocalDate fechaCaducidad);
	
	public LocalDate getCaducidad();
	
	public int getCalorias();
}
