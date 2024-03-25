package DSAScalar.IntermediateDSA.Assignment6;

import java.util.ArrayList;
import java.util.Scanner;

public class sumOfAllSubarrays {
    /*
     * Q2. Sum of All Subarrays
     * Problem Description:
     * You are given an integer array A of length N.
     * You have to find the sum of all subarray sums of A.
     * More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
     * A subarray sum denotes the sum of all the elements of that subarray.
     *
     * Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.
     * 
     * Problem Constraints:
     * 1 <= N <= 10^5
     * 1 <= A[i] <= 10^4
     * 
     * Ex1: A = [1, 2, 3]             Output: 20
     * Explanation: 
     * The different subarrays for the given array are: [1], [2], [3], [1, 2], [2, 3], [1, 2, 3].
     * Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20
     * Ex2: A = [2, 1, 3]             Output: 19
     * Explanation: 
     * The different subarrays for the given array are: [2], [1], [3], [2, 1], [1, 3], [2, 1, 3].
     * Their sums are: 2 + 1 + 3 + 3 + 4 + 6 = 19
     */
    static Long sumAllSubarrays(int N, ArrayList<Integer> A){
        long sum_i = 0;
        long totalSum = 0;

        for(int i=0; i<N; i++){
            sum_i = (long) A.get(i) * (i+1) * (N-i);
            totalSum += sum_i;
        }
        
        return totalSum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Integer> A = new ArrayList<>();

        for(int i=0; i<N; i++)
            A.add(scan.nextInt());
        
        scan.close();

        Long sumofallsubarrays = sumAllSubarrays(N, A);
        System.out.println("Sum of all subarrays for a given array: "+sumofallsubarrays);
    }
}