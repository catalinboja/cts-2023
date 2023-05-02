package ro.ase.csie.cts.lab.design.patterns.adapter;

public class Disney2AcmeObjectAdapter 
	implements ACMESuperHeroInterface {
	
	DisneySuperHeroInterface disneyHero;
	
	
	public Disney2AcmeObjectAdapter(DisneySuperHeroInterface disneyHero) {
		this.disneyHero = disneyHero;
	}

	@Override
	public void run() {
		this.disneyHero.moveOnScreen(100);
	}

	@Override
	public void jump() {
		System.out.println(disneyHero.getDescription() + " is jumpig");
	}

	@Override
	public void attack(String enemy) {
		this.disneyHero.interact(enemy);
	}

	@Override
	public String getName() {
		return this.disneyHero.getDescription();
	}
	
}
