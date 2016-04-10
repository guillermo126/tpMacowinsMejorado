package diseñoMacowins;

public class Zapato extends Prenda {
	//constructor
	public Zapato(int talle, boolean cp){
		super( Precios.PRECIO_ZAPATO + 5*talle, cp);
	}
}
