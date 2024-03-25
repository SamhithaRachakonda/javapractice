package ArraysCoding.Basic;

import java.util.Scanner;

public class LastRepeatingNumber {
    /*
     * Problem Statement:
     * Given an array 'a' consisting of integers.
     * Return the last value that is repeating in that array. If no value is being repeated, return -1.
     * 
     * Ex-1: a = {1, 5, 3, 4, 6, 3, 4}
     * 3 is the last value that is repeating in this array.
     * Ex-2: a = {1, 2, 4, 6, 7}
     * -1 => Since no value is repeating.
     */

    static int lastRepeatNumber(int[] a){
        int n = a.length;

        for(int i=n-1; i>=0; i--){
            for(int j=i-1; j>0; j--){
                if(a[i] == a[j])
                    return a[j];  
            }
        }
        return -1;
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

        System.out.println("The last value that is repeating in given array: "+ lastRepeatNumber(a));     
    }
}
