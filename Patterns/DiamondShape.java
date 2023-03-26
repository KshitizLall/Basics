package star;

import java.util.Scanner;

public class DiamondShape {
	public static void main(String[] args) {
		// Declare variables to be used
		int n, i, j, space = 1;

		// Prompt user for input
		System.out.print("Enter the number of rows: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		space = n - 1;

		// Loop to print top half of diamond shape
		for (j = 1; j <= n; j++) {
			// Loop to print spaces before stars
			for (i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space--;
			// Loop to print stars
			for (i = 1; i <= 2 * j - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		space = 1;
		// Loop to print bottom half of diamond shape
		for (j = 1; j <= n - 1; j++) {
			// Loop to print spaces before stars
			for (i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space++;
			// Loop to print stars
			for (i = 1; i <= 2 * (n - j) - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
