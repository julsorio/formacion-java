package es.accenture.ejercicioEmpresaMantenimiento;

import java.util.Date;

/**
 * @author andrea ravagli
 */
public abstract class Servicio {
	private String trabajador;
	private Date fechaInicio;
	private String cliente;
	
	public Servicio() {
		
	}
	
	public Servicio(String trabajador, Date fechaInicio, String cliente) {
		this.trabajador = trabajador;
		this.fechaInicio = fechaInicio;
		this.cliente = cliente;
	}
	
	public abstract double costeMaterial();
	
	public abstract double costeManoObra();
	
	public abstract double costeTotal();
	
	public abstract String detalleServicio();
	
	public String getTrabajador() {
		return trabajador;
	}
	public void setTrabajador(String trabajador) {
		this.trabajador = trabajador;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
}
