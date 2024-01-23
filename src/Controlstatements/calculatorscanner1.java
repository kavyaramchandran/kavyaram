package Controlstatements;

import java.util.Scanner;

public class calculatorscanner1 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		System.out.println("enter a number a");
		int a=sc.nextInt();
		System.out.println("enter a number b");
		int b=sc.nextInt();
		
		System.out.println("1 for addition");
		System.out.println("2 for subtraction");
		System.out.println("3 for multiplication");
		System.out.println("4 for division");
		System.out.println("enter your choice");
		
		int c=sc.nextInt();
		switch(c)
		{
		case 1:System.out.println("a+b="+(a+b));
		break;
		case 2:System.out.println("a-b="+(a-b));
		break;
		case 3:System.out.println("a*b="+(a*b));
		break;
		case 4:System.out.println("a/b="+(a/b));
		break;
		default:System.out.println("invalid expression");
		}

	}

}
