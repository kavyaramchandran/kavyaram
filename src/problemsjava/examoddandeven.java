package problemsjava;

public class examoddandeven {

	public static void main(String[] args) {
		int [] ar= {1,2,3,4,5,6};
		System.out.println("Odd numbers=");
		for (int i=0;i<ar.length;i++)
		{
			if(ar[i]%2!=0)
			{
			System.out.println(ar[i]);
			}
		}
		System.out.println("Even numbers");
		for(int j=0;j<ar.length;j++)
		{
			if(ar[j]%2==0)
			{
			System.out.println(ar[j]);	
			}
		}
	}

}
