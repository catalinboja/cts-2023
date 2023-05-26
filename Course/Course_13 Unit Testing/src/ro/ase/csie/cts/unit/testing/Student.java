package ro.ase.csie.cts.unit.testing;

public class Student {
	
	public static final int MIN_AGE = 9;
	public static final int MAX_AGE = 110;
	
	int age;
	String name;
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) throws Exception {
		if(age < MIN_AGE)
			throw new Exception();
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
