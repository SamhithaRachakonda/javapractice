package DSAScalar.IntermediateDSA.Assignment6;
import java.util.ArrayList;
import java.util.Scanner;

public class MaxSubarray {
    /*
     * Q1. Maximum Subarray Easy
     * Problem Description:
     * You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
     * But the sum must not exceed B.
     * 
     * Problem Constraints:
     * 1 <= A <= 10^3
     * 1 <= B <= 10^9
     * 1 <= C[i] <= 10^6
     * 
     * Ex1: A = 5, B = 12, C = [2, 1, 3, 4, 5]      Output: 12
     * Explanation: We can select {3,4,5} which sums up to 12 which is the maximum possible sum.
     * A = 3, B = 1, C = [2, 2, 2]                  Output: 0
     * Explanation: All elements are greater than B, which means we cannot select any subarray.
     * Hence, the answer is 0.
     */
    static int maxSubarray(int A, int B, ArrayList<Integer> C){
        int sum;
        int maxSum = 0;

        for(int i=0; i<A; i++){
            sum = 0;
            for(int j=i; j<A; j++){
                sum += C.get(j);
                if(sum > maxSum && sum <= B)
                    maxSum = sum;
            }
        }
        
        return maxSum;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        ArrayList<Integer> C = new ArrayList<>();

        for(int i=0; i<A; i++)
            C.add(scan.nextInt());
        
        int B = scan.nextInt();
        scan.close();

        int maxSum = maxSubarray(A, B, C);
        System.out.println("Max sum of subarray which cannot exceed "+B+" : "+maxSum);
    }
}