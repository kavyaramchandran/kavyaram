package arrayprgrms;

import java.util.Scanner;

public class stringarray {

	public static void main(String[] args) {
		String [] ak=new String[4];
		System.out.println("enter the names");
		Scanner sc=new Scanner(System.in); 
		for(int i=0;i<4;i++)
		{
			ak[i]=sc.next();
		}
		System.out.println("entered names");
		for(int i=0;i<4;i++)
		{
			System.out.println(ak[i]);
		}
		

	}

}
