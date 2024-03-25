package ArraysCoding.PrefixSum;

import java.util.Scanner;

public class suffixSum {
     /*
     * Problem Statement:
     * Given an integer array 'a', return the suffix sum in the same array without creating a new array.
     * 
     * Ex: a = {2, 5, 6, 1, 3}
     * Output: {17, 15, 10, 4, 3}
     * 
     * Observation:
     * 1. suffix[n] = an
     * 2. suffix[n-1] = suffix[n]+a[n-1]
     * 3. suffix[n-2] = suffix[n-1]+a[n-2]
     * 4. suffix[n-3] = suffix[n-2]+a[n-3] ...
     * 
     * Approach: 
     * 1. Traverse the given array from n-1 to 0.
     * 2. At index i, add the elements of the given array at index a[i+1] and a[i] and store at a[i].
     */
    static void printArray(int[] a){
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    static void makesuffixSum(int[] a){
        int n = a.length;

        for(int i=n-2; i>=0; i--){
            a[i] += a[i+1]; 
        }

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
        
        System.out.println("Original Array: ");
        printArray(a);

        makesuffixSum(a);
        System.out.println("Calculated suffix sum array: ");
        printArray(a);      
    }
}
