package printPattern;


import java.util.Scanner;

public class RightSidePyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	int n = sc.nextInt();
		System.out.println("Enter no. of stars to be printed:"  );
    	int n = sc.nextInt();
    	System.out.println("Enterd no. is:"+ n);
		for(int i=0; i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
		
		{
			System.out.print(" ");
		}
		for (int j=0; j<i; j++)
		{
			System.out.print("*");
		}
        System.out.println("");
	}

}

	 
}