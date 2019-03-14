package oopExercises;
//Tawseef Hanif
//Mr. Radulovic
//February 28, 2019
//BankAccount Class: basic banking features
//including transactions and balances
import java.util.ArrayList;

public class BankAccount {
	
	private double balance = 0.0;
	private String Name = new String();
	ArrayList<Double> ledger = new ArrayList<Double>();
	ArrayList<Double> transactions = new ArrayList<Double>();
	
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
		ledger.add(Math.round( balance * 100.0) / 100.0);
		transactions.add(Math.round( amount * 100.0) / 100.0);
	}
	
	public double withdraw(double amount) {
		if (amount < balance) {
			balance -= amount;
			ledger.add(Math.round(balance * 100.0) / 100.0);
			transactions.add(Math.round( -amount* 100.0) / 100.0);
			return balance;
		}
		return -1;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getName() {
		return Name;
	}
	
	public String toString() {
		System.out.println(Name);
		System.out.println("");
		System.out.println("Balance \t\tTransaction");
		for (int i =6; i > 0; i--) {
			System.out.println(ledger.get(ledger.size()-i) + "\t\t\t" + transactions.get(transactions.size()-i));
		}
		return "";
		
	}
}


