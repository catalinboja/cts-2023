package ro.ase.csie.cts.design.patterns.builder;

public class Superhero {
	
	int age;
	String name;
	boolean isWounded;
	int lifePoints;
	String primaryWeapon;
	String secondaryWeapon;
	String superPower;
	
	private Superhero() {
		
	}

	private Superhero(int age, String name, boolean isWounded, int lifePoints, String primaryWeapon,
			String secondaryWeapon, String superPower) {
		super();
		this.age = age;
		this.name = name;
		this.isWounded = isWounded;
		this.lifePoints = lifePoints;
		this.primaryWeapon = primaryWeapon;
		this.secondaryWeapon = secondaryWeapon;
		this.superPower = superPower;
	}

	private void setAge(int age) {
		this.age = age;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setWounded(boolean isWounded) {
		this.isWounded = isWounded;
	}

	private void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}

	private void setPrimaryWeapon(String primaryWeapon) {
		this.primaryWeapon = primaryWeapon;
	}

	private void setSecondaryWeapon(String secondaryWeapon) {
		this.secondaryWeapon = secondaryWeapon;
	}

	private void setSuperPower(String superPower) {
		this.superPower = superPower;
	}
	
	
	public static class SuperheroBuilder {
		private Superhero superhero;
		public SuperheroBuilder(String name, int age) {
			this.superhero = new Superhero();
			this.superhero.name = name;
			this.superhero.age = age;
		}
		
		public SuperheroBuilder isWounded() {
			this.superhero.isWounded = true;
			return this;
		}
		
		public SuperheroBuilder addSuperPower(String power) {
			this.superhero.superPower = power;
			return this;
		}
		
		//same for other attributes
		
		public Superhero build() {
			return this.superhero;
		}
	}
	

}
