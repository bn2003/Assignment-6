
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmoothieTestStudent {
	Smoothie smooth;
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetAddProtein() {
		smooth = new Smoothie("Detox", Size.MEDIUM, 1, false);
		assertTrue(smooth.getAddProtein() == (false));
	}
	
	@Test
	void testGetNumberOfFruits() {
		smooth = new Smoothie("Detox", Size.MEDIUM, 1, false);
		assertTrue(smooth.getNumOfFruits() == (1));
	}
	
	@Test
	void testCalcPrice() {
		smooth = new Smoothie("Detox", Size.MEDIUM, 1, true);
		assertEquals(smooth.calcPrice(), 5.0);
	}

}
