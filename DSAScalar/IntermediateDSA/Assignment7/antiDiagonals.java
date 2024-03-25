package DSAScalar.IntermediateDSA.Assignment7;

import java.util.ArrayList;
import java.util.Scanner;

public class antiDiagonals {
    /*
     * Q3. Anti Diagonals
     * Problem Description:
     * Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.
     * 
     * Problem Constraints
     * 1 <= N <= 10^3
     * 1 <= A[i][j] <= 1e^9
     * 
     * Ex: [1 2 3]
     *     [4 5 6]
     *     [7 8 9]
     * Output: 1 0 0
     *         2 4 0
     *         3 5 7
     *         6 8 0
     *         9 0 0
     * 
     * Explanation:
     * The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
     * The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
     * The third anti diagonal of the matrix is [3, 5, 7 ], the rest spaces shoud be filled with 0 making the row as [3, 5, 7].
     * The fourth anti diagonal of the matrix is [6, 8 ], the rest spaces shoud be filled with 0 making the row as [6, 8, 0].
     * The fifth anti diagonal of the matrix is [9 ], the rest spaces shoud be filled with 0 making the row as [9, 0, 0].
     * 
     */
    static void get_anti_diagonal(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> antiDiagonals, int row, int col){
        int N = A.size();
        ArrayList<Integer> temp = new ArrayList<>();
        while(row<N && col>=0){
            temp.add(A.get(row).get(col));
            row++;
            col--;
        }
        antiDiagonals.add(temp);
    }
    static ArrayList<ArrayList<Integer>> AntiDiagonals(ArrayList<ArrayList<Integer>> A){
        int N = A.size();
        ArrayList<ArrayList<Integer>> antiDiagonals = new ArrayList<>();

        for(int col=0; col<N; col++){
            int row = 0;
            get_anti_diagonal(A, antiDiagonals, row, col);
        }

        for(int row=1; row<N; row++){
            int col = N-1;
            get_anti_diagonal(A, antiDiagonals, row, col);
        }
        
        int M = antiDiagonals.size();
        for(int i=0; i<M; i++){
            while(antiDiagonals.get(i).size() < N){
                antiDiagonals.get(i).add(0);
            }
        }
        return antiDiagonals;
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

        ArrayList<ArrayList<Integer>> antiDiagonals = AntiDiagonals(A);
        System.out.println(antiDiagonals);
    }
}
