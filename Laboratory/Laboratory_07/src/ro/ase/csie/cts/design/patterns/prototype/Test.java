package ro.ase.csie.cts.design.patterns.prototype;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Model3D building = 
				new Model3D("Generic Building", "ase_model.3d");
		
//		Model3D building2 = 
//				new Model3D("Generic Building", "ase_model.3d");
//		
		
		//with prototype
		Model3D building2 = (Model3D) building.clone();
		
		System.out.println("Building 2 name = " + 
				building2.name);
	}

}
