package DSAScalar.IntermediateDSA.Assignment9;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {
    /*
     * Bubble Sort: Traverse through the loop and check for largest between 2 numbers and swap if largest element is at front.
     * 
     * Example:
     * i=0: ar = {7, 8, 3, 1, 2}
     *      j=0: checks (7,8), since 7<8, no swaps
     *      j=1: checks (8,3), since 8>3, swap 8,3 --> ar = {7, 3, 8, 1, 2}
     *      j=2: checks (8,1), since 8>1, swap 8,1 --> ar = {7, 3, 1, 8, 2}
     *      j=3: checks (8,2), since 8>2, swap 8,2 --> ar = {7, 3, 1, 2, 8}
     *          At the completion of 'j' for loop for i=0, Largest element added at last index.
     * 
     * i=1: ar = {7, 3, 1, 2, 8}
     *      j=0: checks (7,3), since 7>3, swap 7,3 --> ar = {3, 7, 1, 2, 8}
     *      j=1: checks (7,1), since 7>1, swap 7,1 --> ar = {3, 1, 7, 2, 8}
     *      j=2: checks (7,2), since 7>2, swap 7,2 --> ar = {3, 1, 2, 7, 8}
     *      j=3: checks (7,8), since 7<8, no swap  --> ar = {3, 1, 2, 7, 8}
     *          At the completion of 'j' loop for i=1, 2nd largest element added at 2nd last index.
     * 
     * i=2: ar = {3, 1, 2, 7, 8}
     *      j=0: checks (3,1), since 3>1, swap 3,1 --> ar = {1, 3, 2, 7, 8}
     *      j=1: checks (3,2), since 3>2, swap 3,2 --> ar = {1, 2, 3, 7, 8}
     *      j=2: checks (3,7), since 3<7, no swap  --> ar = {1, 2, 3, 7, 8}
     *      j=3: checks (7,8), since 7<8, no swap  --> ar = {1, 2, 3, 7, 8}
     *          At the completion of 'j' loop for i=2, 3rd largest element added at 3rd last index.
     * 
     * i=3: ar = {1, 2, 3, 7, 8}
     *      j=0: checks (1,2), since 1<2, no swap  --> ar = {1, 2, 3, 7, 8}
     *      j=1: checks (2,3), since 2<3, no swap  --> ar = {1, 2, 3, 7, 8}
     *      j=2: checks (3,7), since 3<7, no swap  --> ar = {1, 2, 3, 7, 8}
     *      j=3: checks (7,8), since 7<8, no swap  --> ar = {1, 2, 3, 7, 8}
     *          At the completion of 'j' loop for last 'i' iteration, smallest number is added at the first index.
     * 
     * To remove extra iterations, when swapping is completed in the middle of iterations, use a boolean flag as shown in the code.
     * 
     * Time Complexity for above algorithm: O(N^2).
     * Space Complexity is O(1), since it is an inplace algorithm. 
     * 
     * Bubble Sort is an INPLACE sorting algorithm.
     * 
     * Bubble sort on already sorted array - Best case scenario: Time Complexity: O(N).
     * Since, for already sorted array, the loop traverse once to check if swapping is needed, if not needed, it returns. Since, traversing only once, O(N) Time complexity.
     * 
     * Bubble sort is STABLE algorithm.
     * A stable algorithm is an algo where, the duplicate element index is not exchanged with the first occurrence of that element in the array.
     * Ex - {4, 10, 4*, 2}
     * i=0: {4, 4*, 2, 10}
     * i=1: {4, 2, 4*, 10}
     * i=2: {2, 4, 4*, 10}
     * After applying bubble sort: Output={2, 4, 4*, 10} 
     *  => 4* position is not exchanged. => Stable algo.
     */
    
    static void bubbleSort(ArrayList<Integer> A){
        int N = A.size();
        int temp;
        boolean flag = false;

        // Time complexity = O(n^2) as nested loops
        // Space complexity = O(1) - no extra space of variable 'n' is used
        for(int i=0; i<N-1; i++){  
            // loop runs n-1 times
            flag = false;
            for(int j=0; j<N-i-1; j++){
                // loop runs n-i-1 times
                if (A.get(j) > A.get(j+1)) {
                    // swapping at every large number occured in a single iteration.
                    //      => At the end of 1 iteration and many swaps, largest number stored at the end.
                    temp = A.get(j);
                    A.set(j, A.get(j+1));
                    A.set(j+1, temp); 
                    flag = true;   
                }
            }
            if(!flag)
                return;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Integer> A = new ArrayList<>();

        for(int i=0; i<N; i++)
            A.add(scan.nextInt());
        
        scan.close();

        System.out.println("Before sorting: "+ A);
        bubbleSort(A);
        System.out.println("After sorting with bubble sort algo: " +A);
    }
}
