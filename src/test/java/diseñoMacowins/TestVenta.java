package diseñoMacowins;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestVenta {
	
	ArrayList<Venta> ventas = new ArrayList<Venta>();
	Negocio macowins = new Negocio(ventas);
	
	Marca sarkany = new Sarkany();
	Marca armani = new Armani();
	
	//Pantalon jeanNacionalSarkany = new Pantalon(Precios.PRECIO_PANTALON, Origen.Nacional(), sarkany);
	//Saco sacoNacionalArmani = new Saco(Precios.PRECIO_SACO, Origen.Nacional(), armani);
	
	Pantalon jeanNacionalSarkany = new Pantalon(20, Origen.Nacional(), sarkany);
	Saco sacoNacionalArmani = new Saco(10, Origen.Nacional(), armani);
	
	Venta venta1 = new Venta(jeanNacionalSarkany, LocalDate.now());
	Venta venta2 = new Venta(sacoNacionalArmani, LocalDate.now());
	Venta venta3 = new Venta(sacoNacionalArmani, LocalDate.of(2016, Month.JANUARY, 2));
	
	
	@Before
	public void init(){
		
		ventas.add(venta1);
		ventas.add(venta2);
		ventas.add(venta3);
		
	}
	
	@Test
	public void testNegocioCalculaBienSuCantidadVendidaUnDiaDeterminado(){
		
		assertEquals(2, macowins.cantidadVendidaEl(LocalDate.now()));
	
	}
	
	@Test
	public void testNegocioCalculaBienSuGananciaTotalDeUnDiaDeterminado(){
		
		assertEquals(1094.5, macowins.gananciaTotalEl(LocalDate.now()), 0.1);
		
	}
	
}

