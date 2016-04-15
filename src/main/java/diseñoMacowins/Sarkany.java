package diseñoMacowins;

import java.math.BigDecimal;

public class Sarkany implements Marca{

	//Metodos
	@Override
	public BigDecimal coeficienteMarca(BigDecimal unPrecioOriginal){
		
		if(unPrecioOriginal.doubleValue() > 500){
			
			return unPrecioOriginal.multiply(BigDecimal.valueOf(0.35));
			
		}
		
		else{
			
			return unPrecioOriginal.multiply(BigDecimal.valueOf(0.10));
			
		}
		
	}

}
