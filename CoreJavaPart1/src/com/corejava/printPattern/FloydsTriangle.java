package printPattern;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the no. of stars you want :");
	    
		int n = sc.nextInt();
		System.out.println("Entered no. is :"+ n);
//		outer loop logic row no 1 hai to 1 tak row no. 2 hai to 1 se leke 2 tak 3 hai to....
		int number=1;
		for (int i =1;i<=n;i++) {
//			inner loop
			for( int j=1; j<=i; j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
	}


	}


