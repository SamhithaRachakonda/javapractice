package DSAScalar.IntermediateDSA.Assignment7;

import java.util.ArrayList;
import java.util.Scanner;

public class RowSum {
    /*
     * Q1. Column Sum
     * Problem Description:
     * You are given a 2D integer matrix A, return a 1D integer array containing row-wise sums of original matrix.
     * 
     * Problem Constraints
     * 1 <= A.size() <= 10^3
     * 1 <= A[i].size() <= 10^3
     * 1 <= A[i][j] <= 10^3
     * 
     * Ex: [1,2,3,4]
     *     [5,6,7,8]
     *     [9,2,3,4]
     * Output: [10,26,18]
     * 
     * Explanation:
     * Row 1 = 1+2+3+4 = 10
     * Row 2 = 5+6+7+8 = 26
     * Row 3 = 9+2+3+4 = 18
     */
    static ArrayList<Integer> rowSum(ArrayList<ArrayList<Integer>> A){
        int N = A.size();
        int M = A.get(0).size();
        ArrayList<Integer> rowSum = new ArrayList<>();
        int sum = 0;

        for(int row=0; row<N; row++){
            sum = 0;
            for(int col=0; col<M; col++){
                sum += A.get(row).get(col);
            }
            rowSum.add(sum);
        }
        return rowSum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        for(int i=0; i<rows; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<cols; j++){
                temp.add(scan.nextInt());
            }
            A.add(temp);
        }
        scan.close();

        ArrayList<Integer> rowSum = rowSum(A);
        System.out.println(rowSum);
    }
}
