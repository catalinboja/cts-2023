package ro.ase.csie.cts.laboratory.clean.code.phase4;

public class Accounting implements IAccounting{

	@Override
	public float GetDiscountValue(ProductType type, float productPrice) {
		return type.getDiscount() * productPrice;
	}
	
	@Override
	public float GetPriceWithDiscount(
			ProductType type, float productPrice) {
		return productPrice - GetDiscountValue(type, productPrice);
	}

}
