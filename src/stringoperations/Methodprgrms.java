package stringoperations;

import java.util.Scanner;

public class Methodprgrms {

	public static void main(String[] args) {
		
     Methodprgrms  ob=new Methodprgrms();
     Scanner sc=new Scanner(System.in);
     System.out.println("enter 2 numbers");
     int v1=sc.nextInt();
     int v2=sc.nextInt();
     ob.add();
     int subanswer=ob.sub();
     System.out.println(subanswer);
     ob.mul(v1, v2);
     System.out.println(ob.div(v1, v2));
     
     
	}
	
	
	//method without returntype and without parameter
	public void add()
	{
		int a=20,b=10,c;
		c=a+b;
		System.out.println(c);
	}
	
	//method with returntype and without parameter
	public int sub()
	{
		int a=40,b=10,c;
		c=a-b;
		return c;
	}
	
	//method without returntype and with parameter
	public void mul(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
	}
	
	//method with returntype and with parameters 
	public double div(int a,int b)
	{
		double c=a/b;
		return c;
	}


	public void area() {
		// TODO Auto-generated method stub
		
	}


	
    
     
    	 
     
	


}
