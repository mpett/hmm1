public class Main {
    private static double[][] transition, emission, initial;
    private static Kattio io = new Kattio(System.in, System.out);

    public static void main(String[] args) {
        transition = handleInput();
        emission = handleInput();
        initial = handleInput();
        double[][] multMatrix = multiply(transition, emission);
        double[][] emissionDist = multiply(initial, multMatrix);
        printMatrix(emissionDist);
        io.close();
    }

    private static double[][] handleInput() {
        int rows = io.getInt();
        int cols = io.getInt();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = io.getDouble();
            }
        }
        return matrix;
    }

    private static void printMatrix(double[][] matrix) {
        int rows = 0;
        int cols = 0;
        String line = "";
        for (double[] row : matrix) {
            rows++;
            for (double j : row) {
                cols++;
                line += (j + " ");
            }
        }
        System.out.println(rows + " " + cols + " " + line);
    }

    // return C = A * B
    public static double[][] multiply(double[][] A, double[][] B) {
        int mA = A.length;
        int nA = A[0].length;
        int mB = B.length;
        int nB = B[0].length;
        if (nA != mB) throw new RuntimeException("Illegal matrix dimensions.");
        double[][] C = new double[mA][nB];
        for (int i = 0; i < mA; i++)
            for (int j = 0; j < nB; j++)
                for (int k = 0; k < nA; k++)
                    C[i][j] += (A[i][k] * B[k][j]);
        return C;
    }
}