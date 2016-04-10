package diseñoMacowins;

public class Saco extends Prenda {
	//constructor
	public Saco( int cantidadBotones, boolean cp){
		super( Precios.PRECIO_SACO + cantidadBotones*10, cp);
	}
}
