package stringoperations;
                                    /// String s="Testing Training Center"
public class Stringproblem1 {       ///o/p center training testing

	public static void main(String[] args) {
		String s="Testing Training Center";
		String temp = "";
		String [] rs=s.split(" ");
	   
		for(int i=rs.length-1;i>=0;i--)
		{
				temp=temp+rs[i] +" ";
		}
		System.out.println(temp);
		

	}

}
