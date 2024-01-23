package problemsjava;

public class Countallwordsprbm {

	public static void main(String[] args) {
		String s="Kavya Ramachandran";
		int count=1;
		int i=1;
		while(i<s.length())
		{
			if((s.charAt(i))==' ' &&(s.charAt(i+1)!=' '))
			{
				count++;
			}
			i++;	
		}
		System.out.println("Total no of words="+count);

	}
       

}
