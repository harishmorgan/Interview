package interview;

public class StringObject {

	public static void main(String[] args) {
		/*How many String Objects will be created */
		//Ans : 3 
		String s1 = "Hello World";
		String s2 = "Hello World";
		String s3 = s1;
		System.out.println(s1==s2);//true
		System.out.println(s2==s3); //true
		System.out.println(s1==s3); //true
		
		String n1  = new String( "Hello World");
		
		String n2  = new String( "Hello World");
		
		System.out.println(n1==n2);//false
	}

}
