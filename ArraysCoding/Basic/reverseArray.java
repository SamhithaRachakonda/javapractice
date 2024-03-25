package ArraysCoding.Basic;

import java.util.Scanner;

public class reverseArray {
    /*
     * Problem Statement:
     * Reverse an array consisting of integer values
     * 
     * Ex: arr = {1, 2, 3, 4, 5, 6}
     * Output: {6, 5, 4, 3, 2, 1}
     */
    static void printArray(int[] a){
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    
    static int[] ReverseArray(int[] a){
        int n = a.length;
        int[] revA = new int[n];
        int j=0;
        // Traverse original array in reverse direction
        for(int i=n-1; i>=0; i--){
            revA[j++] = a[i];
        }
        /*
         * Can use while loop for doing the same above operation:
         * int i = n-1, j=0;
         * while(i>=0){
         *      revA[j++] = a[i--];
         * }
         */
        return revA;
    }

    static void swapInArray(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void ReverseArrayInplace(int[] a, int i, int j){
        // int i = 0, j = a.length-1;

        while(i<j){
            swapInArray(a, i, j);
            i++;
            j--;
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
        
        int[] revArray =  ReverseArray(a);      
        System.out.println("The reverse array of the given array: ");    
        printArray(revArray);

        // Inplace reverse array - Reverse the given array without using another initialized array of same length. (don't use new memory or extra space).
        ReverseArrayInplace(a, 0, n-1); // Providing index range to reverse the array
        System.out.println("The inplace reverse array of the given array: ");    
        printArray(a);
    }
}
