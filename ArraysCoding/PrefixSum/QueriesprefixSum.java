package ArraysCoding.PrefixSum;

import java.util.Scanner;

public class QueriesprefixSum {
    /*
     * Problem Statement:
     * Given an array of integers of size n.
     * Answer q queries where you need to print the sum of values in a given range of indices from l to r (both included).
     * Note: The values of l and r in queries follow 1-based indexing.
     * 
     * Ex: a = {2, 4, 1, 3, 6}
     * Output: {2, 7, 8, 11, 17}
     * 
     * Approach: 
     * 1. Traverse the given array from 1 to n-1.
     * 2. At index i, add the elements of the given array at index a[i-1] and a[i] and store at a[i].
     * 3. Write a loop for queries, holding the range sum for the given range.
     *      where, range_sum = a[r] - a[l-1]
     */
    static void printArray(int[] a){
        for(int i=1; i<=a.length; i++)  // 1-based indexing
            System.out.print(a[i] + " ");
        System.out.println();
    }

    static void makeprefixSum(int[] a){
        int n = a.length;

    // No need to consider 1-based indexing here, as n value in this method takes care of it
        for(int i=1; i<n; i++){ 
            a[i] += a[i-1];
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = scan.nextInt();
        int[] a = new int[n+1];

        System.out.println("Enter "+ n +" elements: ");
        for(int i=1; i<=n; i++){ //1-based indexing.
            a[i] = scan.nextInt();
        }
        makeprefixSum(a);  

        System.out.println("Enter number of queries required: ");
        int q = scan.nextInt();

        while(q-- > 0){
            System.out.println("Enter the range for which the sum of values is required in an array: ");
            int l = scan.nextInt();
            int r = scan.nextInt();
            int range_sum = a[r] - a[l-1];
            System.out.println("Sum: "+ range_sum);
        }

        scan.close();   
    }
}
