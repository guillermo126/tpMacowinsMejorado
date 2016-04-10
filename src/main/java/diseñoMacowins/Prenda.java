package diseñoMacowins;

public abstract class Prenda {
	//atributos
		protected int precioBase;
		protected double tasaImportacion;
	
		//constructor
		public Prenda(int precio,boolean cp){
			this.precioBase = precio;
			if(cp){
				this.tasaImportacion=1;
			}else{
				this.tasaImportacion=0.3;
			}
		}
	
		public double precioFinal() {
			return this.tasaImportacion*(Precios.VALORFIJO_NEGOCIO + this.precioBase);
		}


}

