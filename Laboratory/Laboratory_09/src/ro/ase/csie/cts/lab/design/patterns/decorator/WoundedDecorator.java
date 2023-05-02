package ro.ase.csie.cts.lab.design.patterns.decorator;

import ro.ase.csie.cts.lab.design.patterns.adapter.ACMESuperHeroInterface;

public class WoundedDecorator extends ACMEHeroDecorator{

	public WoundedDecorator(ACMESuperHeroInterface objectToDecorate) {
		super(objectToDecorate);
	}

	@Override
	public void run() {
		System.out.println(
				"Is wounded. Is not running. Is walking");
	}
	
	

}
