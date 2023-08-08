

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTestStudent {

	Customer cust;
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetName() {
		cust = new Customer("John", 22);
		assertTrue(cust.getName().equals("John"));
	}
	
	@Test
	void testSetName() {
		cust = new Customer("John", 22);
		cust.setName("Mary");
		assertTrue(cust.getName().equals("Mary"));
	}
	
	@Test
	void testGetAge() {
		cust = new Customer("John", 22);
		
		assertEquals(cust.getAge(), 22);
	}
	
	@Test
	void testSetAge() {
		cust = new Customer("John", 22);
		
		cust.setAge(99);
		assertEquals(cust.getAge(), 99);
	}
	
	

}
