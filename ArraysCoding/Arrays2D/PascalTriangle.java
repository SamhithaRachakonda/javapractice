package ArraysCoding.Arrays2D;

import java.util.Scanner;

public class PascalTriangle {
    /*
     * Problem Statement:
     * Given an integer n, return the first n rows of the Pascal's triangle.
     * In Pascal's triangle, each number is the sum of the two numbers directly above it.
     * 
     * Example of Pascal's triangle for n=5 with 2D array visualization (Half matrix of 5*5 matrix):
     * 1
     * 1   1
     * 1   2   1
     * 1   3   3   1
     * 1   4   6   4   1
     * 
     * Observation:
     * 1. p[i][j] = p[i-1][j] + p[i-1][j-1]
     * 2. In every row, first & last element = 1
     * 3. The above example is jagged array, where the column length is different for every row.
     *      => this particular array, 'i'th row has i+1 columns.
     */
    static void printArray(int[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] Pascal2dMatrix(int n){
        int[][] pascalTriangle = new int[n][];

        for(int i=0; i<n; i++){ // rows of pascal's triangle
            // 1st Step: ith row has i+1 columns
            /*  (Defining column length)
             *  pascalTriangle[0] = new int[1]
             *  pascalTriangle[1] = new int[2]
             */
            pascalTriangle[i] = new int[i+1];
            
            // 2nd step: 1st and last element of every row is 1
            pascalTriangle[i][0] = pascalTriangle[i][i] = 1;

            // 3rd step: p[i][j] = p[i-1][j] + p[i-1][j-1]
            for(int j=1; j<i; j++){
                pascalTriangle[i][j] = pascalTriangle[i-1][j] + pascalTriangle[i-1][j-1];
            }
        }

        return pascalTriangle;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows for pascal's triangle");
        int n = scan.nextInt();  // Since r1 = c1 for square matrix
        
        scan.close();

        int[][] pascalTriangle = Pascal2dMatrix(n);
        System.out.println("Pascal Triangle for "+ n + " rows:");
        printArray(pascalTriangle);
    } 
}
