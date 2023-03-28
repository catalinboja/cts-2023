package ro.ase.csie.cts.design.patterns.factory.simple;

import ro.ase.csie.cts.design.patterns.factory.models.Planet;
import ro.ase.csie.cts.design.patterns.factory.models.SpaceObject;
import ro.ase.csie.cts.design.patterns.factory.models.Star;

public class SpaceObjectSimpleFactory {
	
	public static SpaceObject getSpaceObject(
			SpaceObjectType type, String name) {
		switch(type) {
		case PLANET:
			return new Planet(name, "Small");
		case STAR:
			return new Star(name, 0, 0);
		default:
				throw new UnsupportedOperationException();
		}
	}
	
}
