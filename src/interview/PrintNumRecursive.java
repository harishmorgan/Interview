package interview;
import java.util.stream.IntStream;

public class PrintNumRecursive {

	public static void main(String[] args) {
		  PrintNum(1);
		PrimeNumbers(5,500);
		IntStream.range(1, 100).forEach(e-> System.out.println(e));
	}

	public static void PrintNum (int num) {
		// Recursion in java is a process in which a method calls itself continuously. 
		// A method in java that calls itself is called recursive method
		if(num <=100) {
			System.out.println(num);
			num++;
			PrintNum(num);
		}
	}
	
	public static void PrimeNumbers(int startNum,int endNum) {
		if(startNum<=endNum) {
			System.out.println(startNum);
			startNum++;
			PrimeNumbers(startNum,endNum);
		}
	}

}