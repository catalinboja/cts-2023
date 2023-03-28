package ro.ase.csie.cts.design.patterns.factory.method;

import ro.ase.csie.cts.design.patterns.factory.models.SpaceObject;

public interface AbstractSpaceObjectFactory {
	
	public SpaceObject getSpaceObject(String name);
	
}
