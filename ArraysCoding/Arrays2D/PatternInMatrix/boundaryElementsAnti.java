package ArraysCoding.Arrays2D.PatternInMatrix;

import java.util.ArrayList;
import java.util.Scanner;

public class boundaryElementsAnti {
    /*
     * Problem Statement:
     * Print boundary elements in ANTI-clockwise direction for a given matrix or 2D array.
     * 
     * Ex: 
     *       1  2  3  4
     *       5  6  7  8
     *       9 10 11 12
     *      13 14 15 16
     * 
     * Output:  1 5 9 13 14 15 16 12 8 4 3 2
     * 
     * Approach:
     *      For a matrix of size N*N,
     *      Print N-1 elements in each of the following:
     *          a. first column  \|/ (top to bottom) 
     *          b. last row      --> (left to right)
     *          c. last column   /|\ (bottom to top)
     *          d. first row     <-- (right to left) 
     */
    static void printBoundaryElementsAntimethod2(int[][] A){
        int N = A.length;
        
        int i=0, j=0;
        for(i=0; i<N; i++){
            System.out.print(A[i][j]+ " ");
        }

        i = N-1;
        for(j=1; j<N; j++){
            System.out.print(A[i][j]+ " ");
        }

        j = N-1;
        for(i=N-2; i>=0; i--){
            System.out.print(A[i][j]+ " ");
        }

        i=0;
        for(j=N-2; j>0; j--){
            System.out.print(A[i][j]+ " ");
        }
    }

    static void printBoundaryElementsAnti(int[][] A){
        int N = A.length;
        int i=0, j=0;

        for(int it=1; it<N; it++){
            System.out.print(A[i][j]+ " ");
            i++;
        }
        for(int it=1; it<N; it++){
            System.out.print(A[i][j]+ " ");
            j++;
        }
        for(int it=1; it<N; it++){
            System.out.print(A[i][j]+ " ");
            i--;
        }
        for(int it=1; it<N; it++){
            System.out.print(A[i][j]+ " ");
            j--;
        }  
        System.out.println();  
    }

    static ArrayList<Integer> boundaryElementsAntiAL(ArrayList<ArrayList<Integer>> a){
        int N = a.size();
        ArrayList<Integer> be = new ArrayList<>();
        int i=0, j=0;

        for(int it=1; it<N; it++){
            be.add(a.get(i).get(j));
            i++;
        }
        for(int it=1; it<N; it++){
            be.add(a.get(i).get(j));
            j++;
        }
        for(int it=1; it<N; it++){
            be.add(a.get(i).get(j));
            i--;
        }
        for(int it=1; it<N; it++){
            be.add(a.get(i).get(j));
            j--;
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

        // 2D matrix printing boundary elements anti-clockwise direction
        // T.C: O(N): 4 independent for loops running N times.
        // S.C: O(1)
        System.out.println("Boundary Elements anti-clockwise direction using arrays: ");
        printBoundaryElementsAnti(A);

        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        for(int i=0; i<N; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<N; j++){
                temp.add(A[i][j]);
            }
            a.add(temp);
        }
        System.out.println("Boundary Elements anti-clockwise direction using ArrayList: ");
        // 2D matrix printing boundary elements anti-clockwise direction using arraylists
        // T.C: O(N)
        // S.C: O(1)
        System.out.println(boundaryElementsAntiAL(a));
    }
}
