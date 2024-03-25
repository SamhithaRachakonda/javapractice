package DSAScalar.Assignment6;

import java.util.ArrayList;
import java.util.Scanner;

public class sumGivenLength {
    /*
     * Q3. Subarray with given sum and length
     * Problem Description:
     * Given an array A of length N. Also given are integers B and C.
     * Return 1 if there exists a subarray with length B having sum C and 0 otherwise
     * 
     * Problem Constraints:
     * 1 <= N <= 10^5
     * 1 <= A[i] <= 10^4
     * 1 <= B <= N
     * 1 <= C <= 10^9
     * 
     * Ex1: A = [4, 3, 2, 6, 1], B = 3, C = 11             Output: 1
     * Explanation: 
     * The subarray [3, 2, 6] is of length 3 and sum 11.
     * Ex2: A = [4, 2, 2, 5, 1], B = 4, C = 6             Output: 0
     * Explanation: 
     * There are no such subarray.
     */
    static int givenLengthSumSubarray(int N, ArrayList<Integer> A, int B, int C){
        int sum = 0;

        // 1st subarray with B length sum
        for(int i=0; i<B; i++)
            sum += A.get(i);
        if(sum == C)
            return 1;

        // Sliding window
        int i=1, j=B;
        while(j<N){
            sum = sum - A.get(i-1) + A.get(j);
            if(sum == C)
                return 1;
            i++;
            j++;
        }
        
        return 0;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Integer> A = new ArrayList<>();

        for(int i=0; i<N; i++)
            A.add(scan.nextInt());
        
        int B = scan.nextInt();
        int C = scan.nextInt();
        scan.close();

        int givenLengthSumExists = givenLengthSumSubarray(N, A, B, C);
        System.out.println("Given length "+B+", does the sum of the subarray which is equal to "+C+ " exists: "+givenLengthSumExists);
    }
}