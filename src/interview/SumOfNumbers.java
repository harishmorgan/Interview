package interview;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {

	public static void main(String[] args) {

//A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels
//The reduce method is used to reduce the elements of a stream to a single value
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		Optional<Integer>  sum = list.stream().reduce((a,b)-> a+b);
		System.out.println("sum of all the numbers:" +sum.get());

	}

}
