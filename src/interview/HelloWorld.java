package interview;

public class HelloWorld {

	public static void main(String[] args) {

		// Print Hello World without using semi colon (;) in Java

		if (System.out.printf("Hello world" +"\n") == null) {

		}

		// 2.

		if (System.out.append("Hello world" +"\n") == null) {

		}
		
		//3.
		
		if (System.out.append("Hello world" +"\n").equals(null)) {

		}
		
		//4.
		
		for(int i =0; i<1 ; System.out.println("hello world")) {
			i++;
		}

	}

}
