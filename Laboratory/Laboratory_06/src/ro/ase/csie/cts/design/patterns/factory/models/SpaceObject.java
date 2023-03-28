package ro.ase.csie.cts.design.patterns.factory.models;

public abstract class SpaceObject {

	String name;
	
	public SpaceObject(String name) {
		super();
		this.name = name;
	}

	public abstract void getDescription();
}
