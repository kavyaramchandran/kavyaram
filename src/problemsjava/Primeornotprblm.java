package problemsjava;

import java.util.Scanner;

public class Primeornotprblm {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int no=0;
		int i;
		for( i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				no=1;
				break;
			}
		}
		if (no==0)
		{
			System.out.println("The entered number is prime");
		}
		else
		{
			System.out.println("The entered number is not prime");
		}

	}

}
