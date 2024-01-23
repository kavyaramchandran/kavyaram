package pkg;

public class Operators {

	public static void main(String[] args) {
		
		//Arithmetic Operators(+,-,*,/,%)
		
		int a=20,b=10;
		
		System.out.println("a+b="+(a+b));//30
		System.out.println("a-b="+(a-b));
		System.out.println("a*b"+(a*b));
		System.out.println("a/b="+(a/b));//--quotient
		System.out.println("a%b="+(a%b));//--remainder
		
		//Assignment Operators(=,+=,-=)
		int c=a;
				System.out.println(a+=b);//a=a+b 20+10=30
		System.out.println(a-=b);//a=a-b 30-10=20
		
		//Relational Operators(<,>,<=,>=,!=)
		
		System.out.println(a==b);
		System.out.println(a<b);
		System.out.println(a>b);
		
		//Logical Operators(&&,||,!)
		
		//    A    B   A&&B   A||B   !A   !B
		//    0    0    0      0      1    1
		//    1    0    0      1      0    1
		//    0    1    0      1      1    0
		//    1    1    1      1      0    0
		
		String username="abc";
		String pswd="abc123";
		System.out.println(username=="abc"&& pswd=="abc123");
		System.out.println(username=="abc" || pswd=="abc123");
		System.out.println(!(username=="abc"));
		
		//Unary Operators(++,--)
		
		int c1=10,c2=5;
		
		//c1++-postincrement
		//++c1-preincrement
		
		System.out.println(c1++);//10
		System.out.println(c1);//11
		System.out.println(++c1);//12 
		
		//Ternary Operators 
		//syntax variable=  condition?exp1:exp2
		
		String v=c1>c2?"c1 is greater":"c2 is greater";
		System.out.println(v);
				

	}

}
