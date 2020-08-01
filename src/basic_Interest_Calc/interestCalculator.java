package basic_Interest_Calc;

import java.math.BigDecimal;

public class interestCalculator {
	BigDecimal interest;
	BigDecimal principal;

	interestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest);
	}

	public void calcTotal(int years) {

	}
}
