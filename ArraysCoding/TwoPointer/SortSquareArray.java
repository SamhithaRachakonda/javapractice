package ArraysCoding.TwoPointer;

import java.util.Scanner;

public class SortSquareArray {
     /*
     * Problem Statement:
     * Given an integer array 'a' sorted in NON-DECREASING ORDER, return an array of the squares of each number sorted in non-decreasing order.
     * 
     * Non-decreasing order => The array can have repititive numbers, so the array is either increasing or equal.
     * 
     * Ex: a = {2, 4, 6, 7, 10}
     * Output: {4, 16, 36, 49, 100} => JUST TAKING SQUARE OF EACH NUMBER, THE SQUARED ARRAY CAN BE IN NON-DECREASING ORDER, only for positive numbers.
     * 
     * For NEGATIVE numbers, need to sort the array.
     * Ex: a = {-10, -3, -2, 1, 4, 5}
     * Output of just squared numbers: {100, 9, 4, 1, 16, 25} => NOT in non-decreasing order.
     * Output REQUIRED: {1, 4, 9, 16, 25, 100}
     * 
     * Approach: 
     * 1. Compare first index absolute value(a0) and last index absolute value(an-1) [We are comparing this way becoz, the array is given in non-decreasing order. => After squaring, either a0 is largest or an-1 is largest].
     * 2. If a0 > an: compute a0*a0 and store it in answer array at last index i.e, at n-1 since we need non-decreasing array and increment the left pointer by 1.
     * 3. If an > a0: compute an*an and store it in answer array at last index and decrement the right pointer by 1.
     */

    static void printArray(int[] a){
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    static int[] sortSquaresTwoPointer(int[] a){
        int n = a.length;
        int left = 0, right = n-1;
        int k = n-1;
        int[] nonDecreasingSquaredArray = new int[n];

        while(left <= right){
            if(Math.abs(a[left]) > Math.abs(a[right])){
                nonDecreasingSquaredArray[k--] = a[left] * a[left];
                left++;
            } else{
                nonDecreasingSquaredArray[k--] = a[right] * a[right];
                right--;
            }
        }
        return nonDecreasingSquaredArray;
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

        int[] result = sortSquaresTwoPointer(a);
        System.out.println("Sorted non-decreasing array of squared numbers using two pointers: ");
        printArray(result);      
    }
}
