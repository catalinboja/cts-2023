package ro.ase.csie.cts.design.patterns.flyweight;

import java.util.HashMap;

public class Model3DFactory {
	
	static HashMap<String, Model3DInterface> models = 
			new HashMap<>();
	
	//eager approach to generate the models
	static {
		models.put("meteor", new Model3D("Meteor.3d", "Meteor"));
		models.put("planet", new Model3D("Planet.3d", "Planet"));
		models.put("spacedust", new Model3D("SpaceDust.3d", "Space Dust"));
	}
	
	public static Model3DInterface getModel(String modelName) {
		return models.get(modelName.toLowerCase().trim());
	}

}
