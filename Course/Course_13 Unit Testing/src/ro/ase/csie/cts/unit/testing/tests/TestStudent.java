package ro.ase.csie.cts.unit.testing.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.unit.testing.Student;

public class TestStudent {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Only once before everything");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Only once after all tests");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Another test !");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Bye test !");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSuccess() {
		assertTrue(true);
	}
	
	@Test
	public void testSetAgeRight() throws Exception {
		//1. define input values
		Student student = new Student();
		int newAge = 23;
		
		//2. define expected result
		int expectedAge = 23;
		
		//3. test the method by calling it
		student.setAge(newAge);
		int actualAge = student.getAge();
		
		//4. check the results
		assertEquals(expectedAge, actualAge);
			
	}
	
	@Test
	public void testSetAgeRightLowerBoundary() throws Exception {
		Student student = new Student();
		int newAge = Student.MIN_AGE;
		int expectedAge = Student.MIN_AGE;
		
		student.setAge(newAge);
		int actualAge = student.getAge();
		assertEquals(expectedAge, actualAge);
	}
	
	@Test
	public void testSetAgeRightOutsideLowerBoundary() {
		Student student = new Student();
		int newAge = Student.MIN_AGE - 1;
		
		try {
			student.setAge(newAge);
			fail("We didn't got the exception");
		}
		catch(Exception ex) {
			assertTrue(true);
		}	
	}
	
	@Test(expected = Exception.class)
	public void testSetAgeRightOutsideLowerBoundary2() throws Exception {
		Student student = new Student();
		int newAge = Student.MIN_AGE - 1;
		student.setAge(newAge);	
	}
	

}
