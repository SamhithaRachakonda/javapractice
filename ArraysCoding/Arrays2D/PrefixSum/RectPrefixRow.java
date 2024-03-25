package ArraysCoding.Arrays2D.PrefixSum;

import java.util.Scanner;

public class RectPrefixRow {
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
     * Approach (Pre-Calculating the horizontal sum for each row in the matrix): 
     * 1. Calculate prefix sum for all the rows
     * 2. Run a loop l1 to l2 and add the prefix sum range at each row.
     */

    static void printArray(int[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int rectangleSumRangePrefixRow(int[][] a, int r, int c, int l1, int r1, int l2, int r2){
        int sum = 0;
        // Step-1:
        // Prefix sum for each row
        for(int i=0; i<r; i++){
            for(int j=1; j<c; j++){
                a[i][j] += a[i][j-1];
            }
        }

        // Step-2:
        // Prefix sum range (a[i][r2]-a[i][r1-1]) to get the sum of rectangle for that particular row.
        // Add for all the rows (i = l1 to l2) to get the whole sum of rectangle for required range.
        for(int i=l1; i<=l2; i++){
            if(r1>=1)
                sum += a[i][r2]-a[i][r1-1];
            else
                sum += a[i][r2];
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

        int rectangleSum = rectangleSumRangePrefixRow(a, r, c, l1, r1, l2, r2);
        System.out.println("Sum of elements of given range rectangle: "+ rectangleSum);
    } 
}
