
package oopspkg;                           ///create an interface tvremote and use it to inherit

interface  TVremote
{
	public void volume();
	void switchoff();
	
}
interface SmartTVremote extends TVremote
{
	public void size();
	void colour();
	
}
 class TV implements SmartTVremote
 {

	@Override
	public void volume() {
		System.out.println("Volume up and down");
		
	}

	@Override
	public void switchoff() {
		System.out.println("Switch OFF/ON");
		
	}

	@Override
	public void size() {
		System.out.println("Size of remote");
		
	}

	@Override
	public void colour() {
		System.out.println("Colour of remote");
		
	}
	 
 }
  
  

	
  
  

public class interfacetvremote {

	public static void main(String[] args) {
		TV ob=new TV();
		ob.volume();
		ob.switchoff();
		ob.size();
		ob.colour();
	

	}

}
