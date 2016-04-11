package diseñoMacowins;

public class Sombrero extends Prenda {
	//constructor
	public Sombrero(int coeficienteMet, boolean origenDeLaPrenda){
		super(Precios.PRECIO_SOMBRERO*(1 + coeficienteMet), origenDeLaPrenda);
	}
}
