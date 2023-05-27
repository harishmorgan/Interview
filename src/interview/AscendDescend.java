package interview;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AscendDescend {

	public static void main(String[] args) {
		// Ascending
		List<Integer> list = Arrays.asList(0,3,10,20,30,15,1,2,2,40,19,3,40);
		List<Integer> ascend = list.stream().sorted().collect(Collectors.toList());
		System.out.println(ascend);
		// Descending
		List<Integer> descend = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(descend);
	}

}
