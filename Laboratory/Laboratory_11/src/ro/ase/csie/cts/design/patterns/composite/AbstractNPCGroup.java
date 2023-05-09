package ro.ase.csie.cts.design.patterns.composite;

public abstract class AbstractNPCGroup extends NPCGroupInterface implements NPCActions{

	@Override
	public void addNPC(Object object) {
		if(object instanceof AbstractNPCGroup) {
			this.group.add(object);
		}
		else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public void removeNPC(Object object) {
		this.group.remove(object);
	}

	@Override
	public Object getNPC(Object object) {
		return this.group.get(this.group.indexOf(object));
	}

	
	
}
