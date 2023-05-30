package ro.ase.csie.cts.unit.testing.tests;

import static org.junit.Assert.*;

import javax.naming.InvalidNameException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.unit.testing.Student;

public class TestStudent {
	
	//test fixture
	Student student;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		student = new Student("John Doe", 21);
	}

	@After
	public void tearDown() throws Exception {
		student = null;
	}

	@Test
	public void testSetNameConformanceRight() throws InvalidNameException {		
		String newName = "John";
		String expectedResult = newName;
		
		Student student = new Student("Joe Doe", 21);
		student.setName(newName);
		
		assertEquals(expectedResult, student.getName());	
	}
	
	@Test
	public void testSetNameConformanceError() {
		String newInvalidName = "Yo";
		try {
			student.setName(newInvalidName);
			fail("We don't get the exception for invalid name");
		}
		catch(InvalidNameException ex) {
			assertTrue(true);
		}
	}
	
	@Test(expected = InvalidNameException.class)
	public void testSetNameConformanceErrorNewVersion() throws InvalidNameException {
		String newInvalidName = "Yo";
		student.setName(newInvalidName);
	}
	
	
	@Test
	public void testGetMinGradeOrderingDescending() {
		int grades[] = {10,10,9,5};
		student.setGrades(grades);
		
		int expectedResult = 5;
		int minGrade = student.getMinGrade();
		
		assertEquals(expectedResult, minGrade);
	}
	
	@Test(expected = Exception.class)
	public void testGetMinGradeCardinalityZero() {
		int grades[] = {};
		student.setGrades(grades);
		student.getMinGrade();
	}
	
	@Test
	public void testGetMinGradeCardinalityOne() {
		int grades[] = {10};
		student.setGrades(grades);
		
		int expectedResult = grades[0];
		int minGrade = student.getMinGrade();
		
		assertEquals(expectedResult, minGrade);
	}
	

}
