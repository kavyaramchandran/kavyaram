package oopspkg;

interface Cardetails
{
   public void acceleration();
   void speedlimit();
} 
    class Maruti implements Cardetails
    {

		@Override
		public void acceleration() {
		System.out.println("Maruti Accelerator");
		}

		@Override
		public void speedlimit() {
			System.out.println("Maruti Speedlimit");
			
		}
    	
    }
    class BMW implements Cardetails
    {

		@Override
		public void acceleration() {
			System.out.println("BMW Acceleration");
			
		}

		@Override
		public void speedlimit() {
			System.out.println("BMW Speedlimit");
			
		}
    	
    }

public class Interfacepgm {

	public static void main(String[] args) {
		Maruti ob=new Maruti();
		ob.acceleration();
		ob.speedlimit();
		BMW b=new BMW();
		b.acceleration();
		b.speedlimit();
	}

}
