import java.util.Scanner;

public class CountofWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str ="Hello I Love Java";
        System.out.println("********"+str+ "*******");
      
			int words=1,characters=1;
           Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter the string");
			str=scan.nextLine();
			for(int i=0;i<str.length()-1;i++) {
				char ch=str.charAt(i);
				if(str.charAt(i)==' ' && str.charAt(+1)!=' '){
					words++;
				}
				else if(str.charAt(i)!=' ') {
					characters++;
				}
			}
				System.out.println("\nTotal words:"+words);
				System.out.println("Total characters:"+ characters);
				System.out.println("space "+(words-1));
				}
		}
        
	


