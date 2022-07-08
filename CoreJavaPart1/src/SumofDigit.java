import java.util.Scanner;

public class SumofDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a user input:");
		int sum = 0;
		
		

		//can done my ths way or 
	     int digit = sc.nextInt();
//	     for (int i = 1; i <= digit; i++) {
//	    	 sum+= i;
//	     }
        //can also done my this way
      //   sum =digit*(digit+1)/2;
        
        //for 
        int i = 1;
        while(i<=digit) {
        	sum+=i;
        	i++;
        }
	      System.out.println ("sum of number:"+ sum);
	     
	}  
	 
	}


