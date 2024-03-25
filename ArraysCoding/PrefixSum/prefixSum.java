package ArraysCoding.PrefixSum;

import java.util.Scanner;

public class prefixSum {
    /*
     * Problem Statement:
     * Given an integer array 'a', return the prefix sum or running sum in the same array without creating a new array.
     * 
     * Prefix Sum: Adding the elements of the array, till the required index.
     * Ex - Prefix sum of index 2 => Sum of elements of index ranging from 0 to 2 and store it at 2nd index of the given array.
     * 
     * Ex: a = {2, 1, 3, 4, 5}
     * Output: {2, 3, 6, 10, 15}
     * 
     * Observation:
     * 1. prefix[0] = a0
     * 2. prefix[1] = a0+a1
     * 3. prefix[2] = prefix[1]+a2
     * 4. prefix[3] = prefix[2]+a3 ...
     * 
     * Approach: 
     * 1. Traverse the given array from 1 to n-1.
     * 2. At index i, add the elements of the given array at index a[i-1] and a[i] and store at a[i].
     */
    static void printArray(int[] a){
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    static void makeprefixSum(int[] a){
        int n = a.length;

        for(int i=1; i<n; i++){
            a[i] += a[i-1]; // a[i] is updated as prefix sum of a[i] using the sum of a[i-1] and a[i], where a[i-1] is the updated sum of indeces ranging from 0 to i-1.
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

        makeprefixSum(a);
        System.out.println("Calculated prefix sum array: ");
        printArray(a);      
    }
}
