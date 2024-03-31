package ArraysCoding.Arrays2D.PatternInMatrix;

import java.util.ArrayList;
import java.util.Scanner;

public class boundaryElements {
    /*
     * Problem Statement:
     * Print boundary elements in clockwise direction for a given matrix or 2D array.
     * 
     * Ex: 
     *       1  2  3  4
     *       5  6  7  8
     *       9 10 11 12
     *      13 14 15 16
     * 
     * Output:  1 2 3 4 8 12 16 15 14 13 9 5
     * 
     * Approach:
     *      For a matrix of size N*N,
     *      Print N-1 elements in each of the following:
     *          a. first row    --> (left to right)
     *          b. last column  \|/ (top to bottom)
     *          c. last row     <-- (right to left)
     *          d. first column /|\ (bottom to top)
     */
    static void printBoundaryElementsmethod2(int[][] A){
        int N = A.length;
        
        int i=0, j=0;
        for(j=0; j<N; j++){
            System.out.print(A[i][j]+ " ");
        }

        j = N-1;
        for(i=1; i<N; i++){
            System.out.print(A[i][j]+ " ");
        }

        i = N-1;
        for(j=N-2; j>=0; j--){
            System.out.print(A[i][j]+ " ");
        }

        j = 0;
        for(i=N-2; i>0; i--){
            System.out.print(A[i][j]+ " ");
        }
    }

    static void printBoundaryElements(int[][] A){
        int N = A.length;
        int i=0, j=0;

        for(int it=1; it<N; it++){
            System.out.print(A[i][j]+ " ");
            j++;
        }
        for(int it=1; it<N; it++){
            System.out.print(A[i][j]+ " ");
            i++;
        }
        for(int it=1; it<N; it++){
            System.out.print(A[i][j]+ " ");
            j--;
        }
        for(int it=1; it<N; it++){
            System.out.print(A[i][j]+ " ");
            i--;
        }  
        System.out.println();  
    }

    static ArrayList<Integer> boundaryElementsAL(ArrayList<ArrayList<Integer>> a){
        int N = a.size();
        ArrayList<Integer> be = new ArrayList<>();
        int i=0, j=0;

        for(int it=1; it<N; it++){
            be.add(a.get(i).get(j));
            j++;
        }
        for(int it=1; it<N; it++){
            be.add(a.get(i).get(j));
            i++;
        }
        for(int it=1; it<N; it++){
            be.add(a.get(i).get(j));
            j--;
        }
        for(int it=1; it<N; it++){
            be.add(a.get(i).get(j));
            i--;
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

        // 2D matrix printing boundary elements
        // T.C: O(N): 4 independent for loops running N times.
        // S.C: O(1)
        System.out.println("Boundary Elements with arrays: ");
        printBoundaryElements(A);

        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        for(int i=0; i<N; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<N; j++){
                temp.add(A[i][j]);
            }
            a.add(temp);
        }
        System.out.println("Boundary Elements with ArrayList: ");
        // 2D matrix printing boundary elements using arraylists
        // T.C: O(N)
        // S.C: O(1)
        System.out.println(boundaryElementsAL(a));
    }
}
