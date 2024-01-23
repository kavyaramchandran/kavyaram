package Controlstatements;

import java.util.Scanner;

public class javaexample4 {

	public static void main(String[] args) {
		int sum;
		char choice;
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("Enter the first digit");
			int a=s.nextInt();
			
			System.out.print("Enter the second digit");
			int b=s.nextInt();
			
			sum=a+b;
			
			System.out.println("The sum is"+sum);
			
			System.out.println("\n Enter your choice \n Y for yes and N for no");
			choice=s.next().charAt(0);
		}
		while((choice=='Y') || choice=='y');

	}

}
