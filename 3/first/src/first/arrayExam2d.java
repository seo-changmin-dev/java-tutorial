package first;

public class arrayExam2d {
	public static void main(String[] args) {
		int[][] array4 = new int[3][4];
		
		// 2d array don't have to be 'square'
		int[][] array5 = new int[3][];
		array5[0] = new int[1];
		array5[1] = new int[2];
		array5[2] = new int[3];
		
		int[][] array6 = {{1}, {1,2}, {1,2,3}};
		
		int[] array7 = new int[3];
		// Invalid compare to array5
//		array7[0] = new int[1];
		
		// 2d array declare -> first array holds the int[] types (address)
		// Thas't the reason line 17 failed.
	}
}
