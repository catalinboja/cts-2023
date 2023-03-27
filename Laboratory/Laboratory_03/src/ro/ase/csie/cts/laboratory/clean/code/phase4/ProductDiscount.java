package ro.ase.csie.cts.laboratory.clean.code.phase4;

public class ProductDiscount {
	
	IAccounting accounting;
	IMarketingStrategy marketingStrategy;
	
	public ProductDiscount(IAccounting accounting,
			IMarketingStrategy marketingStrategy) {
		if(accounting == null || marketingStrategy == null) {
			throw new NullPointerException(
					"External references are required");
		}
		this.accounting = accounting;
		this.marketingStrategy = marketingStrategy;
	}
	
	
	
	public void setAccounting(IAccounting accounting) {
		if(accounting == null) {
			throw new NullPointerException();
		}
		this.accounting = accounting;
	}


	public void setMarketingStrategy(IMarketingStrategy marketingStrategy) {
		if(marketingStrategy == null)
			throw new NullPointerException();
		this.marketingStrategy = marketingStrategy;
	}


	public float GetDiscountValue(ProductType type, float productPrice) {
		return accounting.GetDiscountValue(type, productPrice);
	}
	
	public float GetPriceWithDiscount(
			ProductType type, float productPrice) {
		return accounting.GetPriceWithDiscount(type, productPrice);
	}
	
	public float GetPriceWithDiscountAndWithUserBonus(
			ProductType productType, 
			float productPrice, 
			int userAccountAge)
	  {
		return marketingStrategy
				.GetPriceWithAllDiscounts(
						productType, 
						productPrice, 
						userAccountAge, 
						accounting);
	  }
}
