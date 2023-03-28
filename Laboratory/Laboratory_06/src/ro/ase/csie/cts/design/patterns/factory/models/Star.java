package ro.ase.csie.cts.design.patterns.factory.models;

public class Star extends SpaceObject{
	
	float size;
	float age;
	
	public Star(String name, float size, float age) {
		super(name);
		this.size = size;
		this.age = age;
	}

	@Override
	public void getDescription() {
		System.out.println("A star");
	}

}
