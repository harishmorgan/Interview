package interview;

public class printNumbers01 {

	public static void main(String[] args) {
		//we need to print the numbers from 1 to 100 without using any numbers 
		
		int one = 'A'/'A'; // give 1 
		String s1 = "..........";
		
		for(int i = one;i<=(s1.length() * s1.length()); i++) {
			System.out.println(i);
		}
		
		// by using ASCII 
		
		for(int i =one; i<= 'd';i+=one) {
			System.out.println(i);
		}

	}

}
