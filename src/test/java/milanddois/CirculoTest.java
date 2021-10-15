package milanddois;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CirculoTest {

	@Test
	public void test() {
		
		  Circulo cir = new Circulo(2.00); 
		
		cir.setRaio(2.00);
		double area1=cir.getArea();
		double expected =12.5664;
		assertEquals(expected, area1,0.0001);
		
	
		cir.setRaio(100.64);
		double area2=cir.getArea();
		double expected2 =31819.3103;
		assertEquals(expected2, area2,0.0001);
		
		cir.setRaio(150.00);
		double area3=cir.getArea();
		double expected3 =70685.7750;
		assertEquals(expected3, area3,0.0001);
		
	}

}
