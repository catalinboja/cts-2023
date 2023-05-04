package ro.ase.csie.cts.design.patterns.flyweight;

import java.util.ArrayList;
import java.util.Random;

public class Model3D implements Model3DInterface{
	
	String modelFile;
	String name;
	ArrayList<Integer> points = new ArrayList<Integer>();
	
	
	public Model3D(String modelFile, String name) {
		
		System.out.println("Generating the model for " + name);
		this.modelFile = modelFile;
		this.name = name;
		
		Random random = new Random();
		int noPoints = random.nextInt(10000);
		for(int i = 0; i < noPoints; i++) {
			this.points.add(random.nextInt(20000));
		}
	}

	@Override
	public String getDescription() {
		return this.name;
	}

	@Override
	public void displayOnScreen(Coordinates coordinates, String color) {
		System.out.println("Displaying " + this.name);
		System.out.println("3D model number of points " + this.points.size());
		System.out.println("Placing object at " + coordinates.getX() + 
				", " + coordinates.getY());
		System.out.println("Apply texture color: " + color);
	}

}
