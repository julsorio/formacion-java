package es.accenture.ejercicioEmpresaMantenimiento;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author andrea ravagli
 */
public class RevisionAlarma extends Servicio {
	private int numeroAlarmas;
	
	//constructor vacio
	public RevisionAlarma() {
		
	}
	
	//constructor de copia
	public RevisionAlarma(RevisionAlarma revisionAlarma) {
		this.numeroAlarmas = revisionAlarma.numeroAlarmas;
	}
	
	//constructor de parametros
	public RevisionAlarma(Date fechaInicio, String cliente, int numeroAlarmas) {
		this.setTrabajador("Revisor Especialista Contraincendios");
		this.setFechaInicio(fechaInicio);
		this.setCliente(cliente);
		this.numeroAlarmas = numeroAlarmas;
	}

	@Override
	public double costeMaterial() {
		return 0;
	}

	@Override
	public double costeManoObra() {
		double coste = (this.numeroAlarmas / 3.0); 
		return  coste * 40;
	}

	@Override
	public double costeTotal() {
		return costeManoObra();
	}
	
	public int getNumeroAlarmas() {
		return numeroAlarmas;
	}

	public void setNumeroAlarmas(int numeroAlarmas) {
		this.numeroAlarmas = numeroAlarmas;
	}

	@Override
	public String detalleServicio() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		DecimalFormat decimalFormat = new DecimalFormat("#.00");
		
		String detalle = "REVISION PERIODICA ALARMA CONTRA INCENDIOS \n";
		detalle += "Cliente: " + this.getCliente() + "\n";
		detalle += "Fecha: " + dateFormat.format(this.getFechaInicio()) + "\n";
		detalle += "------------------- \n";
		detalle += "TOTAL: " + decimalFormat.format(costeTotal()) + "\n";
		detalle += "------------------- \n";
		
		return detalle;
	}

}
