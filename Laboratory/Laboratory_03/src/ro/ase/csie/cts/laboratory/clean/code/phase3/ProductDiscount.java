package ro.ase.csie.cts.laboratory.clean.code.phase3;

public class ProductDiscount {
	

	public float GetDiscountValue(ProductType type, float productPrice) {
		return type.getDiscount() * productPrice;
	}
	
	public float GetPriceWithDiscount(
			ProductType type, float productPrice) {
		return productPrice - GetDiscountValue(type, productPrice);
	}
	
	public float GetPriceWithDiscountAndWithUserBonus(
			ProductType productType, 
			float productPrice, 
			int userAccountAge)
	  {
		
		//alternative
/*//	float userBonusDiscount = 
//				productType == ProductType.NEW ? 0 : UserDiscount.getUserDiscount(userAccountAge);
//		return GetPriceWithDiscount(productType, productPrice)
//    			* (1-userBonusDiscount);
*/		
		
	    float userBonusDiscount = 
	    		UserDiscount.getUserDiscount(userAccountAge);
	    
	    if(productType == ProductType.NEW)
	    	return GetPriceWithDiscount(productType, productPrice);
	    else 
	    	return GetPriceWithDiscount(productType, productPrice)
    			* (1-userBonusDiscount);
	    
	  }
}
