package interview;

public class TestNum {

	public static void main(String[] args) {
		
		
		// Compare Two Integer Numbers (Integer Caching) in #Java
		
		Integer num1 = 100;
		Integer num2  = 100;
		
		if(num1 == num2) {
			
			//In general if we compare two object references with == it always return false
			//Integer caching range is -128 to 127
			
			//If we provide the values out of range like 190 or -129 it will shows not equal only 
			
			System.out.println("Both Numbers are Equal");
		} else {
			
			System.out.println("Both Numbers are Not Equal");
		}
				

	}

}
