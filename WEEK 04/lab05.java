import java.util.Scanner;

public class lab05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a rows of a matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter a columns of a matrix: ");
        int col = sc.nextInt();
        int[][] mat1 = new int[rows][col];
        int[][] mat2 = new int[rows][col];
        System.out.println("Enter matric A elements:");
        calculator.input(mat1, sc);
        System.out.println("Enter matric B elements:");
        calculator.input(mat2, sc);
        System.out.println("Matrix A is :");
        calculator.print(mat1);
        System.out.println("Matrix B is :");
        calculator.print(mat2);
        System.out.println("Matrix C (A+B) is :");
        calculator.addMat(mat1, mat2);
        System.out.println("Matrix D (A-B) is :");
        calculator.subMat(mat1, mat2);
        System.out.println("Transpose of matrix A is :");
        calculator.transMat(mat1);
        System.out.println("Transpose of matrix B is :");
        calculator.transMat(mat2);
        if (calculator.symMat(mat1)) {
            System.out.println("The matrix A is Symmetric");
        } else {
            System.out.println("The matrix A is NOT Symmetric");

        }
        if (calculator.symMat(mat2)) {
            System.out.println("The matrix B is Symmetric");
        } else {
            System.out.println("The matrix B is NOT Symmetric");

        }
        System.out.println("The sum of matrix A diagonal is :");
        calculator.diaSum(mat1);
        System.out.println("The sum of matrix B diagonal is :");
        calculator.diaSum(mat2);
    }

    class calculator {
        static void input(int[][] mat, Scanner sc) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }
        }

        static void print(int[][] mat) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
        }

        static void addMat(int[][] mat1, int[][] mat2) {
            int[][] addResult = new int[mat1.length][mat1[0].length];
            for (int i = 0; i < addResult.length; i++) {
                for (int j = 0; j < addResult[i].length; j++) {
                    addResult[i][j] = mat1[i][j] + mat2[i][j];
                }
            }
            print(addResult);
        }

        static void subMat(int[][] mat1, int[][] mat2) {
            int[][] subResult = new int[mat1.length][mat1[0].length];
            for (int i = 0; i < subResult.length; i++) {
                for (int j = 0; j < subResult[i].length; j++) {
                    subResult[i][j] = mat1[i][j] - mat2[i][j];
                }
            }
            print(subResult);
        }

        static void transMat(int[][] mat) {
            int[][] transResult = new int[mat[0].length][mat.length];
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    transResult[j][i] = mat[i][j];
                }
            }
            print(transResult);
        }

        static boolean symMat(int[][] mat) {
            if (mat.length != mat[0].length) {
                return false;
            }
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    if (mat[i][j] != mat[j][i]) {
                        return false;

                    }
                }
            }
            return true;
        }

        static void diaSum(int[][] mat) {
            int sum = 0;
            if (mat.length == mat[0].length) {

                for (int i = 0; i < mat.length; i++) {
                    for (int j = 0; j < mat.length; j++) {
                        if (i == j) {
                            sum = sum + mat[i][j];
                        }
                    }
                }
                System.out.println(sum);
            } else {
                System.out.println("The matrix is not Square matrix so transpose is not possible.");
            }
        }
    }
}
