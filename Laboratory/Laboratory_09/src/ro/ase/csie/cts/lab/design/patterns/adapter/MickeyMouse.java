package ro.ase.csie.cts.lab.design.patterns.adapter;

public class MickeyMouse implements DisneySuperHeroInterface{

	float lifepoints;
	
	public MickeyMouse(float lifepoints) {
		super();
		this.lifepoints = lifepoints;
	}

	@Override
	public float getLifepoints() {
		return this.lifepoints;
	}

	@Override
	public String getDescription() {
		 return "This is Mickey Mouse";
	}

	@Override
	public void moveOnScreen(float distance) {
		System.out.println("Mickey Mouse is moving");
	}

	@Override
	public void interact(String anotherCharacter) {
		System.out.println("Mickey Mouse interacts with " 
				+ anotherCharacter);
	}

}
