package interview;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {
		// set is used to store always non duplicate values
		//add method always return boolean
		
		List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,3,10);
		//Set <Integer> dupNum = list.stream().filter(e -> Collections.frequency(list, e)>1).collect(Collectors.toSet());
		//System.out.println(dupNum);
// 2nd method
		//HashSet contains unique elements only
		Set <Integer> dupNum = new HashSet<Integer>();
		//add method will always return false even though the duplicate number exist
		Set <Integer> dup =	list.stream().filter(e -> !dupNum.add(e)).collect(Collectors.toSet());
		System.out.println(dup);
		
	}

}
