package diseñoMacowins;

import java.math.BigDecimal;

public class Zapato extends Prenda {
	
	//Constructor
	public Zapato(int unTalle, boolean origenDeLaPrenda, Marca unaMarca){
		
		super(Precios.PRECIO_ZAPATO.add(BigDecimal.valueOf(5 * unTalle)), origenDeLaPrenda, unaMarca);
	
	}
}
