package arraytopic;

import java.util.Scanner;

public class TwoDimensionalarray {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter two no.:");
			 
			int[][] num=new int[2][2];
			for(int i=0;i<2;i++)
			{
				for (int j=0;j<2;j++)
			{
				//int k = 0;
				num[i][j]=sc.nextInt();
			}

			  //System.out.println("Enter four no.:");
			      
			}
			System.out.println("Matrix :"); 
			for(int i=0;i<2;i++) 
			{
			  for (int j=0;j<2;j++)
			 {
				 // for(int k=0;k<12;k++)
				  
			  System.out.print(num[i][j]+" ");
			 }
			System.out.println();
  
			}
		}
	}
}
