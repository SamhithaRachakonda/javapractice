package DSAScalar.IntermediateDSA.Assignment6;

import java.util.ArrayList;
import java.util.Scanner;

public class CountingSubarrays {
    /*
     * Q4. Counting Subarrays Easy
     * Problem Description:
     * Given an array A of N non-negative numbers and a non-negative number B,
     * you need to find the number of subarrays in A with a sum less than B.
     * We may assume that there is no overflow.
     * 
     * Problem Constraints:
     * 1 <= N <= 5*10^3
     * 1 <= A[i] <= 10^3
     * 1 <= B <= 10^7
     * 
     * Ex1: A = [2, 5, 6], B = 10                   Output: 4
     * Explanation: 
     * The subarrays with sum less than B are {2}, {5}, {6} and {2, 5},
     * 
     * Ex2: A = [1, 11, 2, 3, 15], B = 10           Output: 4
     * Explanation:
     * The subarrays with sum less than B are {1}, {2}, {3} and {2, 3}
     */
    static int sumSubarrays(int N, ArrayList<Integer> A, int B){
        int count = 0;
        int sum = 0;

        for(int i=0; i<N; i++){
            sum = 0;
            for(int j=i; j<N; j++){
                sum += A.get(j);
                if(sum < B)
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

        int sumCount = sumSubarrays(N, A, B);
        System.out.println("The number of subarrays with sum less than "+B+": "+sumCount);
    }
}
