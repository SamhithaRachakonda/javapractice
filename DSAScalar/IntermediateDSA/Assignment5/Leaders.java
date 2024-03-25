package DSAScalar.IntermediateDSA.Assignment5;

import java.util.ArrayList;
import java.util.Scanner;

public class Leaders {
    /*
     * Q2. Leaders in an array
     * Problem Description
     * Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.
     * NOTE: The rightmost element is always a leader.
     * 
     * Problem Constraints
     * 1 <= N <= 10^5
     * 1 <= A[i] <= 10^8
     * 
     * Ex1: A = [16, 17, 4, 3, 5, 2]        => Output: [17, 2, 5]
     * Explanation: 
     * Element 17 is strictly greater than all the elements on the right side to it.
     * Element 2 is strictly greater than all the elements on the right side to it.
     *  Element 5 is strictly greater than all the elements on the right side to it.
     *  So we will return these three elements i.e [17, 2, 5], we can also return [2, 5, 17] or [5, 2, 17] or any other ordering.
     * Ex2: A = [5, 4]                      => Output: [5, 4]
     * Explanation: 
     * Element 5 is strictly greater than all the elements on the right side to it.
     * Element 4 is strictly greater than all the elements on the right side to it.
     * So we will return these two elements i.e [5, 4], we can also any other ordering.
     */
    
    
    static ArrayList<Integer> LeaderInArray(ArrayList<Integer> A, int N){
        ArrayList<Integer> Leader = new ArrayList<>();
        int curr_leader = A.get(N-1);
        Leader.add(curr_leader);

        for(int i=N-2; i>=0; i--){
            if(A.get(i) > curr_leader){
                curr_leader = A.get(i);
                Leader.add(curr_leader);
            }
        }

        return Leader;
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
        ArrayList<Integer> Leader = LeaderInArray(A, N);
        System.out.println(Leader);
    }
}
