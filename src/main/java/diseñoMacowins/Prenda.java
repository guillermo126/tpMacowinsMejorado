package diseñoMacowins;

public abstract class Prenda {
	//atributos
		protected int precioBase;
		protected double tasaImportacion;
	
		//constructor
		public Prenda(int unPrecio,boolean origenDeLaPrenda){
			this.precioBase = unPrecio;
			
			if(origenDeLaPrenda){
				this.tasaImportacion=1;
			}else{
				this.tasaImportacion=0.3;
			}
		}
	
		public double precioFinal() {
			return this.tasaImportacion*(Precios.VALORFIJO_NEGOCIO + this.precioBase);
		}


}

