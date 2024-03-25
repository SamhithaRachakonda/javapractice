package DSAScalar.Assignment5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class UniqueSubarrays {
    /*
     * Q3. Count Subarrays
     * Problem Description
     * Misha likes finding all Subarrays of an Array. Now she gives you an array A of N elements and told you to find the number of subarrays of A, that have unique elements.
     * Since the number of subarrays could be large, return value % 109 +7.
     * 
     * Problem Constraints
     * 0 <= N <= 10^5
     * 1 <= A[i] <= 10^6
     * 
     * Ex1: A = [1, 1, 3]              => Output: 4
     * Explanation: 
     * Subarrays of A that have unique elements only: [1], [1], [1, 3], [3]
     * Ex2: A = [2, 1, 2]              => Output: 5
     * Explanation: 
     * Subarrays of A that have unique elements only: [2], [1], [2, 1], [1, 2], [2]
     */
    
    
    static int uniqueSubarray(ArrayList<Integer> A, int N){
        HashMap<Integer, Integer> elementIndex = new HashMap<>();
        int left = 0, result = 0;

        for(int right=0; right<N; right++){
            if(elementIndex.containsKey(A.get(right))){
                left = Math.max(left, elementIndex.get(A.get(right))+1);
            }
            elementIndex.put(A.get(right), right);
            result = (result + (right-left+1)) % 1000000007;
        }
        return result;
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
        int uniqueSubarrayCount = uniqueSubarray(A, N);
        System.out.println(uniqueSubarrayCount);
    }
}
