package Week7;
import java.util.Scanner;
class AccountInfo{
	String name;
	int accNo;
	String accType;
	double balance;
	AccountInfo(String name, int accNo, String accType){
		this.name = name;
		this.accNo = accNo;
		this.accType = accType;
		this.balance = 0.0;
	}
	void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit made.");
	}
	void displayBalance() {
		System.out.println("Balance: "+balance);
	}
}
class CurrentAccount extends AccountInfo{
	final double minimumBalance = 100;
	final double serviceTax = 12;
	CurrentAccount(String name, int accNo){
		super(name, accNo, "Current");
	}
	void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal made.");
			if (balance < minimumBalance) {
				balance -= (balance*serviceTax/100);
				System.out.println("Penalty deducted from balance.");
			}
		}
		else
			System.out.println("Insufficient balance for withdrawal.");
	}
}
class SavingsAccount extends AccountInfo{
	SavingsAccount(String name, int accNo){
		super(name, accNo, "Savings");
	}
	void ComputeInterest() {
		double interest = balance * 7/100;
		balance += interest;
		System.out.println("Interest added to balance.");
	}
	void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal made.");
		}
		else
			System.out.println("Insufficient balance for withdrawal.");
	}
}
public class Account {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account type (Savings/Current): ");
		String accType = sc.nextLine();
		System.out.println("Enter name of account holder: ");
		String name = sc.nextLine();
		System.out.println("Enter account number: ");
		int accNo = sc.nextInt();
		System.out.println("Enter deposit amount: ");
		double deposit = sc.nextDouble();
		System.out.println("Enter withdrawal amount: ");
		double withdrawal = sc.nextDouble();
		if(accType.equalsIgnoreCase("Savings")) {
			SavingsAccount sa = new SavingsAccount(name,accNo);
			sa.deposit(deposit);
			sa.displayBalance();
			sa.ComputeInterest();
			sa.displayBalance();
			sa.withdraw(withdrawal);
			sa.displayBalance();
		}
		else if(accType.equalsIgnoreCase("Current")){
			CurrentAccount ca = new CurrentAccount(name,accNo);
			ca.deposit(deposit);
			ca.displayBalance();
			ca.withdraw(withdrawal);
			ca.displayBalance();
		}
		else {
			System.out.println("Invalid account type.");
			return;
		}
	}
}
