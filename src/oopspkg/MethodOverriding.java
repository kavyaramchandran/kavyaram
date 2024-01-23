package oopspkg;

class Father
{
	public void job()
	{
		System.out.println("Lawyer");
	}
}
class Son extends Father
{

	@Override
	public void job() {
		System.out.println("Doctor");
		super.job();
	}
	
}

public class MethodOverriding {

	public static void main(String[] args) {
		Son ob=new Son();
		ob.job();

	}

}
