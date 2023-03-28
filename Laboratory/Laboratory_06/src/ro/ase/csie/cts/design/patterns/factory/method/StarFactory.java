package ro.ase.csie.cts.design.patterns.factory.method;

import ro.ase.csie.cts.design.patterns.factory.models.SpaceObject;
import ro.ase.csie.cts.design.patterns.factory.models.Star;

public class StarFactory implements AbstractSpaceObjectFactory{

	@Override
	public SpaceObject getSpaceObject(String name) {
		return new Star(name, 0,0);
	}
	
}
