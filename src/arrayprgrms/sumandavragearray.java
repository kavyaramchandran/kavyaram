package arrayprgrms;

import java.util.Scanner;

public class sumandavragearray {

	public static void main(String[] args) {
		int sum=0,avg=0;
		int[] ar=new int[3];
		System.out.println("enter the numbers");  //or enter array size can be given
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)   //for(int i=0;i<arraysize;i++)
		{
			ar[i]=sc.nextInt();
			sum=sum+ar[i];
		}
		System.out.println("sum="+sum);
		System.out.println("avarage="+sum/3);   //sum/array size

	}

}
