package first;

public class StringExam {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		
		// Without 'new', Same String Literal reference Same Address
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		str2 = str2 + "s";
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		// With 'new', it always refer new address
		String str3 = new String("Hello");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str3));
		
		
		// String is immutable, therefore
		// 1. method doesn't corrupt original String 
		// 2. method returns String Instance
		System.out.println(str1.substring(0, 4)); // [s, e)
		System.out.println(str2.charAt(4));
		
		// To Correctly compare the String value, it should be use 'equals' method
		System.out.println(str1 == str3); // false
		System.out.println(str1.equals(str3)); // true
		
		// String supports length(), concat() methods
		String str4 = str1.substring(0, 4);
		String str5 = new String("World");
		String str6 = (str4 + " ").concat(str5);
							
								  // 0123456789
		System.out.println(str6); // Hell World
		System.out.println(str6.length()); // 10
		
		
		int[] a1 = {1,2,3};
		int[] a2 = {1,2,3};
		
		// Array always reference different address
		System.out.println(System.identityHashCode(a1));
		System.out.println(System.identityHashCode(a2));
		
	}
}
