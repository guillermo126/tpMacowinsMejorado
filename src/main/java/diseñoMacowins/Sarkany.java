package diseñoMacowins;

public class Sarkany implements Marca{

	//Metodos
	@Override
	public double coeficienteMarca(double unPrecioOriginal){
		
		if(unPrecioOriginal > 500){
			
			return unPrecioOriginal*0.35;
			
		}
		
		else{
			
			return unPrecioOriginal*0.10;
			
		}
		
	}

}
