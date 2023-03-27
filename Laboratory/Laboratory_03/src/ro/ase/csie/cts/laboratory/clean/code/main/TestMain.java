package ro.ase.csie.cts.laboratory.clean.code.main;

import ro.ase.csie.cts.laboratory.clean.code.phase4.Accounting;
import ro.ase.csie.cts.laboratory.clean.code.phase4.BlackFridayStrategy;
import ro.ase.csie.cts.laboratory.clean.code.phase4.ProductDiscount;
import ro.ase.csie.cts.laboratory.clean.code.phase4.ProductType;

public class TestMain {

	public static void main(String[] args) {
		
		ProductDiscount productDiscount = 
				new ProductDiscount(
						new Accounting(),
						new BlackFridayStrategy());
		
		float finalPrice = 
				productDiscount
				.GetPriceWithDiscountAndWithUserBonus(
						ProductType.SILVER, 100, 20);
		
		System.out.println("Final price is " + finalPrice);
		
		
				
		
	}

}
