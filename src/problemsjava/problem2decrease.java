package problemsjava;           ///write a program which accepts three numbers from the user and prints

import java.util.Scanner;

                                 ///"increasing" if the numbers are in increasing order ,"decreasing" if the 
public class problem2decrease {  ///numbers are in decreasing order and "neither increasing and decreasing order"

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a;
		int b;
		int c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if (a<b && b<c && a<c)
		{
			System.out.println("Increasing");
		}
		else if(a>b && b>c && a>c)
		{
			System.out.println("Decreasing");
		}
		else
		{
			System.out.println("Neither increasing nor decreasing");
		}
		

	}

}
