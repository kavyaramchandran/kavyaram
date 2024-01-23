package oopspkg;
class Emp
{
	private String Empname;
	private String Empdesignation;
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String Empname) {
		this.Empname = Empname;
	}
	public String getEmpdesignation() {
		return Empdesignation;
	}
	public void setEmpdesignation(String Empdesignation) {
		this.Empdesignation = Empdesignation;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		Emp ob=new Emp();
		ob.setEmpname("Kavya");
		ob.setEmpdesignation("Tester");
		System.out.println(ob.getEmpname());
		System.out.println(ob.getEmpdesignation());
	}

}
