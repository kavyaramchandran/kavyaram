package Controlstatements;

public class jumpingstmts {

	public static void main(String[] args) {
		int i=567;
		int rem;
		int rev=0;
		
		while(i>0)
		{
          rem=i%10;  //567%10=7   //56%10=6    //5%10=5
          rev=rev*10+rem;  //0*10+7=7   //7*10+6=76   //76*10+5=765
          i=i/10;   //567/10=56   //56/10=5  //5/10=0
		}
		System.out.println(rev);
	}

}
