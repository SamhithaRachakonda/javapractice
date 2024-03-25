package DSAScalar.IntermediateDSA.Assignment7;

import java.util.ArrayList;
import java.util.Scanner;

public class minorDiagonal {
    /*
     * Q3. Minor Diagonal Sum
     * Problem Description:
     * You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.
     * Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M + 1 (where i, j are 1-based).
     * 
     * Problem Constraints
     * 1 <= N <= 10^3
     * -1000 <= A[i][j] <= 1000
     * 
     * Ex: [1 -2 -3]
     *     [-4 5 -6]
     *     [-7 -8 9]
     * Output: -5 
     * 
     * Explanation:
     * // Minor Diagonal is the same as anti-diagonal elements.
     * A[1][3] + A[2][2] + A[3][1] = (-3) + 5 + (-7) = -5
     * 
     */
    static int MinorDiagonal(ArrayList<ArrayList<Integer>> A){
        int sum = 0;
        int N = A.size();
        int row=0, col=N-1;
        while(row<N && col>=0){
            sum += A.get(row).get(col);
            row++;
            col--;
        }
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

        int minorDiagonalSum = MinorDiagonal(A);
        System.out.println(minorDiagonalSum);
    }
}
