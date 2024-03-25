package ArraysCoding.Basic;

import java.util.Scanner;

public class SecondLargest {
    /*
     * Problem Statement:
     * Find the second largest number in a given array.
     * 
     * Ex: arr = {1, 2, 3, 4, 5, 6}
     * 5 is the second largest number of this array.
     */
    static int maxNum(int[] a){
        int n = a.length;
        int max_num = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(max_num < a[i])
                max_num = a[i];
        }

        return max_num;
    }
    
    static int secMax(int[] a){
        int n = a.length;
        int max_num = maxNum(a);
        int sec_num = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(sec_num < a[i] && a[i] != max_num)
                sec_num = a[i];
        }
        return sec_num;
    }

    static int secLargest(int[] a){
        int n = a.length;
        // int max_num = Integer.MIN_VALUE;
        // for(int i=0; i<n; i++){
        //     if(max_num < a[i])
        //         max_num = a[i];
        // }
        int max_num = maxNum(a);

        for(int i=0; i<n; i++){
            if(a[i] == max_num)
                a[i] = Integer.MIN_VALUE;
        }

        // int sec_max = Integer.MIN_VALUE;
        // for(int i=0; i<n; i++){
        //     if(sec_max < a[i])
        //         sec_max = a[i];
        // }

        int sec_max = maxNum(a);
        return sec_max;
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

        // System.out.println("The second largest element of an array: "+ secMax(a)); 
        System.out.println("The second largest element of an array: "+ secLargest(a));    
    }
    
}
