package Controlstatements;

import java.util.Scanner;

public class Scannerprgrm {

	public static void main(String[] args) {
		System.out.println("enter number a");
		System.out.println("enter number b");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a+b);
		
		System.out.println("enter the name  ");
		String a1=sc.next();  //nextlin()
		System.out.println("your name is "+a1);
		
		System.out.println("enter a character");
		int c=sc.next().charAt(0);
		System.out.println(c);
		
		System.out.println("enter a number");
		int temp=c;
		
		int rem;
		int rev=0;
		while(c>0)
		 {
			 rem=c%10;
			 rev= rev*10+rem;
			 c=c/10;
					 
		 }
		System.out.println(rev);
		if(temp==rev)
		{
			System.out.println("paliandrome");
		}
		else
		{
			System.out.println("not paliandrome");
			
			
		}
		
	}

}
