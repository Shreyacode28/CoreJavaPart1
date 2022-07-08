package printPattern;

import java.util.Scanner;

public class InvertPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the no. of stars you want :");
	    
		int n = sc.nextInt();
		System.out.println("Entered no. is :"+ n);
		
		for (int i =n;i>=1;i--) {
			for( int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
