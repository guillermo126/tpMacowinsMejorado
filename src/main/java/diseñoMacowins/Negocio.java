package diseñoMacowins;

import java.util.ArrayList;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
import java.time.LocalDate;

public class Negocio {
	
	//Atributos
	private ArrayList<Venta> ventas;
		
	//Constructor
	public Negocio(ArrayList<Venta> unasVentas) {
		this.setVentas(unasVentas);
	}
		
	//Getters
	public ArrayList<Venta> getVentas() {
		return ventas;
	}
	
	//Setters
	public void setVentas(ArrayList<Venta> unasVentas) {
		this.ventas = unasVentas;
	}
		
	//Metodos
	public long cantidadVendidaEl(LocalDate unaFecha){
		
		Stream<Venta> ventasDelDia = ventas.stream().filter(unaVenta -> unaVenta.getFecha().equals(unaFecha));
			
		return  ventasDelDia.count();

	}
		
	public double gananciaTotalEl(LocalDate unaFecha){
	
		Stream<Venta> ventasDeLaFecha = ventas.stream().filter(unaVenta -> unaVenta.getFecha().equals(unaFecha));
		
		DoubleStream listaDeGanancias = ventasDeLaFecha.mapToDouble(unaVenta -> unaVenta.getTipoPrenda().precioFinal().doubleValue());
		
		return listaDeGanancias.sum();
		
	}

}
