package sn.objis.monprojet;

import junit.framework.TestCase;

public class CalculTest extends TestCase {
 private Calcul calcul;
	protected void setUp() throws Exception {
		
		calcul=new Calcul();
	}
	public void testSomme(){
		assertTrue(calcul.somme(5, 5)==10);
		
	}
	
	public void testProduit(){
		assertTrue(calcul.produit(5, 5)==25);
		
		
		
	}

}
