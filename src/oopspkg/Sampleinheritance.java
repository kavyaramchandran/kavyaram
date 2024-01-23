package oopspkg;/// create a class named having the following data Members
                            //1name,2 age,3phoneno,4.address,5salary
                            //it has also a method of print details which print all the details of members 
class Member                //2 classes employee and managers inherits the member class 
{                             ///the employee and manager classes have data members specialization and department respectively
	String Name;               ///assign the values to employee and manager by making an object both of these by classes and print the same
	int Age;
	int Phoneno;
	String Address;
	int Salary;
	
	public void printdetails()
	{
		System.out.println("Name="+Name);
		System.out.println("Age="+Age);
		System.out.println("Phoneno="+Phoneno);
		System.out.println("Address="+Address);
		System.out.println("Salary="+Salary);
	}
	    
}
class Employee1 extends Member
{
	String specialization;

}
class Manager extends Member
{
	String Department;
}

public class Sampleinheritance {

	public static void main(String[] args) {
		Employee1 ob1=new Employee1();
		Manager ob2=new Manager();
		ob1.Name="Kavya";
		ob1.Age=24;
		ob1.Phoneno=9633052;
		ob1.Address="My address";
		ob1.Salary=300000;
		ob1.specialization="Testing";
		ob1.printdetails();
		System.out.println();
		ob2.Name="Vandana";
		ob2.Age=20;
		ob2.Phoneno=87645;
		ob2.Salary=604440;
		ob2.Department="HR";
		ob2.printdetails();

	}

}
