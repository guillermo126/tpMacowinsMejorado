package diseñoMacowins;

public class Pantalon extends Prenda {
	//constructor
		public Pantalon( int centimetrosCuad, boolean cp){
			super( Precios.PRECIO_PANTALON + centimetrosCuad, cp);
		}
}
