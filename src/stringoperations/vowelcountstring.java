package stringoperations;

import java.util.Scanner;

public class vowelcountstring {

	public static void main(String[] args) {
		
		vowelcountstring ob1= new vowelcountstring();
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a string");
//		String s=sc.next();
//		char[] c=s.toCharArray();
//		int vowel=0;
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'||s.charAt(i)=='u')
//			vowel++;
//		}
		
			//System.out.println("total no of vowels in string="+ vowel);
		

	}
	
	public int v(String s)
	{
		
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter a string");
		//String s=sc.next();
		char[] c=s.toCharArray();
		int vowel=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'||s.charAt(i)=='u')
			vowel++;
		}
		return vowel;
		
	}

}
