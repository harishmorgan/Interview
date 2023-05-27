package interview;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartsWith {

	public static void main(String[] args) {
	// Stream API is used to process collections of objects	
		List <Integer> list = Arrays.asList(2,222,234,567,890,432,236,211,22);
		List <Integer> numberStartsWith = list.stream().filter(e -> e.toString().charAt(0)=='2').collect(Collectors.toList());
		System.out.println(numberStartsWith);

	}

}
