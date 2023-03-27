package ro.ase.csie.cts.laboratory.clean.code.phase4;

public interface IAccounting {
	public float GetDiscountValue(
			ProductType type, float productPrice);
	public float GetPriceWithDiscount(
			ProductType type, float productPrice);
}
