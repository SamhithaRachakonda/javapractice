package ArraysCoding.Basic;

import java.util.Scanner;

public class SecondSmallest {
    /*
     * Problem Statement:
     * Find the second smallest number in a given array.
     * 
     * Ex: arr = {1, 2, 3, 4, 5, 6}
     * 2 is the second smallest number of this array.
     */
    static int minNum(int[] a){
        int n = a.length;
        int min_num = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(min_num > a[i])
                min_num = a[i];
        }
        return min_num;
    }

    static int secSmallest(int[] a){
        int n = a.length;
        int min_num = minNum(a);

        for(int i=0; i<n; i++){
            if(a[i] == min_num)
                a[i] = Integer.MAX_VALUE;
        }

        int sec_min = minNum(a);
        return sec_min;
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
 
        System.out.println("The second smallest element of this array: "+ secSmallest(a));    
    }
}
