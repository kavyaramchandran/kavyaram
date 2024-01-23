package Controlstatements;

public class countofdigit {

	public static void main(String[] args) {
		int n=567;
		int count=0;
		
		while(n>0)
		{
			n=n/10;  //567/10=56    //56/10=5   //5/10=0
			count++;
		}
        System.out.println(count);
	}

}
