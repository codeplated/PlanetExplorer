package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {

	@Test
	public void testClass() {
		PlanetExplorer pe=new PlanetExplorer(10,10,"(5,5)(7,8)");
		
		pe.displayGrid();
		assertTrue(pe.getGrid()[5][5]==2);
		
	}
}
