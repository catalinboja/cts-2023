package ro.ase.csie.cts.design.patterns.factory.method;

import ro.ase.csie.cts.design.patterns.factory.models.Planet;
import ro.ase.csie.cts.design.patterns.factory.models.SpaceObject;

public class PlanetFactory implements AbstractSpaceObjectFactory{

	@Override
	public SpaceObject getSpaceObject(String name) {
		// TODO Auto-generated method stub
		return new Planet(name, "Small");
	}

}
