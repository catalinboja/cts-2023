package ro.ase.csie.cts.lab.design.patterns.decorator;

import ro.ase.csie.cts.lab.design.patterns.adapter.ACMESuperHeroInterface;

public abstract class ACMEHeroDecorator 
	implements ACMESuperHeroInterface {

	ACMESuperHeroInterface objectToDecorate;
	
	
	public ACMEHeroDecorator(ACMESuperHeroInterface objectToDecorate) {
		this.objectToDecorate = objectToDecorate;
	}

	@Override
	public void run() {
		this.objectToDecorate.run();
	}

	@Override
	public void jump() {
		this.objectToDecorate.jump();
	}

	@Override
	public void attack(String enemy) {
		this.objectToDecorate.attack(enemy);
	}

	@Override
	public String getName() {
		return this.objectToDecorate.getName();
	}
	
	
	
}
