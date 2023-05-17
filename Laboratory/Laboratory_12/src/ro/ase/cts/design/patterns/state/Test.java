package ro.ase.cts.design.patterns.state;

public class Test {

	public static void main(String[] args) {
		
		Superhero superman = new Superhero("Superman");
		superman.move();		
		superman.gotHit(10);
		superman.move();
		superman.heal(50);
		superman.move();
	}

}
