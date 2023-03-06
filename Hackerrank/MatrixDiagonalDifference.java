import java.util.Scanner;

public class MatrixDiagonalDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of the Matrix");

		int[][] arr = new int[3][3];

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				arr[i][j] = sc.nextInt();

			}

		}

		getDiagonelDifference(arr);
	}

	public static void getDiagonelDifference(int[][] ar) {

		int d1 = 0;
		int d2 = 0;

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (i == j) {
					d1 = d1 + ar[i][j];
				}
				if ((i + j) == (ar.length - 1)) {
					d2 = d2 + ar[i][j];
				}
			}
		}
		int diagonalDifference = d1 - d2;
		System.out.println(diagonalDifference);
	}

}
