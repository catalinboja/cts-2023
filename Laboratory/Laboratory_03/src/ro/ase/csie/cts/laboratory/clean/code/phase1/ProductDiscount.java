package ro.ase.csie.cts.laboratory.clean.code.phase1;

public class ProductDiscount {
	public float GetPriceWithDiscount(
			ProductType productType, 
			float productPrice, 
			int userAccountAge)
	  {
		
		int minAccountAge = 10;
		float maxUserBonus = 0.15f;
		
		float discountSilver = 0.1f;
		float discountGold = 0.25f;
		float discountDiamond = 0.35f;
		
		
	    float finalPrice = 0;
	    float userBonusDiscount = 
	    		(userAccountAge > minAccountAge) ? maxUserBonus : (float)userAccountAge/100; 
	    if (productType == ProductType.NEW)
	    {
	      finalPrice = productPrice;
	    }
	    else if (productType == ProductType.SILVER)
	    {
	      finalPrice = (productPrice - (discountSilver * productPrice)) - userBonusDiscount * (productPrice - (discountSilver * productPrice));
	    }
	    else if (productType == ProductType.GOLD)
	    {
	      finalPrice = (productPrice - (discountGold * productPrice)) - userBonusDiscount * (productPrice - (discountGold * productPrice));
	    }
	    else if (productType == ProductType.DIAMOND)
	    {
	      finalPrice = (productPrice - (discountDiamond * productPrice)) - userBonusDiscount * (productPrice - (discountDiamond * productPrice));
	    }
	    return finalPrice;
	  }
}
