package problemsjava;

public class Examcountofstring {

	public static void main(String[] args) {
		String s="Kavya Ramachandran";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
				count++;
		}
		System.out.println("Total number of characters in string s="+count);
	}

}
