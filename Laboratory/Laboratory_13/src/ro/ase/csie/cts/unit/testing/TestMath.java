package ro.ase.csie.cts.unit.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMath {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testTrue() {
		assertTrue(true);
	}
	
	@Test
	public void testAddition() {
		int inputA = 3;
		int inputB = 2;
		int expectedResult = 5;
		
		int actualResult = Math.addition(inputA, inputB);
		
		assertEquals(expectedResult, actualResult);
	}

}
