package diseñoMacowins;

import java.math.BigDecimal;

public class Saco extends Prenda {
	
	//Constructor
	public Saco(int cantidadBotones, boolean origenDeLaPrenda, Marca unaMarca){
		
		super(Precios.PRECIO_SACO.add(BigDecimal.valueOf(cantidadBotones*10)), origenDeLaPrenda, unaMarca);
	
	}
}
