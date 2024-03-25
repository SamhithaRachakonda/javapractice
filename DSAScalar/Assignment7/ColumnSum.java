package DSAScalar.Assignment7;
import java.util.Scanner;
import java.util.ArrayList;

public class ColumnSum {
    /*
     * Q1. Column Sum
     * Problem Description:
     * You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.
     * 
     * Problem Constraints
     * 1 <= A.size() <= 10^3
     * 1 <= A[i].size() <= 10^3
     * 1 <= A[i][j] <= 10^3
     * 
     * Ex: [1,2,3,4]
     *     [5,6,7,8]
     *     [9,2,3,4]
     * Output: {15,10,13,16}
     * 
     * Explanation:
     * Column 1 = 1+5+9 = 15
     * Column 2 = 2+6+2 = 10
     * Column 3 = 3+7+3 = 13
     * Column 4 = 4+8+4 = 16
     */
    static ArrayList<Integer> columnSum(ArrayList<ArrayList<Integer>> A){
        int N = A.size();
        int M = A.get(0).size();
        ArrayList<Integer> colSum = new ArrayList<>();
        int sum = 0;

        for(int col=0; col<M; col++){
            sum = 0;
            for(int row=0; row<N; row++){
                sum += A.get(row).get(col);
            }
            colSum.add(sum);
        }
        return colSum;
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

        ArrayList<Integer> columnSum = columnSum(A);
        System.out.println(columnSum);
    }
}
