package week3.day1;

public class AxisBank {
	public void deposit()
	{
		System.out.println("deposit:50,000");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******BankInfo****");
		BankInfo Bank=new BankInfo();
		Bank.saving();
		Bank.fixed();
		Bank.deposit();
		System.out.println("*****AxisBank******");
		AxisBank Axis=new AxisBank();
		Axis.deposit();
	}

}
