package diseñoMacowins;

public class Zapato extends Prenda {
	//constructor
	public Zapato(int unTalle, boolean origenDeLaPrenda){
		super(Precios.PRECIO_ZAPATO + 5*unTalle, origenDeLaPrenda);
	}
}
