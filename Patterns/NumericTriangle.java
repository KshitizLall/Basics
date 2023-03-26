package numeric;

import java.util.Scanner;

public class NumericTriangle {
	public static void main(String[] args) {
		int i, j;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// outer loop for rows
		for (i = 0; i < n; i++) {
			int num = 1;
			// inner loop for rows
			for (j = 0; j <= i; j++) {
				// printing num with a space
				System.out.print(num + " ");
				// incrementing value of num
				num++;
			}
			// ending line after each row
			System.out.println();
		}
	}
}