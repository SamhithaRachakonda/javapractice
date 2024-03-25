package ArraysCoding.Basic;

import java.util.Scanner;

public class ArrayManipulation {
    /*
     * Problem Statement:
     * Find the unique number in a given array where all the elements are being repeated twice with one value being unique.
     * 
     * Ex: arr = {1, 2, 3, 4, 2, 1, 3}
     * 4 is the unique number of this array, since it is not repeating.
     */

     static int findUnique(int[] a){
        int n = a.length;
        int result = -1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i] == a[j] && a[i] != -1 && a[j] != -1){
                    a[i] = -1;
                    a[j] = -1;
                }
            }
        }

        for(int i=0; i<n; i++){
            if(a[i] > 0)
                result = a[i];
        }
        return result;
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

        System.out.println("Unique Element: "+ findUnique(a));     
    }
}
