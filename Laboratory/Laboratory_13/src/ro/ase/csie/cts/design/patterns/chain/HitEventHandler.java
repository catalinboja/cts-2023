package ro.ase.csie.cts.design.patterns.chain;

public abstract class HitEventHandler {
	HitEventHandler next;
	
	public abstract void gotHit(int points, Superhero hero);
}
