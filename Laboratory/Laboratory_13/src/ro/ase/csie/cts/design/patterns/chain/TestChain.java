package ro.ase.csie.cts.design.patterns.chain;

public class TestChain {

	public static void main(String[] args) {
		
		Superhero superman = new Superhero("Superman", 100);
		
		ShieldHitHandler shield = new ShieldHitHandler();
		SpellHItHandler spell = new SpellHItHandler();
		WoundedHitHandler wounded = new WoundedHitHandler();
		GameOverHitHandler gameOver = new GameOverHitHandler();
		
		spell.next = shield;
		shield.next = wounded;
		wounded.next = gameOver;
		
		HitEventHandler hitEventChain = spell;
		
		spell.gotHit(20, superman);
		
		System.out.println("Hero points = " + superman.hitpoints);
	}

}
