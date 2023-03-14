package ro.ase.csie.cts.laboratory.clean.code.phase2;

public enum ProductType {
	NEW(0,"New product"), 
	SILVER(0.1f, "Silver"),
	GOLD(0.25f, "Gold"),
	DIAMOND(0.35f, "Diamond");
	
	private float discount;
	private String name;
	
	private ProductType(float discount, String name) {
		this.discount = discount;
		this.name = name;
	}

	public float getDiscount() {
		return discount;
	}

	public String getName() {
		return name;
	}
	
	
	
}
