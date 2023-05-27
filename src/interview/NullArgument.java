package interview;

public class NullArgument {
		
		//Pass null argument with method overloading of String and Object types
		
		public static void main(String a[]) {
			test(null);
			}

			public static void test (Object o) {
			System.out.println("Object Argument");
			}

			public static void test(String s) {
			System.out.println("String Argument"); //String Argument

			}
		

	}

