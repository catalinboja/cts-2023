package ro.ase.csie.cts.design.patterns.composite;

public class Test {

	public static void main(String[] args) {

		
		AbstractNPCGroup levelGroup = new NPCGroup();
		
		levelGroup.addNPC(new NPCSoldier());
		levelGroup.addNPC(new NPCSoldier());
		
		AbstractNPCGroup team = new NPCGroup();
		
		levelGroup.addNPC(team);
		team.addNPC(new NPCSoldier());
		
		levelGroup.attack(50);
		
		
		
	}

}
