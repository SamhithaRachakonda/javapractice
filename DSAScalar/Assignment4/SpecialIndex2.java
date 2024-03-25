package DSAScalar.Assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class SpecialIndex2 {
    /*
     * Q2. Equilibrium index of an array
     * 
     * Problem Description:
     * You are given an array A of integers of size N.
     * Your task is to find the equilibrium index of the given array.
     * The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
     * If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.
     *
     * Note:
     * Array indexing starts from 0.
     * If there is no equilibrium index then return -1.
     * If there are more than one equilibrium indexes then return the minimum index.
     * 
     * Problem Constraints:
     *  1 <= N <= 10^5
     *  -10^5 <= A[i] <= 10^5
     * 
     * Ex1: A = [-7, 1, 5, 2, -4, 3, 0]       => Output: 3
     * Explanation for 1: 
     * i   Sum of elements at lower indexes    Sum of elements at higher indexes
     * 0                   0                                   7
     * 1                  -7                                   6
     * 2                  -6                                   1
     * 3                  -1                                  -1
     * 4                   1                                   3
     * 5                  -3                                   0
     * 6                   0                                   0
     *
     * 3 is an equilibrium index, because: 
     * A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
     * 
     * Ex2: A = [1, 2, 3]         => Output: -1
     */
    static int findEquiIndex(ArrayList<Integer> A, int N){
        ArrayList<Integer> prefixSum = new ArrayList<>();
        prefixSum.add(A.get(0));
        for(int i=1; i<N; i++){
            prefixSum.add(prefixSum.get(i-1)+A.get(i));
        }

        int LISum = 0, HISum = 0;
        for(int i=0; i<N; i++){
            if(i==0){
                LISum = 0;
                HISum = prefixSum.get(N-1) - prefixSum.get(0);
            } else if(i == N-1){
                LISum = prefixSum.get(N-2);
                HISum = 0;
            } else{
                LISum = prefixSum.get(i-1);
                HISum = prefixSum.get(N-1) - prefixSum.get(i);
            }
            if(LISum == HISum)
                return i;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size for input array:");
        int N = scan.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<N; i++){
            A.add(scan.nextInt());
        }
        scan.close();

        System.out.println("Input Array: "+ A);
        int splEquiIndex = findEquiIndex(A, N);
        System.out.println(splEquiIndex);
    }
}
