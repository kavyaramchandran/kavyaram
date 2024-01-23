package oopspkg;

public class Exceptionprgrm2 {

	public static void main(String[] args) {
		try {
			int a=2/0;
			System.out.println(a);
		}
		catch(Exception b) {
			System.out.println(b.getMessage());
		}
		System.out.println("Hey there");
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(Exception b) {
			System.out.println(b.getMessage());
		}
		int[]arr=new int[3];
		try {
			for(int i=0;i<3;i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch(Exception b)
		{
			System.out.println(b.getMessage());
		}

	}

}
