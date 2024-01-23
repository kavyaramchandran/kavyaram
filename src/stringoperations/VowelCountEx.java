package stringoperations;

import java.util.Scanner;

public class VowelCountEx {

	public static void main(String[] args) {
		
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a string");
	  String s=sc.next();
	  VowelCountEx v=new VowelCountEx();
	  int count= v.vowelCount(s);
	  System.out.println("count="+count);

	}
	public int vowelCount(String s)
	{
		int count=0;
				for(int i=0;i<s.length();i++)
				{
					if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u')
					{
						count++;
					}
				}
				return count;
	}

}
