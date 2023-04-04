package ro.ase.csie.cts.course.design.patterns.builder.initial;

import ro.ase.csie.cts.course.design.patterns.builder.module.DisplaySuperAmoled;
import ro.ase.csie.cts.course.design.patterns.builder.module.SDCard;

public class Main {

	public static void main(String[] args) {
		
		//this is not an atomic operation
		
		//SmartDevice smartDevice1 = new SmartDevice();
		
		SmartDevice smartDevice1 = 
				new SmartDevice("S22","Samsung",true,null,null,null, null);
		
		//TODO: don't forget to init it
		
		//you will forget to init some attributes
		smartDevice1.setProducator("Samsung");
		
		
		
	}

}
