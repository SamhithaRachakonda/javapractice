package ArraysCoding.Basic;

import java.util.Scanner;

public class QueriesCheckNum {
    /*
     * Problem Statement:
     * Given Q queries, check if the given number is present in the array or not.
     * Note: Value of all the elements in the array is less than 10^5.
     * 
     * Ex: arr = {5, 6, 5, 400, 560, 1000, 400}, Q=5
     * 5 -> YES, 34 -> NO, 400 -> YES, 10000 -> NO, 560 -> YES
     * 
     * Steps:
     * 1. freqArray[10^5 + 1] - Initialize a frequency array of size 10^5 + 1 with all zeros
     * 2. Traverse the given array, and get the value of the given array and replace the value of the frequency array to 1 at which the index of frequency array is equal to the value of the given array. 
     * 3. Based on the query, go to the index of the frequency array and get the result.
     */
    
    static int[] makefrequencyArray(int[] a){
        int[] freq = new int[100005];

        for(int i=0; i<a.length; i++)
            freq[a[i]]++;

        return freq;
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

        System.out.println("Enter number of queries: ");
        int q = scan.nextInt();

        int[] freq = makefrequencyArray(a);
        
        while(q > 0){
            System.out.println("Enter the query to be searched: ");
            int x = scan.nextInt();
            if(freq[x] > 0)
                System.out.println("YES");
            else
                System.out.println("NO");
            q--;
        }

        scan.close();
    }
}
