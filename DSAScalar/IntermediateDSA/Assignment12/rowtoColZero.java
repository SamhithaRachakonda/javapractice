package DSAScalar.IntermediateDSA.Assignment12;

import java.util.ArrayList;
import java.util.Scanner;

public class rowtoColZero {
    /*
     * Q2. Row to Column Zero
     * 
     * You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.
     * 
     * Problem Constraints
     *      1 <= A.size() <= 10^3
     *      1 <= A[i].size() <= 10^3
     *      0 <= A[i][j] <= 10^3
     * 
     * Input 1:
     *      [1,2,3,4]
     *      [5,6,7,0]
     *      [9,2,0,4]
     * 
     * Output 1:
     *      [1,2,0,0]
     *      [0,0,0,0]
     *      [0,0,0,0]
     */
    static ArrayList<ArrayList<Integer>> rowcolZero(ArrayList<ArrayList<Integer>> A){
        int N = A.size();
        int M = A.get(0).size();

        // Traversing rows and updating -1 to all elements of the row if encountered a 0
        for(int i=0; i<N; i++){
            int flag = 0;
            for(int j=0; j<M; j++){
                if(A.get(i).get(j)==0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                for(int j=0; j<M; j++){
                    if(A.get(i).get(j)!=0){
                        A.get(i).set(j, -1);
                    }
                }
            }
        }

        // Traversing col and updating -1 to all elements of the col if encountered a 0
        for(int j=0; j<M; j++){
            int flag = 0;
            for(int i=0; i<N; i++){
                if(A.get(i).get(j)==0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                for(int i=0; i<N; i++){
                    if(A.get(i).get(j)!=0){
                        A.get(i).set(j, -1);
                    }
                }
            }
        }

        // Updating -1 to 0
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(A.get(i).get(j) == -1)
                    A.get(i).set(j, 0);
            }
        }

        return A;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        for(int i=0; i<N; i++){
            ArrayList<Integer> a = new ArrayList<>();
            for(int j=0; j<M; j++){
                a.add(scan.nextInt());
            }
            A.add(a);
        }
        scan.close();

        System.out.println(rowcolZero(A));
    }
}
