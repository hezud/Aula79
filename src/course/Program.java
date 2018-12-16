package course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int linhaM = 0, colunaN = 0, x = 0;
		int linhaI = 0, linhaJ = 0;
		linhaM = sc.nextInt();
		colunaN = sc.nextInt();

		int[][] mat = new int[linhaM][colunaN];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println();
					System.out.println("Position " + i + "," + j + ":");
					if (j != 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
					if (i != 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}

				}
			}
		}

		sc.close();

	}

}
