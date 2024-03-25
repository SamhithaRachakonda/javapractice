package DSAScalar.IntermediateDSA.Assignment9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class APSorting {
    /*
     * Q1. Arithmetic Progression?
     * 
     * Problem Description:
     * Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.
     * A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
     * 
     * Problem Constraints
     * 2 <= N <= 10^5
     * -10^9 <= A[i] <= 10^9
     * 
     * Output Format
     * Return 1 if the array can be rearranged to form an arithmetic progression, otherwise return 0.
     * 
     * Ex 1: A = [3, 5, 1]         Output: 1
     * Explanation 1:
     * We can reorder the elements as [1, 3, 5] or [5, 3, 1] with differences 2 and -2 respectively, between each consecutive elements.
     * 
     * Ex 2:  A = [2, 4, 1]        Output: 0
     * Explanation 2:
     * There is no way to reorder the elements to obtain an arithmetic progression.
     */
    static int APcheck(ArrayList<Integer> A){
        int N = A.size();
        // Sorting the data 
        Collections.sort(A);

        int d = A.get(1) - A.get(0);
        int diff;
        // Check the difference between every 2 elements
        for(int i=1; i<N-1; i++){
            diff = A.get(i+1) - A.get(i);
            if(diff != d)
                return 0;
        }
        
        return 1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Integer> A = new ArrayList<>();

        for(int i=0; i<N; i++)
            A.add(scan.nextInt());
        
        scan.close();

        int APcheck = APcheck(A);
        System.out.println("The given array Ap or not: " + APcheck);
    }
}
