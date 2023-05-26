package ro.ase.csie.cts.design.patterns.chain;

public class WoundedHitHandler extends HitEventHandler{

	@Override
	public void gotHit(int points, Superhero hero) {
		if(hero.hitpoints < Superhero.INITIAL_POINTS / 4) {
			System.out.println("Now is critical wounded");
		}
		
		if(this.next != null) {
			this.next.gotHit(points, hero);
		}
	}

}
