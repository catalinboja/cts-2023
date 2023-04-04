package ro.ase.csie.cts.design.patterns.prototype;

import java.util.HashMap;

public class ModelsCloneFactory {
	
	private static HashMap<String, Model3D> prototypes = 
			new HashMap<>();
	
	//class static constructor
	static {
		prototypes.put("Building", new Model3D(
				"Generic building", "generic.3d"));
		prototypes.put("Vehicle", new Model3D(
				"Generic vehicle", "vehicle.3d"));
		prototypes.put("Tree", new Model3D(
				"Generic tree", "tree.3d"));
	}
	
	public static Model3D getModel(ModelType type) throws CloneNotSupportedException {
		switch(type) {
		case BUILDING:
			return (Model3D) prototypes.get("Building").clone();
		case TREE:
			return (Model3D) prototypes.get("Tree").clone();
		case VEHICLE:
			return (Model3D) prototypes.get("Vehicle").clone();
		default:
			throw new UnsupportedOperationException();
		}
		
	}

}
