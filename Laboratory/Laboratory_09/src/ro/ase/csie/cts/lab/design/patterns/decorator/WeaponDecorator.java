package ro.ase.csie.cts.lab.design.patterns.decorator;

import ro.ase.csie.cts.lab.design.patterns.adapter.ACMESuperHeroInterface;

public class WeaponDecorator extends ACMEHeroDecorator{
	
	String weapon;
	
	public WeaponDecorator(
			ACMESuperHeroInterface objectToDecorate,
			String weapon) {
		super(objectToDecorate);
		this.weapon = weapon;
	}

	@Override
	public void attack(String enemy) {
		super.attack(enemy);
		System.out.println("Is using a " + this.weapon);
	}
	
	

}
