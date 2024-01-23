package oopspkg;

import java.util.Scanner;

interface Bank1
{
	public void accountdetails();
	void balance();
	void withdrawal();
	void deposit();
}
 class SBT implements Bank1
 {
	 Scanner sc=new Scanner(System.in);
	 int balance=45000;
	 int withdraw;
	 int amount;
	 int accno;
	 int deposit;
	 String name="";
	
	@Override
	public void accountdetails() {
		System.out.println("Enter the name");
		name=sc.nextLine();
		System.out.println("Enter the account number");
		accno=sc.nextInt();		
	}

	@Override
	public void balance() {
		System.out.println("Account no="+accno);
		System.out.println(balance);
		
	}

	@Override
	public void withdrawal() {
		System.out.println("Current Balance="+balance);
		System.out.println("Enter the amount to be withdrawn=");
		amount=sc.nextInt();
		balance=balance-amount;
		System.out.println("Remaining Balance="+withdraw);
	}

	@Override
	public void deposit() {
		System.out.println("Enter the amount to deposit= ");
		deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("your final balance="+balance);
		
	}
	 
 }

public class Interfacebank2 {

	public static void main(String[] args) {
		SBT s=new SBT();
		s.accountdetails();
		s.balance();
		s.deposit();
		s.withdrawal();
		s.balance();
		

	}

}
