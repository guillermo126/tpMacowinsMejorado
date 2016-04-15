package diseñoMacowins;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPrenda {
	
	Marca sarkany = new Sarkany();
	Marca armani = new Armani();
	
	Pantalon jeanNacional = new Pantalon(20, Origen.Nacional(), sarkany);
	Sombrero viceraInternacional = new Sombrero(2, Origen.Internacional(), armani);
	
	@Test
	public void testPantalonNacionalCalculaBienSuPrecioFinal(){
		
		assertTrue(jeanNacional.precioFinal().doubleValue() == 352);
		
	}
	
	@Test
	public void testViceraInternacionalCalculaBienSuPrecioFinal(){
	
		assertTrue(viceraInternacional.precioFinal().doubleValue() == 975);
	
	}
	
}
