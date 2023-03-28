package ro.ase.csie.cts.design.patterns.factory.models;

public class Planet extends SpaceObject{

	String type;
	
	public Planet(String name, String type) {
		super(name);
		this.type = type;
	}

	@Override
	public void getDescription() {
		System.out.println("A planet");
	}

}
