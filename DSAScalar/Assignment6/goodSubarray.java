package DSAScalar.Assignment6;

import java.util.ArrayList;
import java.util.Scanner;

public class goodSubarray {
    /*
     * Q1. Good Subarrays Easy
     * Problem Description:
     * Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
     * 1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
     * 2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
     * Your task is to find the count of good subarrays in A.
     * 
     * Problem Constraints:
     * 1 <= N <= 5*10^3
     * 1 <= A[i] <= 10^3
     * 1 <= B <= 10^7
     * 
     * Ex1: A = [1, 2, 3, 4, 5], B = 4                    Output: 6
     * Explanation: 
     * Even length good subarrays = {1, 2}
     * Odd length good subarrays = {1, 2, 3}, {1, 2, 3, 4, 5}, {2, 3, 4}, {3, 4, 5}, {5} 
     * Ex2: A = [13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9], B = 65      Output: 36
     * 
     */
    static int goodsubarray(int N, ArrayList<Integer> A, int B){
        int count = 0;
        int sum = 0;
        int length = 0;

        for(int i=0; i<N; i++){
            sum = 0;
            for(int j=i; j<N; j++){
                sum += A.get(j);
                length = j-i+1;
                if(length%2 == 0 && sum < B)
                    count++;
                else if(length%2 == 1 && sum > B)
                    count++;
            }
        }
        
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Integer> A = new ArrayList<>();

        for(int i=0; i<N; i++)
            A.add(scan.nextInt());
        
        int B = scan.nextInt();
        scan.close();

        int goodSubarrayCount = goodsubarray(N, A, B);
        System.out.println("The count of good subarrays: "+goodSubarrayCount);
    }
}
