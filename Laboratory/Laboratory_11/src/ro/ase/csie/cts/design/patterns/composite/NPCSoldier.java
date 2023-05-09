package ro.ase.csie.cts.design.patterns.composite;

public class NPCSoldier extends AbstractNPCGroup{

	@Override
	public void attack(int points) {
		System.out.println("Soldier is atacking");
	}

	@Override
	public void heal(int points) {
		System.out.println("Soldier is healing");
	}

	@Override
	public void move() {
		System.out.println("Soldier is moving");
	}

	@Override
	public void addNPC(Object object) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeNPC(Object object) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object getNPC(Object object) {
		throw new UnsupportedOperationException();
	}
	
	

}
