package ro.ase.csie.cts.laboratory.clean.code.phase4;

public class BlackFridayStrategy 
	implements IMarketingStrategy{

	@Override
	public float GetPriceWithAllDiscounts(
			ProductType productType, 
			float productPrice, 
			int userAccountAge,
			IAccounting accounting) {
		
		//alternative
/*//	float userBonusDiscount = 
//				productType == ProductType.NEW ? 0 : UserDiscount.getUserDiscount(userAccountAge);
//		return GetPriceWithDiscount(productType, productPrice)
//    			* (1-userBonusDiscount);
*/		
		
	    float userBonusDiscount = 
	    		getUserDiscount(userAccountAge);
	    
	    if(productType == ProductType.NEW)
	    	return accounting.GetPriceWithDiscount(productType, productPrice);
	    else 
	    	return accounting.GetPriceWithDiscount(productType, productPrice)
    			* (1-userBonusDiscount);
	}
	
	@Override
	public float getUserDiscount(int userAccountAge) {
		return (userAccountAge > MIN_ACCOUNT_AGE) ? MAX_USER_BONUS : (float)userAccountAge/100; 
	}

}
