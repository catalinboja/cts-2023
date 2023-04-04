package ro.ase.csie.cts.design.patterns.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Model3D implements Cloneable{
	String name;
	String fileName;
	ArrayList<Integer> points = new ArrayList<>();
	
	public Model3D(String name, String filename) {
		System.out.println("Creating model for " + name);
		System.out.println("Opengin file " + filename);
		
		this.name = name;
		this.fileName = filename;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Random random = new Random();
		for(int i  = 0; i < random.nextInt(100); i++) {
			points.add(random.nextInt(2000));
		}
		System.out.println("Model generated with " + 
		    points.size() + " points");
	}
	
	private Model3D() {
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//Model3D copy = new Model3D(this.name, this.fileName);
		Model3D copy = new Model3D();
		copy.name = this.name;
		copy.fileName = this.fileName;
		//copy.points = this.points;
		copy.points = (ArrayList<Integer>) this.points.clone();
		return copy;
	}
	
	
}
