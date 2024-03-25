package ArraysCoding.TwoPointer;

import java.util.Scanner;

public class SortEvenOdd {
     /*
     * Problem Statement:
     * Given an array of integers 'a', move all the even integers at the beginning of the array followed by all the odd integers. The relative order of odd or even integers does not matter. Return any array that satisfies the condition.
     * 
     * Ex: arr = {1, 2, 3, 4, 5, 6, 7}
     * Output can be any of the following: 
     * {2, 4, 6, 1, 3, 5, 7}
     * {4, 6, 2, 3, 1, 7, 5} .... many possibilities.
     *      => Relative order does not matter in between even numbers or in between odd numbers.
     * 
     * Approach: 
     * 1. Take two pointers left and right. 
     * 2. Left starting from zero and right starting from n-1.
     * 3. while left < right:
     *      a. swap if left = odd && right = even
     *      b. Increment left by 1 if left is even
     *      c. Decrement right by 1 if right is odd
     */
    static void printArray(int[] a){
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    static void swap01(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void sortEvenAndOddTwoPointer(int[] a){
        int n = a.length;
        int left = 0, right = n-1;

        while(left < right){
            if(a[left]%2 == 1 && a[right]%2 == 0){
                swap01(a, left, right);
                left++;
                right--;
            } else if(a[left]%2 == 0)
                left++;
            else if(a[right]%2 == 1)
                right--;
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

        sortEvenAndOddTwoPointer(a);  // Sort array by parity: Even parity and Odd parity
        System.out.println("Sorted array of even and odd using two pointers: ");
        printArray(a);      
    }
}
