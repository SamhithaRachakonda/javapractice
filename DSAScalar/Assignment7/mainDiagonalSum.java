package DSAScalar.Assignment7;

import java.util.ArrayList;
import java.util.Scanner;

public class mainDiagonalSum {
    /*
     * Q2. Main Diagonal Sum
     * Problem Description:
     * You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
     * Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.
     * 
     * Problem Constraints
     * 1 <= N <= 10^3
     * -1000 <= A[i][j] <= 1000
     * 
     * Ex: [1 -2 -3]
     *     [-4 5 -6]
     *     [-7 -8 9]
     * Output: 15 
     * 
     * Explanation:
     * The size of matrix is 3.
     * So, considering the indexing from 0.
     * Main diagonal elements will be A[0][0], A[1][1] and A[2][2]
     * A[1][1] + A[2][2] + A[3][3] = 1 + 5 + 9 = 15
     * 
     * ***** Alternative Method ******
     *  int N = A.size();
        int sum = 0;

        for(int row=0; row<N; row++){
            for(int col=0; col<N; col++){
                if(row == col)
                    sum += A.get(row).get(col);
            }
        }
        return sum;

        ^^^ Time Complexity: O(N^2)
     */
    static int mainDiagonal(ArrayList<ArrayList<Integer>> A){
        int N = A.size();
        int sum = 0;

        int i=0, j=0;
        while(i<N && j<N){
            if(i == j)
                sum += A.get(i).get(j);
            i++;
            j++;
        }
        // Time Complexity: O(N)
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        for(int i=0; i<N; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<N; j++){
                temp.add(scan.nextInt());
            }
            A.add(temp);
        }
        scan.close();

        int mainDiagonalSum = mainDiagonal(A);
        System.out.println(mainDiagonalSum);
    }
}
