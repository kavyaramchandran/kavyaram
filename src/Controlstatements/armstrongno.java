package Controlstatements;

public class armstrongno {

	public static void main(String[] args) {
		int i=153;
		int f=i;
		int sum=0;
		int rem=0;
		
		while(i>0)
		{
			rem=i%10;  //389%10=9  
			sum=sum+rem*rem*rem;   //0+729=729
			i=i/10;		
			
			
		}
		if(f==sum)
		{
			System.out.println("armstrong");
		}else
		{
			System.out.println("not armstrong");
		}
			
		

	}

}
