public class RotateMatrix90 {

	public static void rotate(int[][] matrix) {

		int size = matrix.length;

		for (int i = 0; i < size; i++) {

			for (int j = 0; j < i; j++) {

				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size/2; j++) {

				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][size - j - 1];
				matrix[i][size - j - 1] = temp;
			}
		}

		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size; j++) {

				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {

		int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		rotate(matrix);
	}
}
