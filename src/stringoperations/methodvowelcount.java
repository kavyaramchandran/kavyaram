package stringoperations;

import java.util.Scanner;

public class methodvowelcount {

	public static void main(String[] args) {
		//methodvowelcount ob=new methodvowelcount();
		
		vowelcountstring ob1= new vowelcountstring();
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		
		int b=ob1.v(a);
		
		System.out.println(b);
	}

}
