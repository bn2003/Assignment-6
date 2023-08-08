
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoffeeTestStudent {
	Coffee cof;
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetExtraShot() {
		cof = new Coffee("regular Coffee", Size.SMALL, false, true);
		assertTrue(cof.getExtraShot() == (false));
	}
	
	@Test
	void testGetExtraSyrup() {
		cof = new Coffee("regular Coffee", Size.SMALL, false, true);
		assertTrue(cof.getExtraSyrup() == (true));
	}
	
	@Test
	void testCalcPrice() {
		cof = new Coffee("regular Coffee", Size.SMALL, false, true);
		assertEquals(cof.calcPrice(), 2.5);
	}

}
