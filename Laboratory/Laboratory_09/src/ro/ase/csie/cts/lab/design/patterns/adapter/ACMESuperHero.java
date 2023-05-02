package ro.ase.csie.cts.lab.design.patterns.adapter;

public class ACMESuperHero implements ACMESuperHeroInterface{

	String name;
	float hitpoints;
	
	public ACMESuperHero(String name, float hitpoints) {
		super();
		this.name = name;
		this.hitpoints = hitpoints;
	}

	@Override
	public void run() {
		System.out.println(this.name + " is running");
	}

	@Override
	public void jump() {
		System.out.println(this.name + " is jumping");
	}

	@Override
	public void attack(String enemy) {
		System.out.println(this.name + " attacks " + enemy);
	}

	@Override
	public String getName() {
		return this.name;
	}

}
