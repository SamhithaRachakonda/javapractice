package DSAScalar.IntermediateDSA.Assignment6;

import java.util.ArrayList;
import java.util.Scanner;

public class minSwaps {
    /*
     * Q2. Minimum Swaps
     * Problem Description:
     * Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.
     * Note: It is possible to swap any two elements, not necessarily consecutive.
     * 
     * Problem Constraints:
     * 1 <= N <= 10^5
     * 10^-9 <= A[i], B <= 10^9
     * 
     * Ex1: A = [1, 12, 10, 3, 14, 10, 5], B = 8          Output: 2
     * Explanation: 
     *  A = [1, 12, 10, 3, 14, 10, 5]
     * After swapping  12 and 3, A => [1, 3, 10, 12, 14, 10, 5].
     * After swapping  the first occurence of 10 and 5, A => [1, 3, 5, 12, 14, 10, 10].
     * Now, all elements less than or equal to 8 are together
     * 
     * Ex2: A = [5, 17, 100, 11], B = 20                  Output: 1
     * Explanation:
     *  A = [5, 17, 100, 11]
     * After swapping 100 and 11, A => [5, 17, 11, 100].
     * Now, all elements less than or equal to 20 are together.
     */
    static int minswaps(int N, ArrayList<Integer> A, int B){
        int min_count = 0;
        int swap = 0;

        // getting sliding window length
        for(int i=0; i<N; i++){
            if(A.get(i) <= B)
                min_count++;
        }
        // Only one or zero values less than B in an array, swap is not required.
        if(min_count <= 1)
            return 0;
        
        for(int i=0; i<min_count; i++){
            if(A.get(i) > B)
                swap++;
        }
        int min_swaps = swap;

        int i=1, j=min_count;
        while(j<N){
            if(A.get(i-1) > B)
                swap--;
            if(A.get(j) > B)
                swap++;
            min_swaps = Math.min(min_swaps, swap);
            i++;
            j++;
        }
        
        return min_swaps;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Integer> A = new ArrayList<>();

        for(int i=0; i<N; i++)
            A.add(scan.nextInt());
        
        int B = scan.nextInt();
        scan.close();

        int minSwapCount = minswaps(N, A, B);
        System.out.println("The count of min swaps required to bring subarrays less than or equal to "+B+" together: "+minSwapCount);
    }
}
