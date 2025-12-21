
import java.util.*        ;
public class Matrix {

	// creating methods createMatrix, displayMatrix,transpose, determinant2x2, determinant3x3, inverse2x2, inverse3x3
	//To perform matrix maupuplation like, transpose, determinant and inverse
    public static double[][] createMatrix(int rows, int cols) {
        Random random = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // values 0–9
            }
        }
        return matrix;
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.3f", val);
            }
            System.out.println();
        }
    }
	
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposed = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static double determinant2x2(double[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    public static double determinant3x3(double[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) return null; // no inverse
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;
        return inverse;
    }

    public static double[][] inverse3x3(double[][] matrix) {
        double det = determinant3x3(matrix);
        if (det == 0) return null; // no inverse
        double[][] inverse = new double[3][3];

        inverse[0][0] = (matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1]) / det;
        inverse[0][1] = -(matrix[0][1]*matrix[2][2] - matrix[0][2]*matrix[2][1]) / det;
        inverse[0][2] = (matrix[0][1]*matrix[1][2] - matrix[0][2]*matrix[1][1]) / det;

        inverse[1][0] = -(matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0]) / det;
        inverse[1][1] = (matrix[0][0]*matrix[2][2] - matrix[0][2]*matrix[2][0]) / det;
        inverse[1][2] = -(matrix[0][0]*matrix[1][2] - matrix[1][0]*matrix[0][2]) / det;

        inverse[2][0] = (matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0]) / det;
        inverse[2][1] = -(matrix[0][0]*matrix[2][1] - matrix[0][1]*matrix[2][0]) / det;
        inverse[2][2] = (matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0]) / det;

        return inverse;
    }
 
	public static void main(String args []) {
		Scanner input = new Scanner(System.in)  ;
		
		System.out.print("Enter matrix size (2 or 3): ");
        int n = input.nextInt();

        double[][] matrix = createMatrix(n, n);

        System.out.println("Matrix:");
        displayMatrix(matrix);

        System.out.println("Transpose:");
        displayMatrix(transpose(matrix));

        if (n == 2) {
            double determinant = determinant2x2(matrix);
            System.out.println("Determinant: " + determinant);
            double[][] inverse = inverse2x2(matrix);
            if (inverse == null) {
                System.out.println("No inverse exists (determinant = 0)");
            } else {
                System.out.println("Inverse:");
                displayMatrix(inverse);
            }
        } else if (n == 3) {
            double determinant = determinant3x3(matrix);
            System.out.println("Determinant: " + determinant);
            double[][] inverse = inverse3x3(matrix);
            if (inverse == null) {
                System.out.println("No inverse exists (determinant = 0)");
            } else {
                System.out.println("Inverse:");
                displayMatrix(inverse);
            }
        } else {
            System.out.println("Only 2x2 or 3x3 matrices supported.");
        }


        input.close()  ;
    }
}