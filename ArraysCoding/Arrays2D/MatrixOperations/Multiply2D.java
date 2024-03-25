package ArraysCoding.Arrays2D.MatrixOperations;

import java.util.Scanner;

public class Multiply2D {
    /*
     * Matrix Multiplication: 2D
     * Write a program to display multiplication of two matrices entered by the user.
     * 
     * Ex -  A[r1,c1] * B[r2,c2] = C[r1,c2]
     *          Multiplication possible only if: c1 == r2.
     */

     static void printArray(int[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(c1 != r2){
            System.out.println("Multiplication not possible - wrong dimension");
            return;
        }

        int[][] multiplyMatrix = new int[r1][c2];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<c1; k++){
                    multiplyMatrix[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Multiplication of two matrices: ");
        printArray(multiplyMatrix);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rows and columns of first matrix");
        int r1 = scan.nextInt();
        int c1 = scan.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter first matrix values: ");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                a[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter rows and columns of second matrix");
        int r2 = scan.nextInt();
        int c2 = scan.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter second matrix values: ");
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                b[i][j] = scan.nextInt();
            }
        }
        scan.close();

        System.out.println("First Matrix:");
        printArray(a);
        System.out.println("Second Matrix:");
        printArray(b);

        multiply(a, r1, c1, b, r2, c2);
    } 
}
