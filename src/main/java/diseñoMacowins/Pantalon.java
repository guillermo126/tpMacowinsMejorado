package diseñoMacowins;

public class Pantalon extends Prenda {
	//constructor
		public Pantalon(int centimetrosCuad, boolean origenDeLaPrenda){
			super(Precios.PRECIO_PANTALON + centimetrosCuad, origenDeLaPrenda);
		}
}
