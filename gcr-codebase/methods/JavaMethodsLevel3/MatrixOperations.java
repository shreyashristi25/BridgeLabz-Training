
import java.util.*        ;
public class MatrixOperations {

	//creating methods createMatrix, addMatrix, subtractMatrix, multiplyMatrix, displayMatrix
	//To create, add, subtract, multiply matrices
    public static int[][] createMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); 
            }
        }
        return matrix;
    }

    public static int[][] addMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }
	
    public static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

	public static void main(String args []) {
		Scanner input = new Scanner(System.in)  ;
		
		//getting user input and displaying result
        System.out.print("Enter rows for matrices: ");
        int rows = input.nextInt();
		System.out.print("Enter columns for matrices: ");
        int cols = input.nextInt();

        int[][] A = createMatrix(rows, cols);
        int[][] B = createMatrix(rows, cols);

        System.out.println("\nMatrix A:");
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        displayMatrix(B);

        System.out.println("\nA + B:");
        displayMatrix(addMatrix(A, B));

        System.out.println("\nA - B:");
        displayMatrix(subtractMatrix(A, B));

        System.out.println("\nA x B:");
        int[][] C = multiplyMatrix(A, B);
        displayMatrix(C);

        input.close()  ;
    }
}