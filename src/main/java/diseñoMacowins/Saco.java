package diseñoMacowins;

public class Saco extends Prenda {
	//constructor
	public Saco( int cantidadBotones, boolean origenDeLaPrenda){
		super(Precios.PRECIO_SACO + cantidadBotones*10, origenDeLaPrenda);
	}
}
