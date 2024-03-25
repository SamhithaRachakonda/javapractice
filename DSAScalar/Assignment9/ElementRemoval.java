package DSAScalar.Assignment9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ElementRemoval {
    /*
     * Q1. Elements Removal
     * 
     * Problem Description:
     * Given an integer array A of size N. You can remove any element from the array in one operation.
     * The cost of this operation is the sum of all elements in the array present before this operation.
     * Find the minimum cost to remove all elements from the array.
     * 
     * Approach: Removing the elements in descending order, gets the min cost.
     * 
     * Problem Constraints
     * 0 <= N <= 1000
     * 1 <= A[i] <= 10^3
     * 
     * Ex 1: A = [2, 1]         Output: 4
     * Explanation 1:
     * Given array A = [2, 1]
     * Remove 2 from the array => [1]. Cost of this operation is (2 + 1) = 3.
     * Remove 1 from the array => []. Cost of this operation is (1) = 1.
     * So, total cost is = 3 + 1 = 4.
     */
    static int calculateMinCost(ArrayList<Integer> A){
        int N = A.size();
        int mincost = 0;
        
        /*
         * General Approach:
         * Ex - {a, b, c, d}
         * for removing 'a', cost = a+b+c+d
         * for removing 'b', cost =   b+c+d
         * for removing 'c', cost =     c+d
         * for removing 'd', cost =       d
         * --------------------------------
         *             Total Cost = a+2b+3c+4d
         * 
         * For total cost to be min, a <= b <= c <= d
         */
        // Sorting elements in decending order
        Collections.sort(A, Collections.reverseOrder()); 

        // After sorting in descending order, the contribution of each element is (i+1).
        for(int i=0; i<N; i++){
            mincost += (i+1)*A.get(i);
        }

        return mincost;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Integer> A = new ArrayList<>();

        for(int i=0; i<N; i++)
            A.add(scan.nextInt());
        
        scan.close();

        int mincost = calculateMinCost(A);
        System.out.println("Min cost after removing all elements: " + mincost);
    }
}
