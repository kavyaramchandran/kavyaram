package problemsjava;

public class examduplicate {

	public static void main(String[] args) {
		int[] ar= new int[] {2,4,9,4,3,6,5,9,2};
		System.out.println("Duplicate elements are = ");
		for (int i=0;i<ar.length;i++)
		{
		for (int j=i+1;j<ar.length;j++)
		{
			if(ar[i]==ar[j])
				System.out.println(ar[j]);
		}
		
		}

	}

}
