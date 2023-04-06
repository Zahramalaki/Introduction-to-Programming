/* ********************************************************************************
 * Developed by Zahra Malaki
 * Description: This program gets two matrices and prints the multiplication matrix.
 ******************************************************************************** */
import java.util.*;
public class MatrixMultiplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Matrix A,");
        System.out.println("Enter the number of rows:");
        int rA = input.nextInt();
        System.out.println("Enter the number of columns:");
        int cA = input.nextInt();

        System.out.println("Matrix B,");
        System.out.println("Enter the number of rows:");
        int rB = input.nextInt();
        System.out.println("Enter the number of columns:");
        int cB = input.nextInt();

        if (cA == rB) {

            int[][] A = new int[rA][cA];
            for (int i = 0; i < rA; i++) {
                for (int j = 0; j < cA; j++) {
                    System.out.print("Enter A(" + i + "," + j + ") :");
                    A[i][j] = input.nextInt();
                }
            }
            System.out.println();

            int[][] B = new int[rB][cB];
            for (int i = 0; i < rB; i++) {
                for (int j = 0; j < cB; j++) {
                    System.out.print("Enter B(" + i + "," + j + ") :");
                    B[i][j] = input.nextInt();
                }
            }
            System.out.println();
            int sum = 0;
            int[][] C = new int[rA][cB];
            for (int i = 0; i < rA; i++) {
                for (int j = 0; j < cB; j++) {
                    for (int k = 0; k < rB; k++) {
                        sum += A[i][k] * B[k][j];
                        C[i][j] = sum;
                        sum = 0;
                    }
                }
            }
            System.out.println("Matrix C which equals to A*B :\n" + C);
            for (int i = 0; i < rA; i++) {
                for (int j = 0; j < cB; j++) {
                    System.out.print(C[i][j] + "\t");
                    System.out.println();
                }
            }

        }
        else {
            System.out.println("Invalid input! We can calculate A*B under this condition --> A's columns = B's rows");
        }

    }
}