package arraytopic;

public class test
{

//	public static void main(String[] args) 
//	{
//		// TODO Auto-generated method stub
//       int[] arr = {2,6,4,8,};
//       
//	   
//	sum(arr);
//	}
//       public static void sum(int[]arr) {
//           
//         int sum=0;
//    	 for (int i=0;i<=arr.length;i++) 
//    		   sum+= arr[i];
//    	   System.out.println("Sum of Array values:"+sum);
//       }
//}  
//}
	public static void main(String args[]) 
    {
        int arr[] = {3, 7, 2, 5, 4};
          
        // passing array to method m1
        sum(arr);
      
    }
  
    public static void sum(int[] arr) 
    {
        // getting sum of array values
        int sum = 0;
          
        for (int i = 0; i < arr.length; i++)
            sum+=arr[i];
          
        System.out.println("sum of array values : " + sum);
    }
}