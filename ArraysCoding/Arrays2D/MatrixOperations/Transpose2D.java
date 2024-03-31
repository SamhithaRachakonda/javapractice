package ArraysCoding.Arrays2D.MatrixOperations;

import java.util.Scanner;
import java.util.ArrayList;

public class Transpose2D {
    /*
     * Problem Statement:
     * Write a program to display transpose of a given matrix.
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
        // Non-square matrix: transpose can only be created by creating a new matrix as rows and columns are interchanged.
        // Since rows and columns are not equal in non-sqaure matrix.
        int[][] transpose = new int[c1][r1];
        for(int i=0; i<c1; i++){
            for(int j=0; j<r1; j++){
                transpose[i][j] = a[j][i];
            }
        }
        return transpose;
    }

    static ArrayList<ArrayList<Integer>> Transpose2dArraylist(ArrayList<ArrayList<Integer>> A, int r1, int c1){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for(int i=0; i<c1; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<r1; j++){
                temp.add(A.get(j).get(i));
            }
            res.add(temp);
        }

        return res;
    }

    static void Transpose2dInplace(int[][] a, int r1, int c1){
        // Inplace code only works for the condition: r1==c1=N
        for(int i=0; i<r1-1; i++){  // Traversing row from 0 to N-2
            for(int j=i+1; j<c1; j++){  // Traversing col from row+1 to N-1.
                // swapping only non-principle diagonal elements
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

        // Given Matrix a of size r1*c1
        System.out.println("Given Matrix:");
        printArray(a);

        // Transpose of the matrix a stored in new matrix transpose
        // T.C: O(r1*c1)
        // S.C: O(r1*c1) 
        int[][] transpose = Transpose2d(a, r1, c1);
        System.out.println("Transpose of a matrix:");
        printArray(transpose);

        // Transpose of the matrix 'a' stored in new arraylist Transpose
        // T.C: O(r1*c1)
        // S.C: O(r1*c1)
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        for(int i=0; i<r1; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<c1; j++){
                temp.add(a[i][j]);
            }
            A.add(temp);
        }
        ArrayList<ArrayList<Integer>> Transpose = Transpose2dArraylist(A, r1, c1);
        System.out.println("Transpose of a matrix using ArrayList:");
        System.out.println(Transpose);

        // Transpose of the matrix a with in-place method
        // T.C: O(r1*c1)
        // S.C: O(1) [Only possible for square matrix where r1==c1]
        Transpose2dInplace(a, r1, c1);
        System.out.println("Transpose of an inplace matrix:");
        printArray(a);
    } 
}
