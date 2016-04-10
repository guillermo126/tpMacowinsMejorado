package diseñoMacowins;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
public class TestVentas {
	ArrayList<Venta> ventas = new ArrayList<Venta>();
	Negocio macowins = new Negocio(ventas);
	
	Pantalon jean = new Pantalon(Precios.PRECIO_PANTALON,Origen.Nacional());
	Saco verde = new Saco(Precios.PRECIO_SACO,Origen.Nacional());
	Venta v1 = new Venta(jean, LocalDate.now());
	Venta v2 = new Venta(verde, LocalDate.now());
	Venta v3 = new Venta(verde, LocalDate.of(2016, Month.JANUARY, 2));
	
	
	@Before
	public void agregarVenta(){
		ventas.add(v1);
		ventas.add(v2);
		ventas.add(v3);
	}
	
	@Test
	public void testDeLaVenta(){
		assertEquals(2, macowins.cantidadVendidaEl(LocalDate.now()));
	}
	
}

