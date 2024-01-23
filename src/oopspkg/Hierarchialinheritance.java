package oopspkg;

class Flowers
{
	public void flowers()
	{
		System.out.println("flowernames");
	}
}
class Lotus extends Flowers
{
	public void lotus()
	{
		System.out.println("lotus");
	}
}
class Rose extends Flowers
{
	public void roses()
	{
		System.out.println("roses");
	}
}

public class Hierarchialinheritance {

	public static void main(String[] args) {
	Lotus r=new Lotus();
	r.flowers();
	r.lotus();
	Rose l=new Rose();
	l.flowers();
	l.roses();
	

	}

}
