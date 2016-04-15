package diseñoMacowins;

import java.math.BigDecimal;

public class Precios {
	
	public static final BigDecimal PRECIO_PANTALON = BigDecimal.valueOf(250);
	public static final BigDecimal PRECIO_SACO = BigDecimal.valueOf(300);
	public static final BigDecimal PRECIO_CAMISA = BigDecimal.valueOf(200);
	public static final BigDecimal VALORFIJO_NEGOCIO = BigDecimal.valueOf(50);
	public static final BigDecimal PRECIO_ZAPATO = BigDecimal.valueOf(400);
	public static final BigDecimal PRECIO_SOMBRERO = BigDecimal.valueOf(150);
	
	/* Otra idea:
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