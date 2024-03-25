package ArraysCoding.Arrays2D.PrefixSum;

import java.util.Scanner;

public class RectangleSumRange {
    /*
     * Problem Statement:
     * Given a matrix 'a' of dimension r*c and 2 coordinates (l1, r1) and (l2, r2).
     * Return the sum of the rectangle from (l1, r1) to (l2, r2).
     * 
     * Constraints:
     * l2 >= l1, r2 >= r1
     * 0 <= l1,l2 < r
     * 0 <= r1,r2 < c
     * 
     * Ex: 7*7 matrix is given as below:
     * 1 1 1 1 1 1 1
     * 1 1 1 1 1 1 1
     * 1 1 1 1 1 1 1
     * 1 1 1 1 1 1 1
     * 1 1 1 1 1 1 1
     * 1 1 1 1 1 1 1
     * 1 1 1 1 1 1 1
     * l1 = 3, r1 = 1; l2 = 5, r2 = 4;
     * Output: 12
     * Output Explanation: The rectangle formed by coordinates (l1, r1) and (l2, r2). Get the sum of all the elements inside that rectangle.
     * 
     * Approach (Bruteforce Method): 
     * 1. Traverse the given array from l1 to l2 (rows) & Inner loop r1 to r2 (columns).
     * 2. Sum all the elements inside that loop.
     */

    static void printArray(int[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int rectangleSumRangeBruteforce(int[][] a, int r, int c, int l1, int r1, int l2, int r2){
        int sum = 0;
        for(int i=l1; i<=l2; i++){
            for(int j=r1; j<=r2; j++){
                sum += a[i][j];
            }
        }
        
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rows and columns of first matrix");
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] a = new int[r][c];
        System.out.println("Enter the matrix values: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter rectangle boundaries l1, r1, l2, r2:");
        int l1 = scan.nextInt();
        int r1 = scan.nextInt();
        int l2 = scan.nextInt();
        int r2 = scan.nextInt();
        scan.close();

        System.out.println("Given Matrix:");
        printArray(a);

        int rectangleSum = rectangleSumRangeBruteforce(a, r, c, l1, r1, l2, r2);
        System.out.println("Sum of elements of given range rectangle: "+ rectangleSum);
    } 
}
