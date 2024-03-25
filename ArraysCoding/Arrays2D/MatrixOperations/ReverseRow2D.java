package ArraysCoding.Arrays2D.MatrixOperations;

import java.util.Scanner;

public class ReverseRow2D {
    /*
     * Problem Statement:
     * Reverse of each row for a given 2D array.
     * 
     * Ex- 
     * Given Matrix:
     *  1 2 3 10
     *  4 5 6 11
     *  7 8 9 12
     * Reverse of each row:
     *  10 3 2 1
     *  11 6 5 4
     *  12 9 8 7
     */

    static void printArray(int[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void swap(int[][] a, int i, int j, int k){
        int temp = a[k][i];
        a[k][i] = a[k][j];
        a[k][j] = temp;
    }
    static void reverseRow2d(int[][] a, int r1, int c1){
        int i, j;
        for(int k=0; k<r1; k++){
            i = 0;
            j = c1-1;
            while(i<j){
                swap(a, i, j, k);
                i++;
                j--;
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

        System.out.println("First Matrix:");
        printArray(a);

        reverseRow2d(a, r1, c1);
        System.out.println("Reverse of each row:");
        printArray(a);
    } 
}
