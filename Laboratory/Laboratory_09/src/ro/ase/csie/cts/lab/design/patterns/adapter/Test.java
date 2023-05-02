package ro.ase.csie.cts.lab.design.patterns.adapter;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<ACMESuperHeroInterface> heroes = 
				new ArrayList<>();
		
		heroes.add(new ACMESuperHero("Superman", 1000));
		heroes.add(new ACMESuperHero("Batman", 500));
		
		for(ACMESuperHeroInterface hero : heroes){
			hero.attack("Joker");
		}
		
		DisneySuperHeroInterface mickey = 
				new MickeyMouse(1000);
		
		Disney2AcmeObjectAdapter mickeyAdapter = 
				new Disney2AcmeObjectAdapter(mickey);
		heroes.add(mickeyAdapter);
		
		for(ACMESuperHeroInterface hero : heroes){
			hero.attack("Joker");
		}
		
	}

}
