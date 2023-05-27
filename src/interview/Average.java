package interview;
import java.util.Arrays;
import java.util.List;

public class Average {

	public static void main(String[] args) {
// The map method is used to returns a stream consisting of the results of applying the given function to the elements 
// of this stream.
 List<Integer> list = Arrays.asList(1,2,3,4);
 double avg = list.stream().mapToInt(a -> a).average().getAsDouble();
 System.out.println("average of numbers:" +avg);
	}

}
