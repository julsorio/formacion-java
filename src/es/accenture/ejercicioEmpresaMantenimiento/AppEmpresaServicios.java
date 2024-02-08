package es.accenture.ejercicioEmpresaMantenimiento;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author andrea ravagli
 */
public class AppEmpresaServicios {

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		DecimalFormat decimalFormat = new DecimalFormat("#.00");
		
		TrabajoPintura trabajoPintura1 = null;
		TrabajoPintura trabajoPintura2 = null;
		TrabajoPintura trabajoPintura3 = null;
		RevisionAlarma revisionAlarma1 = null;
		RevisionAlarma revisionAlarma2 = null;
		
		double sumaCosteTotal = 0d;
		double sumaManoDeObra = 0d;
		
		List<Servicio> listaServicios = new ArrayList<>();
		
		try {
			trabajoPintura1 = new TrabajoPintura("Antonio", dateFormat.parse("2022-09-10"), "Seguros Martinez", 20, 4);
			trabajoPintura2 = new TrabajoPintura("Ana", dateFormat.parse("2022-08-08"), "Fruteria La Pera", 10, 3);
			trabajoPintura3 = new TrabajoPintura("Juan", dateFormat.parse("2022-09-30"), "Restaurante El Boqueron", 200, 2.5);
			revisionAlarma1 = new RevisionAlarma(dateFormat.parse("2022-08-06"), "Colegio Santa Maria", 34);
			revisionAlarma2 = new RevisionAlarma(dateFormat.parse("2022-10-01"), "Hotel Las Palmeras", 70);
			
			listaServicios.add(trabajoPintura1);
			listaServicios.add(trabajoPintura2);
			listaServicios.add(trabajoPintura3);
			listaServicios.add(revisionAlarma1);
			listaServicios.add(revisionAlarma2);
			
			for(Servicio serv : listaServicios) {
				System.out.println(serv.detalleServicio());
				sumaCosteTotal += serv.costeTotal();
				sumaManoDeObra += serv.costeManoObra();
			}
			
			System.out.println("Coste total de todos los trabajos: " + decimalFormat.format(sumaCosteTotal) + "\n");
			System.out.println("Coste total de mano de obra: " + decimalFormat.format(sumaManoDeObra));
			
			
		} catch (Exception e) {
			System.err.println("Se ha presentado un error " + e.getMessage());
		}
	}

}
