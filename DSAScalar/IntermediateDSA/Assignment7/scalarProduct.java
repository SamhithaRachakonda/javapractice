package DSAScalar.IntermediateDSA.Assignment7;

import java.util.ArrayList;
import java.util.Scanner;

public class scalarProduct {
    /*
     * Q1. Matrix Scalar Product
     * Problem Description:
     * You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.
     * 
     * Problem Constraints
     * 1 <= A.size() <= 10^3
     * 1 <= A[i].size() <= 10^3
     * 1 <= A[i][j] <= 10^3
     * 1 <= B <= 1000
     * 
     * Ex: [1,2,3]
     *     [5,6,7]
     *     [9,2,3],       B = 2
     * Output:
     * [2,4,6]
     * [8,10,12]
     * [14,16,18]
     * 
     * Explanation:
     * ==> ( [[1, 2, 3],[4, 5, 6],[7, 8, 9]] ) * 2
     * ==> [[2*1, 2*2, 2*3],
     * [2*4, 2*5, 2*6],
     * [2*7, 2*8, 2*9]]
     * 
     * ==> [[2,   4,  6], 
     *     [8,  10, 12], 
     *     [14, 16, 18]]
     */
    static ArrayList<ArrayList<Integer>> ScalarProduct(ArrayList<ArrayList<Integer>> A, int B){
        int N = A.size();
        int M = A.get(0).size();
        ArrayList<ArrayList<Integer>> scalarProduct = new ArrayList<>();

        for(int i=0; i<N; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<M; j++){
                temp.add(B*A.get(i).get(j));
            }
            scalarProduct.add(temp);
        }
        
        return scalarProduct;
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
        int B = scan.nextInt();
        scan.close();

        ArrayList<ArrayList<Integer>> scalarProduct = ScalarProduct(A, B);
        System.out.println(scalarProduct);
    }
}
