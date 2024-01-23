package oopspkg;

public class MethodOverloading {

	public static void main(String[] args) {
		 MethodOverloading ob=new  MethodOverloading();
		 ob.add(20,50);
		 ob.add();
		 ob.add(30, 4.870);
		 ob.add(4.364,60);
		

	}
	public void add()
	{
		int a=20,b=50,c;
		c=a+b;
		System.out.println(c);
	}
	public void add(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	public void add (int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	public void add(double a,int b)
	{
		double c=a-b;
		System.out.println(c);
	}

}
