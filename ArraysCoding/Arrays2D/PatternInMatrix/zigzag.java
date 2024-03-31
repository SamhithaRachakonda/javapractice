package ArraysCoding.Arrays2D.PatternInMatrix;

import java.util.ArrayList;
import java.util.Scanner;

public class zigzag {
    /*
     * Problem Statement:
     * Print the elements in zig-zag form for a given matrix or 2D array.
     * 
     * Ex: 
     *       1  2  3  4
     *       5  6  7  8
     *       9 10 11 12
     *      13 14 15 16
     * 
     * Output:  1 2 3 4 8 7 6 5 9 10 11 12 16 15 14 13
     * 
     * Approach:
     *      For a matrix of size N*N,
     *      Print N-1 elements in each of the following:
     *          a. first row    --> (left to right)
     *          b. last column  \|/ (top to bottom)
     *          c. last row     <-- (right to left)
     *          d. first column /|\ (bottom to top)
     */
    static void printzigzagElements(int[][] A){
        
        for(int i=0; i<A.length; i++){
            if(i%2 == 0){
                for(int j=0; j<A[i].length; j++){
                    System.out.print(A[i][j]+ " ");
                }
            } else{
                for(int j=A[i].length-1; j>=0; j--){
                    System.out.print(A[i][j]+ " ");
                }
            }
        }
    }

    static ArrayList<Integer> zigzagElementsAL(ArrayList<ArrayList<Integer>> a){
        int N = a.size();
        ArrayList<Integer> be = new ArrayList<>();
        
        for(int i=0; i<N; i++){
            if(i%2 == 0){
                for(int j=0; j<N; j++){
                    be.add(a.get(i).get(j));
                }
            } else{
                for(int j=N-1; j>=0; j--){
                    be.add(a.get(i).get(j));
                }
            }
        }

        return be;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 'N', size of square matrix: " );
        int N = scan.nextInt();
        int[][] A = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                A[i][j] = scan.nextInt();
            }
        }
        scan.close();

        // 2D matrix printing elements in zigzag form
        // T.C: O(N^2): loop traversing all the elements
        // S.C: O(1)
        System.out.println("Boundary Elements with arrays: ");
        printzigzagElements(A);

        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        for(int i=0; i<N; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<N; j++){
                temp.add(A[i][j]);
            }
            a.add(temp);
        }
        System.out.println("Boundary Elements with ArrayList: ");
        // 2D matrix printing elements in zigzag form using arraylists
        // T.C: O(N^2)
        // S.C: O(1)
        System.out.println(zigzagElementsAL(a));
    }
}
