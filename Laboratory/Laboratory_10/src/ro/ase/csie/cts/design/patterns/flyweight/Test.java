package ro.ase.csie.cts.design.patterns.flyweight;

public class Test {

	public static void main(String[] args) {
		
		Model3DInterface meteor1 = Model3DFactory.getModel("meteor");
		
		/*
		 * Model3DInterface meteor2 = Model3DFactory.getModel("meteor");
		 * Model3DInterface meteor3 = Model3DFactory.getModel("meteor");
		 */
		
		
		meteor1.displayOnScreen(new Coordinates(10,10), "green");
		meteor1.displayOnScreen(new Coordinates(20,20), "red");
		meteor1.displayOnScreen(new Coordinates(50,70), "blue");
		meteor1.displayOnScreen(new Coordinates(50,70), "blue");
		
	}

}
