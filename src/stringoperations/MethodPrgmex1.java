package stringoperations;

import java.util.Scanner;

public class MethodPrgmex1 {

	public static void main(String[] args) {
		MethodPrgmex1 ob=new MethodPrgmex1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of side");
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		ob.area();
		double circle=ob.c();
		System.out.println(circle);
		ob.c1(a1);
		double div=ob.div(a1,a2);
		System.out.println(div);
	}
	//method without return type and without parameter
	public void area()
	{
		int a=20,b=10;
	
		double c=0.5*a*b;
		System.out.println(c);
	}
	
	//method with return type and without parameter
	public double c()
	{
		int r=3;
		double c=3.14*r*r;
		return c;
	}
	
	//method without return type and with parameter
    public void c1(int a1)
    {
    	int c=a1*a1;
    	System.out.println(c);
    }
    
    //method with return and with parameter
    public double div(int l,int b)
    {
    	int r=l*b;
    	return r;
    }
	
	
		
	

}
