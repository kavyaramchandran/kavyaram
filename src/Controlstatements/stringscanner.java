package Controlstatements;

import java.util.Scanner;

public class stringscanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("enter vibgyor");
				String a=sc.next();
				
				System.out.println("V for violet");
				System.out.println("I for indigo");
				System.out.println("B for blue");
				System.out.println("G for green");
				System.out.println("Y for yellow");
				System.out.println("O for orange");
				System.out.println("R for red");
				
				System.out.println("enter your choice");
				int b=sc.nextInt();
				switch(b)
				{
				case 1:System.out.println("violet");
				break;
				case 2:System.out.println("indigo");
				break;
				case 3:System.out.println("blue");
				break;
				case 4:System.out.println("green");
				break;
				case 5:System.out.println("yellow");
				break;
				case 6:System.out.println("orange");
				break;
				case 7:System.out.println("red");
				break;
				default:System.out.println("invalid expression");
				}
				
	}

}
