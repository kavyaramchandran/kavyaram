package oopspkg;

import java.util.Scanner;

interface Bank
{
	void accountdetails();
	void balance();
	void withdraw();
	void deposit();
}
  class SBI implements Bank
  {
	  Scanner sc=new Scanner(System.in);
	  int bal=500,amt,widrw,amt1,no;
	  String name="";

	@Override
	public void accountdetails() {
	   
		System.out.println(" Enter the name:");
		name=sc.nextLine();
		System.out.println("Enter acc no:");
		no=sc.nextInt();
		
		
	}

	@Override
	public void balance() {
		
		System.out.println("Account No="+no);
		System.out.println("Available Balance:"+bal);
		
	}

	@Override
	public void withdraw() {
		System.out.println("Current Balance:");
		System.out.println("Enter the amount to be withdrawn:");
		amt=sc.nextInt();
		widrw=bal-amt;
		System.out.println("Remaining balance:"+widrw);
		
		
	}

	@Override
	public void deposit() {
		System.out.println("Enter the amount to deposit");
		amt1=sc.nextInt();
		bal=bal+amt;
		
	}
	  
  }

public class inerfacebankproblem {

	public static void main(String[] args) {
		SBI mi=new SBI();

}
}
