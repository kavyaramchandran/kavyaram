package problemsjava;

import java.util.Scanner;

public class Problem5compare {

	public static void main(String[] args) {
		String s1;
		String s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string s1");
		System.out.println("Enter String s2");
		s1=sc.next();
		s2=sc.next();
		System.out.println(s1.equalsIgnoreCase(s2));

	}

}
