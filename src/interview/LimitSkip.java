package interview;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitSkip {

	public static void main(String[] args) {
		// limit 5 numbers
		List<Integer> list = Arrays.asList(0,3,10,20,30,15,1,2,2,40,19,3,40);
		List<Integer> limit = list.stream().limit(5).collect(Collectors.toList());
		System.out.println(limit);
		//sum the first 5 numbers 
		int sum = list.stream().limit(5).reduce((p,q) -> p+q).get();
		System.out.println(sum);
		//skip the first 5 numbers 
		List<Integer> skip = list.stream().skip(5).collect(Collectors.toList());
				System.out.println(skip);
				//sum the skipped first 5 numbers 
				int  skippedSum = list.stream().skip(5).reduce((p,q) -> p+q).get();
						System.out.println(skippedSum);
	}

}
