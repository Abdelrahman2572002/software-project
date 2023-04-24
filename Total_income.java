package xdd;

public class Total_income {
	
	public int totalIncome=0;
	
	public  int totalIncome() {
		Fees fee=new Fees();
		totalIncome+=fee.calculatePrice();
		return totalIncome;
}

	
	
}
