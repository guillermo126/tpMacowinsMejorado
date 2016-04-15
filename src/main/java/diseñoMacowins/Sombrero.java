package diseñoMacowins;

import java.math.BigDecimal;

public class Sombrero extends Prenda {
	
	//Constructor
	public Sombrero(int coeficienteMetro, boolean origenDeLaPrenda, Marca unaMarca){
		
		super(Precios.PRECIO_SOMBRERO.multiply(BigDecimal.valueOf(1 + coeficienteMetro)), origenDeLaPrenda, unaMarca);
	
	}
	
}
