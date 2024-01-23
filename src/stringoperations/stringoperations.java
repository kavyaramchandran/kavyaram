package stringoperations;

public class stringoperations {

	public static void main(String[] args) {
     
		
		String s="hello";
		String s1="welcome";
		String s2="Hello Welcome";
		
		//concate
		System.out.println(s+s1);
		System.out.println(3+2+s+2+4);
		
		//equals
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s2));
		
		//contains
		System.out.println(s.contains("Welcome"));
		
		//toUpperCase and toLowerCase
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//length
		System.out.println(s.length());
		
		//startswith and endswith
		System.out.println(s2.startsWith("Hello"));
		System.out.println(s2.endsWith("Welcome"));
		
		//trim
		System.out.println(s1.trim());
		
		//replace
		System.out.println(s2.replace("Hello","Hi"));
		
		//substring  start index 0 thott starteyyum and endindex 1 thott starteyyum
		System.out.println(s.substring(1,3));
		
		//split
		String s3="Hello welcome to luminar technolab";
		String[]st=s3.split(" ");
		for(String e:st)
		{
			System.out.println(e);
		}
		
		//tocharArray
		String s4="hello";
		char[] c=s4.toCharArray();
		for(char ele:c)
		{
			System.out.println(ele);
		}
         
	}

}
