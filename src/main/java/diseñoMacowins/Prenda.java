package diseñoMacowins;

public abstract class Prenda {
	
	//Atributos
	protected int precioBase;
	protected double tasaImportacion;
	private Marca marca;
	
	//Constructor
	public Prenda(int unPrecio,boolean origenDeLaPrenda){
		
		this.precioBase = unPrecio;
			
		if(origenDeLaPrenda){
			this.tasaImportacion=1;
		}else{
			this.tasaImportacion=0.3;
		}
	}
	
	//Metodos
	public double precioFinal() {
		
		return this.precioOriginal() * this.tasaImportacion * this.marca.coeficienteMarca(this.precioOriginal());
	
	}
	
	public double precioOriginal(){
		
		return Precios.VALORFIJO_NEGOCIO + this.precioBase;
		
	}

}

