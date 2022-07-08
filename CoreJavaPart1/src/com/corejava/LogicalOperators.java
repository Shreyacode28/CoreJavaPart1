

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=60, b= 50, c=70;
       System.out.println("Relational Operators");
       System.out.println(a==b);
       System.out.println(a>b);
       System.out.println(a<b);
       System.out.println(a!=b);
       System.out.println(a>=b);
       System.out.println(a<=b);
       
       System.out.println("Logical Operator");
       System.out.println((a>b) &&(c>b));
       System.out.println((a<b) &&(c<b));
       
       System.out.println((a<b) || (c>b));
       System.out.println((a>b) || (c<b));
       System.out.println((a<b) || (c<b));

       
	}

}
