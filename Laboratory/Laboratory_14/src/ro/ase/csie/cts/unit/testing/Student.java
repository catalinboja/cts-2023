package ro.ase.csie.cts.unit.testing;

import javax.naming.InvalidNameException;

public class Student {
	
	public static final int MIN_AGE = 9;
	public static final int MAX_AGE = 110;
	public static final int MIN_NAME_LENGTH = 3;
	public static final int MIN_GRADE = 0;
	public static final int MAX_GRADE = 10;
	
	String name;
	int age;
	int grades[];
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) throws InvalidNameException {
		
		if(name.length() < MIN_NAME_LENGTH)
			throw new InvalidNameException();
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int[] getGrades() {
		return grades;
	}


	public void setGrades(int[] grades) {
		this.grades = grades;
	}
	
	public int getMinGrade() {
		return 0;
	}
	

}
