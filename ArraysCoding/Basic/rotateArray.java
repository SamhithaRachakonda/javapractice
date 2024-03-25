package ArraysCoding.Basic;

import java.util.Scanner;

public class rotateArray {
     /*
     * Problem Statement:
     * Rotate the given array 'a' by 'k' times, where k is non-negative.
     * Note: k can be greater than n as well, where 'n' is the length of the array.
     * 
     * Ex: a = {1, 2, 3, 4, 5}
     * Output:
     * If k=1, 6, 11 ...: then, a = {5, 1, 2, 3, 4} => this array occurs when: k = k%n = 1
     *    k=2, 7, 12 ...: then, a = {4, 5, 1, 2, 3} => k = k%n = 2 rotation
     *    k=3, 8, 13 ...: then, a = {3, 4, 5, 1, 2} => k = k%n = 3 rotation
     *    k=4, 9, 14 ...: then, a = {2, 3, 4, 5, 1} => k = k%n = 4 rotation
     *    k=5, 10,15 ...: then, a = {1, 2, 3, 4, 5} - Given array => k = k%n = 0
     * 
     * Shifting Approach:
     * 1. (n-k) to (n-1) indexes store in a temp array.
     * 2. 0 to (n-k-1) indexes shift to last for the given array.
     * 3. Copy temp array to given array 0 to (n-k) indexes. 
     * 
     * Reverse Approach:
     *  1. Reverse 0 to n-k-1 indeces
     *  2. Reverse n-k to n-1 indeces
     *  3. Reverse the whole array after 1, 2 steps
     */
    static void printArray(int[] a){
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    // Shifting Approach
    static int[] RotateArray(int[] a, int k){
        int n = a.length;
        k = k % n;
        int[] resultArray = new int[n];
        int j = 0;
        
        // 1. (n-k) to (n-1) indexes store at the beginning in final array.
        for(int i=n-k; i<n; i++)
            resultArray[j++] = a[i];

        // 2. 0 to (n-k-1) indexes stored at the last of final array.
        for(int i=0; i<n-k; i++)
            resultArray[j++] = a[i];
        
        return resultArray;
    }

    static void swapInArray(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void reverseArray(int[] a, int i, int j){
        while(i < j){
            swapInArray(a, i, j);
            i++; 
            j--;
        }
    }
    // Reverse Approach
    static void RotateArrayInplace(int[] a, int k){
        int n = a.length;
        k = k % n;

        reverseArray(a, 0, n-k-1);
        reverseArray(a, n-k, n-1);
        reverseArray(a, 0, n-1);
        // Above reversing or below reversing gives the same output.
        // reverseArray(a, 0, n-1);
        // reverseArray(a, 0, k-1);
        // reverseArray(a, k, n-1);
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
        System.out.println("Enter the number of times the array to be rotated:");
        int k = scan.nextInt();
        scan.close();

        System.out.println("Original Array:");
        printArray(a);
        
        int[] ans = RotateArray(a, k);
        System.out.println("Array after 'k' rotations:");
        printArray(ans);       

        RotateArrayInplace(a, k);
        System.out.println("Array after 'k' rotations (inplace method):");
        printArray(a);
    }
}