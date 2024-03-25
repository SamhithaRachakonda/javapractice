package DSAScalar.Assignment4;

import java.util.Scanner;
import java.util.ArrayList;

public class SpecialIndex {
    /*
     * Q4. Special Index
     * 
     * Problem Description:
     * Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
     *
     * Problem Constraints:
     *  1 <= N <= 10^5
     *  -10^5 <= A[i] <= 10^5
     * Sum of all elements of A <= 10^9
     * 
     * Ex1: A = [2, 1, 6, 4]        => Output: 1
     * Explanation for 1: Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1]. Therefore, the required output is 1. 
     * Ex2: A = [1, 1, 1]           => Output: 3
     */
    static int findSplIndex(ArrayList<Integer> A, int N){
        int count = 0;
        ArrayList<Integer> prefixEvenSum = new ArrayList<>();
        prefixEvenSum.add(A.get(0));
        for(int i=1; i<N; i++){
            if(i%2 == 0)
                prefixEvenSum.add(prefixEvenSum.get(i-1) + A.get(i));
            else
                prefixEvenSum.add(prefixEvenSum.get(i-1));
        }

        ArrayList<Integer> prefixOddSum = new ArrayList<>();
        prefixOddSum.add(0);
        for(int i=1; i<N; i++){
            if(i%2 == 1)
                prefixOddSum.add(prefixOddSum.get(i-1)+A.get(i));
            else
                prefixOddSum.add(prefixOddSum.get(i-1));
        }

        int EvenSum, OddSum;
        for(int i=0; i<N; i++){
            if(i==0){
                EvenSum = prefixOddSum.get(N-1) - prefixOddSum.get(0);
                OddSum = prefixEvenSum.get(N-1) - prefixEvenSum.get(0);
            }else{
                EvenSum = prefixEvenSum.get(i-1) + prefixOddSum.get(N-1) - prefixOddSum.get(i);
                OddSum = prefixOddSum.get(i-1) + prefixEvenSum.get(N-1) - prefixEvenSum.get(i);
            }
            if(EvenSum == OddSum)
                count++;
        }

        return count;
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
        int splIndexCount = findSplIndex(A, N);
        System.out.println(splIndexCount);
    }
}