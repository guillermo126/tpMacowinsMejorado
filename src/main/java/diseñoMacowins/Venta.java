package diseñoMacowins;

import java.time.LocalDate;

public class Venta {
	//atributos
	private Prenda tipoPrenda;
	private LocalDate fechaDeVenta;

	//construtor
	public Venta(Prenda unTipoDePrenda, LocalDate unaFecha){
		this.tipoPrenda= unTipoDePrenda;
		this.fechaDeVenta= unaFecha;
	}
	
	//getters y setters
	public Prenda getTipoPrenda() {
		return tipoPrenda;
	}
	public void setTipoPrenda(Prenda tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}
	public LocalDate getFecha() {
		return fechaDeVenta;
	}
	public void setFecha(LocalDate unaFecha) {
		this.fechaDeVenta = unaFecha;
	}
	
	public boolean tieneIgualFechaQue(LocalDate unaFecha){
		return fechaDeVenta.isEqual(unaFecha);
	}
	
	public double gananciasXVentas(){
		return  tipoPrenda.precioFinal();
		
	}

}