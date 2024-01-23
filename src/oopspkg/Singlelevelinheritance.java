package oopspkg;

class Parent
{
	public void display()
	{
		System.out.println("display method");
	}
}
class Child extends Parent
{
	public void childmethod()
	{
		System.out.println("child details");
	}
}

public class Singlelevelinheritance {
	
	public static void main(String[] args) {
		Child c=new Child();
		c.display();
		c.childmethod();
	}

}
