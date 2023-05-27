package interview;

public class LongNumbers {

	public static void main(String[] args) {
		// Output when print a long number with L and without L suffix in #Java?
		
		long longNumberswithoutL = 1000*60*60*24*365;
		System.out.println(longNumberswithoutL); //1471228928
		//31536000000 — 36 bits
		// 11101010111101100010010110000000000
		long longNumberswithL = 1000*60*60*24*365L;
		System.out.println(longNumberswithL);//31536000000
		
		
	}

}
