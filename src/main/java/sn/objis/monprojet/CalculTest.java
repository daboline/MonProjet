package sn.objis.monprojet;

import junit.framework.TestCase;

public class CalculTest extends TestCase {
 private Calcul calcul;
	@Override
		protected void setUp() throws Exception {
			// TODO Auto-generated method stub
			super.setUp();
			calcul =new Calcul();
		}
	public void testSomme(){
		assertTrue(calcul.somme(4, 5)==9);
		
	}
	
	public void testProduit(){
		assertTrue(calcul.produit(4, 5)==20);
		
		
		
	}

}
