package DSAScalar.Assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class AllSubarray {
    /*
     * Q5. Generate all subarrays
     * Problem Description
     * You are given an array A of N integers.
     * Return a 2D array consisting of all the subarrays of the array
     *
     * Note : The order of the subarrays in the resulting 2D array does not matter.
     * 
     * Problem Constraints
     * 1 <= N <= 100
     * 1 <= A[i] <= 10^5
     * 
     * Ex1: [1, 2, 3]
     *  Output: [[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]
     * Ex2: A = [5, 2, 1, 4]        
     *  Output: [[1 ], [1 4 ], [2 ], [2 1 ], [2 1 4 ], [4 ], [5 ], [5 2 ], [5 2 1 ], [5 2 1 4 ] ]
     *
     */
    
    static ArrayList<ArrayList<Integer>> Allsubarray(ArrayList<Integer> A){
        ArrayList<ArrayList<Integer>> subarray = new ArrayList<ArrayList<Integer>>();
        int N = A.size();

        for(int s=0; s<N; s++){
            for(int e=s; e<N; e++){
                ArrayList<Integer> b0 = new ArrayList<>();
                subarray.add(b0); 
                for(int i=s; i<=e; i++){
                    b0.add(A.get(i));
                }
            }
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
        scan.close();

        System.out.println("Input Array: "+ A);
        ArrayList<ArrayList<Integer>> allsubarray = Allsubarray(A);
        System.out.println(allsubarray);
    }
}
