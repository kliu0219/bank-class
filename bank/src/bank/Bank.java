package bank;

public class Bank {
	int accountNumber = 123456789;
	double balance = 500.0;
	String name = "Richard";
	String email = "abc@gmail.com";
	String number = "8888888888";
	double newBalance;
	
	public void deposite(int num) {
		newBalance = balance + num;
		System.out.println(newBalance);
	}
	public void withdraw(int num) {
		if (balance - num > 0) {
			newBalance = balance - num;
			System.out.println(newBalance);
		}
		else {
			System.out.println("not enough fund");
		}
		
	}
	public void getCustomerInfo() {
			System.out.println("Customer Name is "+ name);
			System.out.println("Account Number is "+accountNumber);
			System.out.println("Balnce is " + balance);
			System.out.println("Email is "+ email);
			System.out.println("Phone Nmber is "+ number);
			
	}
}
