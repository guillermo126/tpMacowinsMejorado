package diseñoMacowins;

import static org.junit.Assert.*;

import org.junit.Test;
public class Test1 {
	Pantalon jean = new Pantalon(50,Origen.Nacional());
	Sombrero vicera = new Sombrero(2,Origen.Nacional());
	
	
	
	@Test
	public void TestPantalonSale350YSombrero450(){
		assertTrue(jean.precioFinal()==350);
		assertTrue(vicera.precioFinal()==500);
	}
}
