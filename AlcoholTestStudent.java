

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlcoholTestStudent {
	Alcohol alc;
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIsWeekend() {
		alc = new Alcohol("Mohito", Size.SMALL, false);
		assertTrue(alc.isWeekend() == (false));
	}
	
	@Test
	void testCalcPrice() {
		alc = new Alcohol("Mohito", Size.LARGE, true);
		assertEquals(alc.calcPrice(), 4.6);
	}

}
