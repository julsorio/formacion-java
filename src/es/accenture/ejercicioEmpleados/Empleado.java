package es.accenture.ejercicioEmpleados;

public class Empleado {
	private static final double PAGO_HORA_EXTRA = 10.0;

	private String nif;
	private String nombre;
	private double sueldoBase;
	private int horasExtras;
	private double tipoIrpf;
	private boolean casado;
	private int numHijos;

	// constructor vacio
	public Empleado() {

	}

	// constructor copia
	public Empleado(Empleado empleado) {
		this.nif = empleado.nif;
		this.nombre = empleado.nombre;
		this.sueldoBase = empleado.sueldoBase;
		this.horasExtras = empleado.horasExtras;
		this.tipoIrpf = empleado.tipoIrpf;
		this.casado = empleado.casado;
		this.numHijos = empleado.numHijos;
	}

	// constructor de parámetros
	public Empleado(String nit, String nombre, double sueldoBase, int horasExtras, double tipoIrpf, boolean casado,
			int numHijos) {
		this.nif = nit;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.horasExtras = horasExtras;
		this.tipoIrpf = tipoIrpf;
		this.casado = casado;
		this.numHijos = numHijos;
	}
//Método calcularImporteHorasExtras
	public double calcularImporteHorasExtras() {
		return this.horasExtras * PAGO_HORA_EXTRA;
	}
//Método calcularSueldoBruto
	public double calcularSueldoBruto() {
		return this.sueldoBase + calcularImporteHorasExtras();
	}
//Método calcularRetencionIrpf
	public double calcularRetencionIrpf() {
		if (this.isCasado()) {
			this.tipoIrpf -= 2;
		}
		
		if(this.numHijos > 0) {
			int ind = 1;
			while(ind <= this.numHijos) {
				this.tipoIrpf -= 1;
				ind ++;
			}
		}
		
		return (calcularSueldoBruto() * this.tipoIrpf) / 100;
	}
//Método calcularSueldo 
	public double calcularSueldo() {
		return calcularSueldoBruto() - calcularRetencionIrpf();
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double getTipoIrpf() {
		return tipoIrpf;
	}

	public void setTipoIrpf(double tipoIrpf) {
		this.tipoIrpf = tipoIrpf;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getNumHijos() {
		return numHijos;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}

	@Override
	public String toString() {
		return "Datos del empleado: " + nif + " " + nombre + "\n Sueldo Base: " + sueldoBase + "\n Horas Extras: "
				+ horasExtras + " \n Tipo IRPF: " + tipoIrpf + "\n Casado:" + casado + "\n Numero de Hijos: "
				+ numHijos;
	}

}
