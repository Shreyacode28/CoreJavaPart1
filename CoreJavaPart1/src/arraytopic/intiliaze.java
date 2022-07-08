package arraytopic;
import java.util.*;

public class intiliaze {

	public static void main(String[] args) {
		   // int num[]= {1,2,3,4,5};
		    Scanner sc=new Scanner(System.in);
		 
		    int num[]=new int[3];
	 		System.out.println("Enter array element:");
		    for(int i=0;i<num.length;i++)
			{
				num[i]=sc.nextInt();
			}
			System.out.println("Elements of array are:");
			for(int i=0;i<num.length;i++)
			{
				System.out.println(num[i]);
			}
		}   

	}


