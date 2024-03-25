package DSAScalar.Assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class subarray {
    /*
     * Q4. Subarray in given range
     * Problem Description
     * Given an array A of length N, return the subarray from B to C.
     * 
     * Problem Constraints
     * 1 <= N <= 10^5
     * 1 <= A[i] <= 10^9
     * 0 <= B <= C < N
     * 
     * Ex1: A = [4, 3, 2, 6], B=1, C=3      => Output: [3, 2, 6]
     * Ex2: A = [4, 2, 2], B=0, C=1         => Output: [4, 2]
     *
     */
    
    static ArrayList<Integer> subarrayInRange(ArrayList<Integer> A, int B, int C){
        ArrayList<Integer> subarray = new ArrayList<>();

        for(int i=B; i<=C; i++){
            subarray.add(A.get(i));
        }
        return subarray;
    }
    

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size for input array:");
        int N = scan.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<N; i++){
            A.add(scan.nextInt());
        }
        System.out.println("Mention subarray range: B & C");
        int B = scan.nextInt();
        int C = scan.nextInt();
        scan.close();

        System.out.println("Input Array: "+ A);
        ArrayList<Integer> subarrayInRange = subarrayInRange(A, B, C);
        System.out.println(subarrayInRange);
    }
}
