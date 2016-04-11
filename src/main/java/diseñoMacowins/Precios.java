package diseñoMacowins;

import java.math.BigDecimal;

public class Precios {
	
	public static final int PRECIO_PANTALON=250;
	public static final int PRECIO_SACO=300;
	public static final int PRECIO_CAMISA=200;
	public static final int VALORFIJO_NEGOCIO=50;
	//El valor fijo lo tendria que saber la prenda. Para darle mas sentido al ejercicio.
	
	public static final int PRECIO_ZAPATO=400;
	public static final int PRECIO_SOMBRERO=150;
	
	/*
	Capaz podriamos hacerlo con enum, para no tener una clase sin comportamiento.
	
	ejemplo:
	
	enum Precio {
		
		PRECIO_PANTALON(BigDecimal.valueOf(250)), PRECIO_SACO(BigDecimal.valueOf(300)), 
		PRECIO_CAMISA(BigDecimal.valueOf(200)), PRECIO_ZAPATO(BigDecimal.valueOf(400)), 
		PRECIO_SOMBRERO(BigDecimal.valueOf(150));
		
		private BigDecimal precioPrenda;
		
		private Precio(BigDecimal unPrecio){
			
			this.precioPrenda = unPrecio;
		}
		
		public BigDecimal getPrecio(){
			
			return this.precioPrenda;
			
		}
		
	}
	*/
	
}