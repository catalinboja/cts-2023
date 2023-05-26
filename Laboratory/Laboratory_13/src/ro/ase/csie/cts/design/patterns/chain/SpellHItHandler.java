package ro.ase.csie.cts.design.patterns.chain;

public class SpellHItHandler extends HitEventHandler{

	@Override
	public void gotHit(int points, Superhero hero) {
		int currentPoints = points / 2;
		if(this.next != null) {
			this.next.gotHit(currentPoints, hero);
		}
	}

}
