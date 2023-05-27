package interview;

import java.util.Arrays;
import java.util.List;

public class Square {

	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(1,10,20,30,15);
		//1 100 400 900 225
		//400 900 225
		//1525/3 = 508.3333333333333
	double avg = list.stream().map(a -> a*a).filter(a -> a>100).mapToInt(a -> a).average().getAsDouble();
	 System.out.println(avg);

	}

}
