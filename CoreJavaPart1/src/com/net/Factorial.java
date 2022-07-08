package com.net;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter a number:  "  );
		Scanner sc  = new Scanner(System.in);
			
	    
		int num=sc.nextInt(); // this line is imp for scanner class
		 int i,fact=1 ;  
				 
		  //It is the number to calculate factorial    
		 
		  for( i=1; i<=num;i++)
		  {    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of number:" +fact);    
		 }  
		

	}


