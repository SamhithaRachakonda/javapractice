package ArraysCoding.TwoPointer;

import java.util.Scanner;

public class Sort01 {
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

    static void sortZeroesAndOnes(int[] a){
        int n = a.length;
        int zeroes = 0;  
        // count the number of zeroes
        for(int i=0; i<n; i++){
            if(a[i] == 0)
                zeroes++;
        }

        // set 0 to zeroes-1 : value=0 and zeroes to n-1 : value=1
        for(int i=0; i<n; i++){
            if(i<zeroes)
                a[i] = 0;
            else    
                a[i] = 1;
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

        sortZeroesAndOnes(a);
        System.out.println("Sorted array of zeroes and ones: ");
        printArray(a);      
    }
}
