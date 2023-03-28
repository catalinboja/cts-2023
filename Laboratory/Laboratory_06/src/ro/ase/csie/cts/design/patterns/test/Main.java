package ro.ase.csie.cts.design.patterns.test;

import ro.ase.csie.cts.design.patterns.factory.method.PlanetFactory;
import ro.ase.csie.cts.design.patterns.factory.method.StarFactory;
import ro.ase.csie.cts.design.patterns.factory.models.Planet;
import ro.ase.csie.cts.design.patterns.factory.models.SpaceObject;
import ro.ase.csie.cts.design.patterns.factory.models.Star;
import ro.ase.csie.cts.design.patterns.factory.simple.SpaceObjectSimpleFactory;
import ro.ase.csie.cts.design.patterns.factory.simple.SpaceObjectType;

public class Main {

	public static void main(String[] args) {
		
		//without the factory
		SpaceObject theSun = 
				new Star("The Sun", 120, 45);
		SpaceObject theEarth = 
				new Planet("The Earth", "Medium");
		
		//using factory method classes
		theSun = new StarFactory().getSpaceObject("The Sun");
		theEarth = new PlanetFactory().getSpaceObject("The Earth");
		
		
		//using the Simple factory version
		theSun = SpaceObjectSimpleFactory
				.getSpaceObject(SpaceObjectType.STAR, "The Sun");
		theEarth = SpaceObjectSimpleFactory
				.getSpaceObject(SpaceObjectType.PLANET, "The Earth");
		
	}

}
