package Controlstatements;

public class eg1jit {

	public static void main(String[] args) {
		int i,j,n=10;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n+i;j++)
			{
			 if(j<(n-i)-1)
			 {
				 System.out.print("  ");
			 }
			 else
			 {
				 System.out.print("* ");
			 }
			
			}
			System.out.print("\n");
		}
		

	
	}
}
