package first;

public class TypeCastingExam {

	public static void main(String[] args) {
		int x = 50000;
		long y = x; // Safe
		
		long x2 = 50000;
		// Unsafe -> Throw Error
//		int y2 = x2;
		
		int y2 = (int) x2; // Explicit Type Conversion
	}
}
