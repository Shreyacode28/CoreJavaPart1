import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Hello I Love Java";
        System.out.println("********"+str+ "*******");
      
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string: ");
			String str1= sc.nextLine();
			int words=0,characters=0,space=0;
		
			
			//System.out.println("Total words:"+ words);
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
				if(ch==' ') {
					space++;
				}
				else
				{
					characters++;
				}
			}
				System.out.println("Total words:"+ words);
				System.out.println("Total characters:"+ characters);
				System.out.println("space "+ space);
				}
		
        
	
	}


