package oopspkg;

public class Exceptionprgrm {

	public static void main(String[] args) {
		try {
			int a=2/0; 
			System.out.println(a);
		}
		catch(Exception b)
		{
			System.out.println(b.getMessage());
		}
		System.out.println("hello");
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException b)
				{
			System.out.println("Exception details");
				}
	}

}
