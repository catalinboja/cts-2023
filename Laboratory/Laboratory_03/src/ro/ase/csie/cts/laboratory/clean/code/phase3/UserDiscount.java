package ro.ase.csie.cts.laboratory.clean.code.phase3;

public class UserDiscount {
	
	public static final int MIN_ACCOUNT_AGE = 10;
	public static float MAX_USER_BONUS = 0.15f;
	
	public static float getUserDiscount(int userAccountAge) {
		return (userAccountAge > MIN_ACCOUNT_AGE) ? MAX_USER_BONUS : (float)userAccountAge/100; 
	}
}
