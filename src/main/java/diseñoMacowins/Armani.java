package diseñoMacowins;

import java.math.BigDecimal;

public class Armani implements Marca{

	//Metodos
	@Override
	public BigDecimal coeficienteMarca(BigDecimal unPrecioOriginal) {
		
		return unPrecioOriginal.multiply(BigDecimal.valueOf(0.65));
		
	}

}
