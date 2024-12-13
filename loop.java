
public class loop {
	public static void main(String[] args) {

		// print HoloRectangle
		// HoloRectangle(args);
		// square(args);
		triangle(args);

		// 3. Star pattern for letter A S H O K
		// int height = 7;
		// // Print each row of the letters
		// System.out.println(" 3 : Printing.. ASHOK");
		// for (int row = 0; row < height; row++) {

		// printA(row, height);
		// printS(row, height);
		// printH(row, height);
		// printO(row, height);
		// printK(row, height);
		// System.out.println();
		// }
	}

	public static void HoloRectangle(String[] args) {
		System.out.println("1 : HoloRectangle");
		int n = 4;
		int m = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (i == 1 || j == 1 || i == n || j == m) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public static void square(String[] args) {
		int i, j;
		int n = 6;
		int m = 7;

		System.out.println("2 : square");

		for (i = 0; i <= n; i++) {
			System.out.print(" * "); // println is print result in new line;
			for (j = 1; j <= m; j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}

	// Function to print the pattern for 'A'
	public static void printA(int row, int height) {
		int width = (2 * height) - 1;
		for (int col = 0; col < width; col++) {
			if ((col == (width / 2) - row) || (col == (width / 2) + row)
					|| (row == height / 2 && col > (width / 2) - row && col < (width / 2) + row)) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		System.out.print(" ");
	}

	// Function to print the pattern for 'S'
	public static void printS(int row, int height) {
		for (int col = 0; col < height; col++) {
			if ((row == 0) || (row == height / 2) || (row == height - 1) || (col == 0 && row < height / 2)
					|| (col == height - 1 && row > height / 2)) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		System.out.print(" ");
	}

	// Function to print the pattern for 'H'
	public static void printH(int row, int height) {
		for (int col = 0; col < height; col++) {
			if ((col == 0) || (col == height - 1) || (row == height / 2)) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		System.out.print(" ");
	}

	// Function to print the pattern for 'O'
	public static void printO(int row, int height) {
		for (int col = 0; col < height; col++) {
			if ((row == 0 && col > 0 && col < height - 1) || (row == height - 1 && col > 0 && col < height - 1)
					|| (col == 0 && row > 0 && row < height - 1)
					|| (col == height - 1 && row > 0 && row < height - 1)) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		System.out.print(" ");
	}

	public static void printK(int row, int height) {
		for (int col = 0; col < height; col++) {
			// Print vertical line and diagonals
			if (col == 0 ||
					(col == height / 2 - row && row <= height / 2) ||
					(col == row - height / 2 && row >= height / 2)) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		System.out.print("  "); // Space between letters
	}

	public static void triangle(String[] args) {
		int i, j;
		int n = 7;
		int m = 8;

		for (i = 1; i <= n; i++) {
			for (j = m; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("  ");

		}

	}
}
