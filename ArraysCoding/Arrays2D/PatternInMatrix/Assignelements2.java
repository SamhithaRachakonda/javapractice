package ArraysCoding.Arrays2D.PatternInMatrix;

import java.util.Scanner;

public class Assignelements2 {
     /*
     * Problem Statement:
     * Given a positive integer n, generate an n*n matrix filled with elements from 1 to n^2 in spiral order with ANTI-CLOCKWISE DIRECTION.
     * 
     * Ex- Given n = 3:
     * Output:
     *  1 2 3
     *  8 9 4
     *  7 6 5
     * Traverse elements in spiral order while assigning elements to matrix.
     *  
     * 
     * Ex- Given n = 5
     * Output: 5*5 matrix with elements traversing in spiral order from 1 to n*n
     * 1  2  3  4  5
     * 16 17 18 19 6
     * 15 24 25 20 7
     * 14 23 22 21 8
     * 13 12 11 10 9
     * 
     * Takeaways:
     * Check the < and > symbols and use appropriately
     * Use ++ and -- after checking where it is necessary
     */

    static void printArray(int[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rows or columns for a square matrix");
        int n = scan.nextInt();
        scan.close();

        int[][] a = new int[n][n];
        int current = 1;
        int topRow = 0, bottomRow = n-1, rightCol = n-1, leftCol = 0;
        while(current <= n*n){
            for(int i=topRow; i<=bottomRow && current<=n*n; i++)
                a[i][leftCol] = current++;
            leftCol++;
            for(int j=leftCol; j<=rightCol && current<=n*n; j++)
                a[bottomRow][j] = current++;
            bottomRow--;
            for(int i=bottomRow; i>=topRow && current<=n*n; i--)
                a[i][rightCol] = current++;
            rightCol--;
            for(int j=rightCol; j>=leftCol && current<=n*n; j--)
                a[topRow][j] = current++;
            topRow++;   
        }

        System.out.println("Print Matrix:");
        printArray(a);
    } 
}
