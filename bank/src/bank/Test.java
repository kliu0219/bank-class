package bank;

public class Test {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.deposite(100);
		bank.withdraw(300);
		bank.getCustomerInfo();
	} 
}
