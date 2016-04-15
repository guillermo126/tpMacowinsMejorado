package diseñoMacowins;

import java.math.BigDecimal;

public class Pantalon extends Prenda {
	
	//Constructor
	public Pantalon(int centimetrosCuad, boolean origenDeLaPrenda, Marca unaMarca){
		
		super(Precios.PRECIO_PANTALON.add(BigDecimal.valueOf(centimetrosCuad)), origenDeLaPrenda, unaMarca);
		
	}
		
}
