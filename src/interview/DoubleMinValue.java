package interview;

public class DoubleMinValue {

	public static void main(String[] args) {
		
		/*  What is the value of  Double MIN_Value --Ans: +ve Number  
		 * which one is bigger --> double MIN_VALUE or 0.0d? --Ans: 0.0
		 *  which one is bigger -->double MIN_VALUE or NEGATIVE_INFINITY --Ans: double MIN_VALUE
		 *  */
		
		System.out.println(Double.MIN_VALUE); //4.9E-324
		
		System.out.println(Long.MIN_VALUE); //-9223372036854775808
		
		System.out.println(Integer.MIN_VALUE); //-2147483648
		
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d)); // 0.0
		
		System.out.println(Math.min(Integer.MIN_VALUE, 0)); // -2147483648
		
		System.out.println(Math.min(Float.MIN_VALUE, 0.0f)); //0.0
		
		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY)); //-Infinity

	}

}
