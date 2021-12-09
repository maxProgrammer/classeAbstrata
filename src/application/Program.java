package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

				
		Account acc1 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc1.withdraw(200.0);
		System.out.printf("Balance account #%d is  $%.2f%n",acc1.getNumber(),acc1.getBalance());
		
		Account acc2 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc2.withdraw(200.0);
		System.out.printf("Balance account #%d is  $%.2f%n",acc2.getNumber(),acc2.getBalance());
		
		List<Account> list = new ArrayList<>();
		list.add(acc1);
		list.add(acc2);
		
		double sum = 0.0;
		
		for( Account x : list) {
			sum += x.getBalance();			
		}
		
		System.out.println("Sum is : " + sum);
		
		for( Account x : list) {
			x.deposit(10.0);			
		}
		
		for( Account x : list) {
			System.out.printf("The balance of Holder %S is $%.2f%n",x.getHolder(),x.getBalance());		
		}
			
		
	}
}