package arrayprgrms;

import java.util.Scanner;

public class ExampleArray {

	public static void main(String[] args) {
		int Pcount=0,Ncount=0,Zcount=0;
		
		int[] ar=new int[5];
		System.out.println("Enter numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
		    ar[i]=sc.nextInt();
		}
		for (int i=0;i<5;i++)
		{
		if(ar[i]>0)
		
		{
			Pcount++;
		}
		else if(ar[i]<0)
		{
			Ncount++;
		}
		else
		{
			Zcount++;
		}
		

	}

	
	System.out.println("Number of positive numbers="+Pcount);
	System.out.println("Number of Negative numbers="+Ncount);
	System.out.println("Number of Zeroes="+Zcount);
	
	}
}
