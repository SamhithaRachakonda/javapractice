package DSAScalar.Assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class pickBothSides {
    /*
     * Q1. Pick from both sides!
     * Problem Description
     * You are given an integer array A of size N.
     * You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.
     * Find and return the maximum possible sum of the B elements that were removed after the B operations.
     * NOTE: Suppose B = 3, and array A contains 10 elements, then you can:
     *
     * Remove 3 elements from front and 0 elements from the back, OR
     * Remove 2 elements from front and 1 element from the back, OR
     * Remove 1 element from front and 2 elements from the back, OR
     * Remove 0 elements from front and 3 elements from the back.
     * 
     * Problem Constraints
     * 1 <= N <= 10^5
     * 1 <= B <= N
     * -10^3 <= A[i] <= 10^3
     * 
     * Ex1: A = [5, -2, 3 , 1, 2], B=3      => Output: 8
     * Explanation: Remove element 5 from front and element (1, 2) from back so we get 5 + 1 + 2 = 8
     * Ex2: A = [ 2, 3, -1, 4, 2, 1 ], B=4  => Output: 9
     * Explanation: Remove the first element and the last 3 elements. So we get 2 + 4 + 2 + 1 = 9 
     */
    static ArrayList<Integer> prefixSum(ArrayList<Integer> A, int N){
        ArrayList<Integer> prefixSum = new ArrayList<>();
        prefixSum.add(A.get(0));
        for(int i=1; i<N; i++){
            prefixSum.add(prefixSum.get(i-1)+A.get(i));
        }
        return prefixSum;
    }

    static ArrayList<Integer> suffixSum(ArrayList<Integer> A, int N){
        ArrayList<Integer> suffixSum = new ArrayList<>();
        suffixSum.add(A.get(N-1));
        for(int i=N-2; i>=0; i--){
            suffixSum.add(suffixSum.get(N-i-2)+A.get(i));
        }
        Collections.reverse(suffixSum);
        return suffixSum;
    }
    
    static int pickfromBothSides(ArrayList<Integer> A, int N, int B){
        ArrayList<Integer> prefixSum = prefixSum(A, N);
        ArrayList<Integer> suffixSum = suffixSum(A, N);    
        int maxsum = 0;

        maxsum = Math.max(prefixSum.get(B-1), suffixSum.get(N-B));

        for(int i=1; i<B; i++){
            maxsum = Math.max(maxsum, prefixSum.get(i-1)+suffixSum.get(N-B+i));
        }

        return maxsum;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size for input array:");
        int N = scan.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<N; i++){
            A.add(scan.nextInt());
        }
        System.out.println("No. of elements to be picked: ");
        int B = scan.nextInt();
        scan.close();

        System.out.println("Input Array: "+ A);
        int maxsum = pickfromBothSides(A, N, B);
        System.out.println(maxsum);
    }
}