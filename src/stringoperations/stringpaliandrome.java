package stringoperations;

import java.util.Scanner;

public class stringpaliandrome  {


	public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	///Accessmodifier ob=new Accessmodifier();
	System.out.println("enter a String");
	String s=sc.nextLine(); //hello 
	String rev="";
    
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i); //o  //o+l=ol //ol+l=oll //oll+e=olle //olle+h=olleh
	}
	System.out.println(rev);
	if(rev.equals(s))
	{
		System.out.println(s+" is a paliandrome");
	}
	else
	{
		System.out.println(s+" is not a paliandrome");
	}

	}		

	}

	
