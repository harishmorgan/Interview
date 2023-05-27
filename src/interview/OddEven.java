package interview;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEven {

	public static void main(String[] args) {
		List<Integer>list = Arrays.asList(11,2,3,45,67,90,8,2,0);
		List <Integer> evenList = list.stream().filter(e -> e%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		
		//odd Numbers
		List <Integer> oddList = list.stream().filter(e -> e%2!=0).collect(Collectors.toList());
		System.out.println(oddList);

	}

}
