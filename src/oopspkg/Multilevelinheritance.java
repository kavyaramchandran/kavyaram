package oopspkg;


class Birds
{
	public void birdnames()
	{
		System.out.println("Enter bird names");
	}
}
class Parrot extends Birds
{
	public void parrotmthd()
	{
		System.out.println("Enter colour of parrot");
	}
}
class Blueparrot extends Parrot
{
	public void blueparrot()
	{
		System.out.println("blueparrots");
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {
	Blueparrot b=new Blueparrot();
	b.birdnames();
	b.parrotmthd();
	b.blueparrot();

	}

}
