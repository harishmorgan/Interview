package interview;

public class NotANumber {

	public static void main(String[] args) {
		// What is NaN - Not A Number? How is NaN defined in different languages?
		
		System. out.println(2.0/0.0); //Infinity
		System. out.println(0.0/0.0); //NaN
		System.out.println(Math.sqrt(-1)); //NaN

		System.out.println(Float.NaN == Float.NaN); //false
		System.out.println(Float.NaN != Float.NaN); //true

		double nan = 2.1 % 0; //false

		System. out.println((2.1 % 0 )== nan); //false



	}

}
