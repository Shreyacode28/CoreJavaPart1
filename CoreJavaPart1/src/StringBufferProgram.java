import java.util.Arrays;

public class StringBufferProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuffer str = new StringBuffer("Java");
//		System.out.println(str.capacity());
//		System.out.println(str.append("love"));
//		System.out.println(str.capacity());
//		System.out.println(str.length());
//		System.out.println(str.charAt(2));
//		System.out.println(str.delete(2,4));
//		System.out.println(str.deleteCharAt(3));
		String emptyStr=" ";
		System.out.println("ABC".isEmpty());
		System.out.println(" ".isEmpty());
		System.out.println(" ".isBlank());emptyStr.isBlank( );
		 System.out.println("Java".compareTo("Python"));
		 
		
		System.out.println("Java".compareToIgnoreCase("Python"));
		String s1="JAVA"; //getcharArray method
		char[]dest =new char[4];
		s1.getChars(0, 4, dest, 0); //getcharArray method
		System.out.println( Arrays.toString(dest));
//		tocharArray():
		String s ="IoT";
		System.out.println(s.toCharArray());
	}

}
