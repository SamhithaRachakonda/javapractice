package ArraysCoding.Arrays2D.MatrixOperations;

import java.util.Scanner;

public class Transpose2D {
    /*
     * Problem Statement:
     * Write a program to display transpose of matrix entered by the user.
     * 
     * Ex- 
     * Given Matrix:
     *  1 2 3
     *  4 5 6
     *  7 8 9
     * Transpose of a matrix:
     *  1 4 7
     *  2 5 8
     *  3 6 9
     * 
     * Only square matrices has transpose. Non-square matrices transpose cannot be done using the inplace method mentioned below, since we get Index Out Of Bounds Issue.
     */
    static void printArray(int[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] Transpose2d(int[][] a, int r1, int c1){
        
        int[][] transpose = new int[c1][r1];
        for(int i=0; i<c1; i++){
            for(int j=0; j<r1; j++){
                transpose[i][j] = a[j][i];
            }
        }
        return transpose;
    }

    static void Transpose2dInplace(int[][] a, int r1, int c1){
        for(int i=0; i<c1; i++){
            for(int j=i; j<r1; j++){ 
                // swap a[i][j] to a[j][i]
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
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
        scan.close();

        System.out.println("Given Matrix:");
        printArray(a);

        int[][] transpose = Transpose2d(a, r1, c1);
        System.out.println("Transpose of a matrix:");
        printArray(transpose);

        Transpose2dInplace(a, r1, c1);
        System.out.println("Transpose of an inplace matrix:");
        printArray(a);
    } 
}
