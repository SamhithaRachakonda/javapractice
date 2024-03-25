package ArraysCoding.Arrays2D;

import java.util.Scanner;

public class Rotate2DMatrix {
    /*
     * Problem Statement:
     * Given a square matrix, turn it by 90 degrees in clockwise direction without using any extra space
     * 
     * Ex- 
     * Given Matrix:
     *  1 2 3
     *  4 5 6
     *  7 8 9
     * Rotation clockwise by 90 degrees:
     *  7 4 1
     *  8 5 2
     *  9 6 3
     */
    static void printArray(int[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void reverseArray(int[] a){
        int i=0, j=a.length-1;
        while(i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
    static void rotate2dMatrix(int[][] a, int n){
        // Step 1: Transpose
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                // swap a[i][j] to a[j][i]
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        // Step 2: Reverse the elements of each row separately
        for(int i=0; i<n; i++){
            reverseArray(a[i]);
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rows or columns of square matrix");
        int n = scan.nextInt();  // Since r1 = c1 for square matrix
        int[][] a = new int[n][n];
        System.out.println("Enter first matrix values: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = scan.nextInt();
            }
        }
        scan.close();

        System.out.println("Given Matrix:");
        printArray(a);

        rotate2dMatrix(a, n);
        System.out.println("Matrix after rotating 90 degrees clockwise:");
        printArray(a);
    } 
}
