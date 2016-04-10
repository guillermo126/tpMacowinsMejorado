package diseñoMacowins;

import java.util.ArrayList;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
import java.time.LocalDate;

public class Negocio {
	//atributos
		private ArrayList<Venta> ventas;
		
		// constructor
		public Negocio(ArrayList<Venta> ventas2) {
			this.ventas = ventas2;
		}
		
		//getters y setters
		public ArrayList<Venta> getVentas() {
			return ventas;
		}
		public void setVentas(ArrayList<Venta> ventas) {
			this.ventas = ventas;
		}
		
		public long cantidadVendidaEl(LocalDate fecha){
			 Stream<Venta> ventasDelDia = ventas.stream().filter( v -> v.tieneIgualFechaQue(fecha));
			return  ventasDelDia.count();
		
		}
		
		public double gananciaTotalEl(LocalDate fecha){
	
			Stream<Venta> v1 = ventas.stream().filter( v -> v.getFecha() == fecha);
			DoubleStream  a= v1.mapToDouble(venta -> venta.gananciasXVentas());
			//.stream().mapToDouble(venta -> venta.gananciasXVentas()).sum()
			return a.sum();
		
		}

}
