package diseñoMacowins;

import java.time.LocalDate;

public class Venta {
	//atributos
	private Prenda tipoPrenda;
	private LocalDate fecha;

	//construtor
	public Venta(Prenda tp, LocalDate dia){
		this.tipoPrenda= tp;
		this.fecha= dia;
	}
	
		//getters y setters
	public Prenda getTipoPrenda() {
		return tipoPrenda;
	}
	public void setTipoPrenda(Prenda tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	public boolean tieneIgualFechaQue(LocalDate f){
		return fecha.isEqual(f);
	}
	
	public double gananciasXVentas(){
		return  tipoPrenda.precioFinal();
		
	}

}