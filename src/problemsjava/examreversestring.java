package problemsjava;

public class examreversestring {

	public static void main(String[] args) {
		String s="Kavya";
		String rev="";
		
		for(int i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
		System.out.println("Reversed string="+rev);

	}

}
