package diseñoMacowins;

import java.time.LocalDate;

public class Venta {
	
	//Atributos
	private Prenda tipoPrenda;
	private LocalDate fechaDeVenta;

	//Construtor
	public Venta(Prenda unTipoDePrenda, LocalDate unaFecha){
		
		this.setTipoPrenda(unTipoDePrenda);
		this.setFecha(unaFecha);
	
	}
	
	//Getters
	public Prenda getTipoPrenda() {
		return tipoPrenda;
	}

	public LocalDate getFecha() {
		return fechaDeVenta;
	}
	
	//Setters
	public void setTipoPrenda(Prenda tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}
	
	public void setFecha(LocalDate unaFecha) {
		this.fechaDeVenta = unaFecha;
	}
	
}