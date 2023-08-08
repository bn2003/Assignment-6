
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Interface for an Order
 * 
 * @author Farnaz Eivazi
 * @version 8/22/2022
 *
 */

public class OrderTestStudent {
	Order orderOne, orderTwo, orderThree, orderFour;

	@Before
	public void setUp() throws Exception {
		orderOne = new Order(8, Day.MONDAY, new Customer("Mary", 22));
		orderTwo = new Order(12, Day.SATURDAY, new Customer("John", 45));
		orderThree = new Order(10, Day.SUNDAY, new Customer("Kate", 21));
	}

	@After
	public void tearDown() throws Exception {
		orderOne = orderTwo = orderThree = null;
	}

	@Test
	public void testGetDay() {
		
		assertTrue(orderOne.getDay().equals(Day.MONDAY));
		assertTrue(orderTwo.getDay().equals(Day.SATURDAY));
		assertTrue(orderThree.getDay().equals(Day.SUNDAY));
	}
	@Test
	public void testGetOrderDay() {
		
		assertTrue(orderOne.getOrderDay().equals(Day.MONDAY));
		assertTrue(orderTwo.getOrderDay().equals(Day.SATURDAY));
		assertTrue(orderThree.getOrderDay().equals(Day.SUNDAY));
	}

	@Test
	public void testGetTotalitem() {
		orderOne.addNewBeverage("regular Coffee", Size.SMALL, false, false);
		orderOne.addNewBeverage("Mohito", Size.SMALL);
		orderOne.addNewBeverage("Detox", Size.MEDIUM, 1, false);

		assertEquals(orderOne.getTotalItems(),3);
		
		orderTwo.addNewBeverage("regular Coffee", Size.MEDIUM, true, false);
		orderTwo.addNewBeverage("Mohito", Size.SMALL);
		orderTwo.addNewBeverage("Detox", Size.MEDIUM, 4, true);

		assertEquals(orderTwo.getTotalItems(),3);

	}

}
