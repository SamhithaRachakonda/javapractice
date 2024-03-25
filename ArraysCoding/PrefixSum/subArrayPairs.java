package ArraysCoding.PrefixSum;

import java.util.Scanner;

public class subArrayPairs {
    /*
     * Problem Statement:
     * Check if we can partition the array into two subarrays with equal sum.
     *     => Check that the prefix sum of a part of the array is equal to the suffix sum of the rest.
     * 
     * Prefix Sum and Suffix sum Definition:
     * ------------------------------------
     * Prefix sum at index i = a[0] + a[1] + a[2] + ... + a[i]
     * Suffix sum at index i = a[i] + a[i+1] + a[i+2] + a[i+3] + ... + a[n-1]
     * Ex: a = {2, 1, 3, 4, 5, 6}
     * Prefix_sum = {2, 3, 6, 10, 15, 21}
     * Suffix_sum = {21, 19, 18, 15, 11, 6}
     * 
     * Examples:
     * Ex1: a = {5, 3, 2, 6, 3, 1}
     * Output: true. Since 5+3+2 == 6+3+1
     * Ex2: a = {15, 5, 6, 4, 8, 2}
     * Output: true. Since 15+5 == 6+4+8+2
     * Ex3: a = {1, 3, 2, 4, 5}
     * Output: false
     * Ex4: a = {5, 8, 2, 3, 4}
     * Output: false
     * 
     * Approach: 
     * 1. Calculate total sum of the given array
     * 2. Traverse the given array from 1 to n-1.
     * 3. Calculate prefix sum at every i, no need to store it in array
     * 4. Calculate suffix sum = total sum - prefix sum at that particular i
     * 5. Check if prefix sum == suffix sum.
     */
    static int findtotalArraySum(int[] a){
        int totalSum = 0;
        for(int i=0; i<a.length; i++)
            totalSum += a[i];
        
        return totalSum;
    }
    
    static boolean equalSumPartition(int[] a){
        int totalSum = findtotalArraySum(a);
        int prefixSum = 0;
        int suffixSum = 0;

        // Calculate prefix sum & suffix sum & check equality
        for(int i=0; i<a.length; i++){
            prefixSum += a[i];
            suffixSum = totalSum - prefixSum;
            if(prefixSum == suffixSum)
                return true;
        }        
        return false;
    }
    

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = scan.nextInt();
        int[] a = new int[n];

        System.out.println("Enter "+ n +" elements: ");
        for(int i=0; i<n; i++){ 
            a[i] = scan.nextInt();
        }
        scan.close();   

        System.out.println("Equal Partition Possible: "+ equalSumPartition(a));
    }
}
