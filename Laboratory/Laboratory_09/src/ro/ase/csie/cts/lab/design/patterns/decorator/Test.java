package ro.ase.csie.cts.lab.design.patterns.decorator;

import ro.ase.csie.cts.lab.design.patterns.adapter.ACMESuperHero;
import ro.ase.csie.cts.lab.design.patterns.adapter.ACMESuperHeroInterface;

public class Test {

	public static void main(String[] args) {
		
		ACMESuperHeroInterface superman = 
				new ACMESuperHero("Superman", 1000);
		superman.attack("Joker");
		superman.run();
		
		superman = new WoundedDecorator(superman);
		
		superman.attack("Joker");
		superman.run();
		
		superman = new WeaponDecorator(superman, "Laser pistol");
		
		superman.attack("Joker");
		superman.run();
		
		ACMESuperHeroInterface batman = 
				new ACMESuperHero("Batman", 1000);
		batman.attack("Joker");
		batman.run();
		
	}

}
