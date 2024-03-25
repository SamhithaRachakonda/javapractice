package DSAScalar.IntermediateDSA.Assignment4;

import java.util.Scanner;
import java.util.ArrayList;

public class RangeSum {
    /*
     * Q3. Range Sum Query
     * Problem Description:
     *  You are given an integer array A of length N.
     *  You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
     *  For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
     *  More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
     * 
     * Problem Constraints:
     *  1 <= N, M <= 10^5
     *  1 <= A[i] <= 10^9
     *  0 <= L <= R < N
     * 
     * Ex:  A = [1, 2, 3, 4, 5]
     *      B = [[0, 3], [1, 2]]        => Output: [10, 5]
     * Ex:  A = [2, 2, 2]
     *      B = [[0, 0], [1, 2]]        => Output: [2, 4]
     * 
     */
    static void printArrayInt(ArrayList<Integer> A){
        for(int i=0; i<A.size(); i++)
            System.out.println(A.get(i) + " ");
        System.out.println();
    }

    static ArrayList<Long> RangeSumQuery(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B){
        int N = A.size();
        ArrayList<Long> prefixSum = new ArrayList<Long>();  
        // Here, prefix sum is long datatype, as return type is long. If we create integer datatype for prefix sum, some information might be misplaced.
        // Return type is long because of problem constraints: 10^5 * 10^9 = 10^14, Integer datatype can only hold 10^9 values.
        // Long datatype holds upto 10^18 values.
        
        prefixSum.add((long) A.get(0));
        for(int i=1; i<N; i++){
            prefixSum.add(prefixSum.get(i-1)+A.get(i));
        }

        int L, R;
        ArrayList<Long> rangeSum = new ArrayList<Long>();
        for(int i=0; i<B.size(); i++){
            L = B.get(i).get(0);
            R = B.get(i).get(1);
            if(L == 0)
                rangeSum.add(prefixSum.get(R));
            else
                rangeSum.add(prefixSum.get(R) - prefixSum.get(L-1));    
        }

        return rangeSum;
    }

    static ArrayList<Long> RangeSumQuery2(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B){
        ArrayList<Long> prefixSum = new ArrayList<>();
        prefixSum.add((long) A.get(0));
        for(int i=1; i<A.size(); i++){
            prefixSum.add(prefixSum.get(i-1) + A.get(i));
        }

        ArrayList<Long> rangeSum = new ArrayList<Long>();
        for(int i=0; i<B.size(); i++){
            rangeSum.add(prefixSum.get(B.get(i).get(1)) - (B.get(i).get(0) > 0 ? prefixSum.get(B.get(i).get(0)-1) : 0));
        }
        
        return rangeSum;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the Array A: ");
        int N = scan.nextInt();

        ArrayList<Integer> A = new ArrayList<Integer>();
        System.out.println("Enter A array elements:");
        for(int i=0; i<N; i++){
            A.add(scan.nextInt());
        }

        System.out.println("Enter the number of queries to be asked: ");
        int M = scan.nextInt();

        System.out.println("Enter the values for left and right indeces to query: ");
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0; i<M; i++){
            ArrayList<Integer> b0 = new ArrayList<Integer>();
            System.out.println(i+1 + " Query: ");
            for(int j=0; j<2; j++){  // only left and right indices query, so j<2
                b0.add(scan.nextInt());
            }
            B.add(b0);
        }

        System.out.println(A);
        System.out.println(B);

        ArrayList<Long> ans = RangeSumQuery(A, B);
        System.out.println(ans); // No need to create a printArray function for ArrayLists
        System.out.println("Another Method:");
        ArrayList<Long> ans2 = RangeSumQuery2(A,B);
        System.out.println(ans2);
        scan.close();
    }
}
