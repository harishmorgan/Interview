package interview;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestLowest {

	public static void main(String[] args) {
		// second highest
		List<Integer> list = Arrays.asList(0,3,10,20,30,15,1,2,2,40,19,3,40);
		int secHig = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		System.out.println(secHig);
		
		//or 
		int secondHig = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(secondHig);
	
	//second Lowest
	
	int secondL = list.stream().sorted().distinct().skip(1).findFirst().get();
	System.out.println(secondL);
	}

}
