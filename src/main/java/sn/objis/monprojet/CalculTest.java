package sn.objis.monprojet;

import junit.framework.TestCase;

public class CalculTest extends TestCase {
 private Calcul calcul;
	protected void setUp() throws Exception {
		super.setUp();
		calcul=new Calcul();
	}
	public void testSomme(){
		assertTrue(calcul.somme(5, 5)==10);
		
	}
	
	public void testProduit(){
		assertTrue(calcul.somme(5, 5)==10);
		
	}

}
