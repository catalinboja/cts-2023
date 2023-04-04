package ro.ase.csie.cts.design.patterns.builder;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Superhero superman = 
				new Superhero.SuperheroBuilder("Superman", 35)
				.isWounded()
				.addSuperPower("Laser eyes")
				.build();
		
	}

}
