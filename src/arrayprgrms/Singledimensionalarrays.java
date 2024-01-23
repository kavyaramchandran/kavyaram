package arrayprgrms;

import java.util.Scanner;

public class Singledimensionalarrays {

	public static void main(String[] args) {
		int[] ar=new int[3];
		System.out.println("enter numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("entered numbers");
		for(int i=0;i<3;i++)
		{
			System.out.println(ar[i]);
		}

	}

}
