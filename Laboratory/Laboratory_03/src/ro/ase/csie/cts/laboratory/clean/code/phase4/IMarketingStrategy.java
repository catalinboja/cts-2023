package ro.ase.csie.cts.laboratory.clean.code.phase4;

public interface IMarketingStrategy {
	
	public static final int MIN_ACCOUNT_AGE = 10;
	public static float MAX_USER_BONUS = 0.15f;
	
	public float GetPriceWithAllDiscounts(
			ProductType productType, 
			float productPrice, 
			int userAccountAge,
			IAccounting accounting);
	
	public float getUserDiscount(int userAccountAge);
}
