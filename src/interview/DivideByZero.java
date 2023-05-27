package interview;

public class DivideByZero {

	public static void main(String[] args) {
		// What will be the output when you divide a number by zero?
		
		// System.out.println(9/0); // ArithmeticException
		
		System.out.println(9.0/0); //Infinity
		
		System.out.println(12.33f/0); //Infinity
		
		System.out.println(10/0.0); //Infinity

		// System.out.println(19.9999d/0); //Infinity
		
		// System.out.println(0/0); // ArithmeticException
		System.out.println(0.0/0); //NaN
		
		System.out.println(0.0/0.0); //NaN
		
		System.out.println(12.33/0.0); //Infinity



		
	}

}
