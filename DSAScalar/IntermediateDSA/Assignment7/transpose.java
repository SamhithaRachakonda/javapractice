package DSAScalar.IntermediateDSA.Assignment7;

import java.util.ArrayList;
import java.util.Scanner;

public class transpose {
    /*
     * Q4. Matrix Transpose
     * Problem Description:
     * Given a 2D integer array A, return the transpose of A.
     * The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
     * 
     * Problem Constraints
     * 1 <= A.size() <= 10^3
     * 1 <= A[i].size() <= 1000
     * 1 <= A[i][j] <= 1000
     * 
     * Ex: [1 2 3]
     *     [4 5 6]
     *     [7 8 9]
     * Output: [1 4 7]
     *         [2 5 8]
     *         [3 6 9]
     * 
     * Explanation:
     * Clearly after converting rows to column and columns to rows of [[1, 2, 3],[4, 5, 6],[7, 8, 9]], we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].
     * 
     */
    static ArrayList<ArrayList<Integer>> Transpose(ArrayList<ArrayList<Integer>> A){
        int N = A.size();
        int M = A.get(0).size();
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();

        // for transpose, row and col size gets interchanged
        for(int row=0; row<M; row++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int col=0; col<N; col++){
                temp.add(A.get(col).get(row));
            }
            transpose.add(temp);
        }
        
        return transpose;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        for(int i=0; i<N; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<M; j++){
                temp.add(scan.nextInt());
            }
            A.add(temp);
        }
        scan.close();

        ArrayList<ArrayList<Integer>> transpose = Transpose(A);
        System.out.println(transpose);
    }
}
