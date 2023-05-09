package ro.ase.csie.cts.design.patterns.composite;

public class NPCGroup extends AbstractNPCGroup{

	@Override
	public void attack(int points) {
		for(Object item : this.group) {
			AbstractNPCGroup abstractItem = (AbstractNPCGroup) item;
			abstractItem.attack(points);
		}
	}

	@Override
	public void heal(int points) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void move() {
		throw new UnsupportedOperationException();
	}

}
