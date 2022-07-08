import java.util.Scanner;
public class gradingSystem {

	
	
	public static void main(String[] args) {
		//int a, b, c
		Scanner sc = new Scanner(System.in);
		
		// TODO Auto-generated method stub
      
      System.out.println("Enter your name :");
      String n = sc.nextLine();
      System.out.println("Enter your Rollno :");
      int r = sc.nextInt();
  
	     //int score;
      //char grade;
     
	      System.out.println("Enter your marks of science ,maths,english:");
       int m1 = sc.nextInt();
       int m2 = sc.nextInt();
       int m3 = sc.nextInt();
       int total = m1+m2+m3;
       int avg = total/3;
       if(avg> 80 && avg<100) {
    	System.out.println("A grade");
       }else if (avg>60 && avg<=80) {
    	   System.out.println("B grade");
       }else if (avg>40 && avg<=60) {
    	  System.out.println("C grade");
     } else if (avg>20 && avg<=40) {
    	 System.out.println("D grade");
     }
	
	}
}
