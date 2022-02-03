package first;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		int value = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			value = scan.nextInt();
			System.out.println("User in:" + value);
		} while(value != 10);
	}
}
