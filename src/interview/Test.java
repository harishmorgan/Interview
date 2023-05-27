package interview;

public class Test {

	public static void main(String[] args) {
		System.out.println(Main.x);
		// Will Static block be executed with final variable
		
		//Ans: 100 whatever the value declared with final will be executed first
	
	}

}

class Main {
	
	public static final int x = 100;
	
	static {
		
		System.out.println("main--- class static block");
	}
}
