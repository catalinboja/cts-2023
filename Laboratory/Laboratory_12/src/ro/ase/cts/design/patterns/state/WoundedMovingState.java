package ro.ase.cts.design.patterns.state;

public class WoundedMovingState implements MovingStateInterface{

	@Override
	public void moveCharacter() {
		System.out.println("Is crowling");
	}

}
