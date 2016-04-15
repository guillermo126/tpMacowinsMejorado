package diseñoMacowins;

import java.math.BigDecimal;

public abstract class Prenda {
	
	//Atributos
	private BigDecimal precioBase;
	private BigDecimal tasaImportacion;
	private Marca marca;
	
	//Constructor
	public Prenda(BigDecimal unPrecio, boolean origenDeLaPrenda, Marca unaMarca){
		
		this.precioBase = unPrecio;
		this.marca = unaMarca;
		
		if(origenDeLaPrenda){
			this.tasaImportacion = BigDecimal.ZERO;
		}else{
			this.tasaImportacion = BigDecimal.valueOf(0.3);
		}
	}
	
	//Metodos
	public BigDecimal precioFinal() {
		
		return this.precioOriginal()
				.add(this.marca.coeficienteMarca(this.precioOriginal()))
				.add(this.precioOriginal().multiply(this.tasaImportacion));
	
	}
	
	public BigDecimal precioOriginal(){
		
		return this.precioBase.add(Precios.VALORFIJO_NEGOCIO);
		
	}

}

