
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class BevShopTestStudent {
	BevShop bev = new BevShop();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		bev = null;
	}

	
	@Test
	public void testIsValidAge() {
		assertFalse(bev.isValidAge(9));
	}
	
	@Test
	public void testIsMaxFruit() {
		assertTrue(bev.isMaxFruit(6));
	}
	
	@Test
	public void testIsEligibleForMore() {
		bev.startNewOrder(8, Day.MONDAY,"Mary", 22);
		bev.processCoffeeOrder("regular Coffee", Size.SMALL, false, false);
		bev.processAlcoholOrder("Mohito", Size.SMALL);
		bev.processSmoothieOrder("Detox", Size.MEDIUM, 1, false);
		bev.processSmoothieOrder("Detox", Size.LARGE, 1, false);
		
		assertTrue(bev.isEligibleForMore());
	}
	
	@Test
	public void testGetNumOfAlcoholDrink() {
		bev.startNewOrder(8, Day.MONDAY,"Mary", 22);
		bev.processCoffeeOrder("regular Coffee", Size.SMALL, false, false);
		bev.processAlcoholOrder("Mohito", Size.SMALL);
		bev.processSmoothieOrder("Detox", Size.MEDIUM, 1, false);
		bev.processSmoothieOrder("Detox", Size.LARGE, 1, false);

		assertEquals(bev.getNumOfAlcoholDrink(),1);
	}
	
	@Test
	public void testGetMaxNumOfFruits() {
		assertEquals(bev.getMaxNumOfFruits(),5,0);
	}

}
