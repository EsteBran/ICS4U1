package oopExercises;

public class Bank {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		
		b.setName("Michael");
		b.deposit(25.67);
		b.withdraw(10.14);
		b.deposit(100.14);
		b.getBalance();
		b.deposit(14.25);
		b.withdraw(95.24);
		b.withdraw(0.75);
		b.deposit(24.65);
		b.toString();

	}

}
