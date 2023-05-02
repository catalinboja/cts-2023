package ro.ase.csie.cts.lab.design.patterns.adapter;

public interface DisneySuperHeroInterface {
	public float getLifepoints();
	public String getDescription();
	public void moveOnScreen(float distance);
	public void interact(String anotherCharacter);
}
