package Week3Day1;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("Deposit Account: OVERRIDED Deposit Account : 15 years");
	}
	public static void main(String[] args) {
		AxisBank ba = new AxisBank();
		
		// Bank Info Class methods
		ba.saving();
		ba.fixed();
		
		// Override method 
		ba.deposit();
	}
}