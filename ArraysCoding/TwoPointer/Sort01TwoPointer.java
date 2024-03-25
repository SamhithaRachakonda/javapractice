package ArraysCoding.TwoPointer;

import java.util.Scanner;

public class Sort01TwoPointer {
     /*
     * Problem Statement:
     * Sort an array consisting of only 0's and 1's.
     * 
     * Ex: arr = {1, 0, 0, 1, 0, 1, 1, 0, 0}
     * Output: {0, 0, 0, 0, 0, 1, 1, 1, 1}
     * 
     * Approach: 
     * 1. Count the number of zeros, place them in the array starting from index 0.
     * 2. Remaining length fill them with 1. 
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

    static void sortZeroesAndOnesTwoPointer(int[] a){
        int n = a.length;
        int left = 0, right = n-1;

        while(left < right){
            if(a[left] == 1 && a[right] == 0){
                swap01(a, left, right);
                left++;
                right--;
            } else if(a[left] == 0)
                left++;
            else if(a[right] == 1)
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

        sortZeroesAndOnesTwoPointer(a);
        System.out.println("Sorted array of zeroes and ones using two pointers: ");
        printArray(a);      
    }
}
