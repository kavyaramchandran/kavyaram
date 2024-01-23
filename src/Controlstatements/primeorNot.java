package Controlstatements;

import java.util.Scanner;

public class primeorNot {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a positive number");
	int num=s.nextInt();
	
	int flag=0;
	int i;
	
	for(i=2;i<=num/2;i++)
	{
		if(num%i==0)
		{
			flag=1;
			break;
		}
	}
	  if(flag==0)
	  {
		  System.out.println("The entered number is a prime number");
	  }
	}

}
