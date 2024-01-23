package problemsjava;          ///java program to check whether the character is vowel or consonant

import java.util.Scanner;

public class Problem3vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		 char s;
		s=sc.next().charAt(0);
		
		
		
         if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u')
         {
        	 System.out.println("Vowel");
         }
         else
         {
        	 System.out.println("consonent");
         }
	}

}
