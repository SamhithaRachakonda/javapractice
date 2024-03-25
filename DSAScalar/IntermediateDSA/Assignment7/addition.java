package DSAScalar.IntermediateDSA.Assignment7;

import java.util.ArrayList;
import java.util.Scanner;

public class addition {
    /*
     * Q2. Add the matrices
     * Problem Description:
     * You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
     * Note: Matrices are of same size means the number of rows and number of columns of both matrices are equal.
     * 
     * Problem Constraints
     * 1 <= A.size(), B.size() <= 1000 
     * 1 <= A[i].size(), B[i].size() <= 1000 
     * 1 <= A[i][j], B[i][j] <= 1000
     * 
     * Ex: A = [[1,2,3]      B = [[9, 8, 7]
     *          [4,5,6]           [6, 5, 4]
     *          [7,8,9]]          [3, 2, 1]]
     * Output: 
     * [[10, 11, 10],   
     * [5,   3,  6],   
     * [11, 14, 12]]
     * 
     * Explanation:
     * A + B = [[1+9, 2+8, 3+7],  
                [4+6, 5+5, 6+4],  
                [7+3, 8+2, 9+1]]   
            = [[10, 10, 10],   
               [10, 10, 10],   
               [10, 10, 10]].
     */
    static ArrayList<ArrayList<Integer>> AddMatrix(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B){
        int N = A.size();
        int M = A.get(0).size();
        ArrayList<ArrayList<Integer>> C = new ArrayList<>();

        for(int i=0; i<N; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<M; j++){
                temp.add(A.get(i).get(j) + B.get(i).get(j));
            }
            C.add(temp);
        }

        return C;
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

        ArrayList<ArrayList<Integer>> B = new ArrayList<>();

        for(int i=0; i<rows; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<cols; j++){
                temp.add(scan.nextInt());
            }
            B.add(temp);
        }
        scan.close();

        ArrayList<ArrayList<Integer>> additionMatrix = AddMatrix(A, B);
        System.out.println(additionMatrix);
    }
}
