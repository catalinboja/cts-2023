package ro.ase.csie.cts.design.patterns.composite;

import java.util.ArrayList;

public abstract class NPCGroupInterface {
	
	ArrayList<Object> group = new ArrayList<>();
	
	public abstract void addNPC(Object object);
	public abstract void removeNPC(Object object);
	public abstract Object getNPC(Object object);
	
	
}
