package ro.ase.csie.cts.design.patterns.chain;

public class GameOverHitHandler extends HitEventHandler{

	@Override
	public void gotHit(int points, Superhero hero) {
		hero.hitpoints -= points;
		if(hero.hitpoints <= 0) {
			System.out.println("Game Over !");
		}
		
		//we choose not to pass the event to the next node in chain
	}
	
}
