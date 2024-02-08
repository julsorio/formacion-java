package es.accenture.ejercicioEmpresaMantenimiento;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author andrea ravagli
 */
public class TrabajoPintura extends Servicio {
	private double superficie;
	private double precioPintura;

	public TrabajoPintura() {

	}

	public TrabajoPintura(TrabajoPintura trabajoPintura) {
		this.superficie = trabajoPintura.superficie;
		this.precioPintura = trabajoPintura.precioPintura;
	}

	public TrabajoPintura(String trabajador, Date fechaInicio, String cliente, double superficie,
			double precioPintura) {
		this.setTrabajador(trabajador);
		this.setFechaInicio(fechaInicio);
		this.setCliente(cliente);
		this.superficie = superficie;
		this.precioPintura = precioPintura;
	}

	@Override
	public double costeMaterial() {
		return (this.superficie / 7.8) * this.precioPintura;
	}

	@Override
	public double costeManoObra() {
		return (this.superficie / 10) * 9.5;
	}

	@Override
	public double costeTotal() {
		double total = 0;
		
		if(this.superficie < 50) {
			total = (costeMaterial() + costeManoObra()) + costeAdicional();
		} else {
			total = costeMaterial() + costeManoObra();
		}
		
		return total;
	}

	public double costeAdicional() {
		double adicional = 0;
		if(this.superficie < 50) {
			adicional = (costeMaterial() + costeManoObra()) * 0.15;
		}
		return adicional;

	}

	@Override
	public String detalleServicio() {
		DecimalFormat decimalFormat = new DecimalFormat("#.00");
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		String detalle = "TRABAJO DE PINTURA \n";
		detalle = detalle + "Cliente: " + this.getCliente() + "\n";
		detalle = detalle + "Fecha de inicio: " + dateFormat.format(this.getFechaInicio()) + "\n";
		detalle = detalle + "----------------------------------------- \n";
		detalle = detalle + "Pintor: " + this.getTrabajador() + "\n";
		detalle = detalle + "Coste Material: " + decimalFormat.format(costeMaterial()) + "\n";
		detalle = detalle + "Coste Mano Obra: " + decimalFormat.format(costeManoObra()) + "\n";
		detalle = detalle + "Coste Adicional: " + decimalFormat.format(costeAdicional()) + "\n";
		detalle = detalle + "TOTAL: " +  decimalFormat.format(costeTotal());

		return detalle;
	}

}
