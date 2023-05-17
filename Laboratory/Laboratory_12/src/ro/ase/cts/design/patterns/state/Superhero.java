package ro.ase.cts.design.patterns.state;

public class Superhero {
	
	public static final int MAX_POINTS = 100;
	
	String name;
	int lifepoints = MAX_POINTS;
	
	MovingStateInterface movingState = new NormalMovingState();
	
	
	public Superhero(String name) {
		super();
		this.name = name;
	}
	
	public void move() {
		this.movingState.moveCharacter();
	}
	
	public void gotHit(int points) {
		this.lifepoints -= points;
		if(this.lifepoints < MAX_POINTS) {
			this.movingState = new WoundedMovingState();
		}
	}
	
	public void heal(int points) {
		this.lifepoints += points;
		if(this.lifepoints >= MAX_POINTS) {
			this.movingState = new NormalMovingState();
		}
	}
	

}
