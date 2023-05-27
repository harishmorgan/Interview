package interview;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMin {

	public static void main(String[] args) {
		// Max
		List<Integer> list = Arrays.asList(1,3,10);
		int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
		
		//Min
		int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);
	}

}
