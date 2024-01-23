package Controlstatements;

public class Exampleji {

	public static void main(String[] args) {
		int a=20;
		if(a<25)
		{
			System.out.println("The grade is F");
		}
		else if(a>=25 && a<45)
		{
			System.out.println("The grade is E");
		}
		else if(a>=45 && a<50)
		{
			System.out.println("The grade is D");
		}
		else if (a>=50 && a<60)
		{
			System.out.println("The grade is C");
		}
		else if(a>=60 && a<80)
		{
			System.out.println("The grade is B");
		}
		else
		{
			System.out.println("The grade is A");
		}

	}

}
