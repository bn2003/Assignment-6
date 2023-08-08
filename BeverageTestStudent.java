

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeverageTestStudent {
	Coffee cof;
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetSize() {
		cof = new Coffee("regular Coffee", Size.SMALL, false, true);
		assertTrue(cof.getSize().equals(Size.SMALL));
	}
	
	@Test
	void testGetExType() {
		cof = new Coffee("regular Coffee", Size.SMALL, false, true);
		assertTrue(cof.getType().equals(Type.COFFEE));
	}
	

}
