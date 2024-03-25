package DSAScalar.IntermediateDSA.Assignment9;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {
    /*
     * Insertion Sort: Selecting an element from unsorted part of the array and inserting it in the correct place in the sorted part of the array.
     * NOTE: Always assume i=0 is the sorted part of the array, so iteration starts at i=1 and compares with the previous values.
     * 
     * Example:
     * Input: ar = {10, 4, 8, 7, 9}
     * Assume 10 is in sorted part of the array and start iteration from i=1.
     * 
     * i=1: ar = {10, 4, 8, 7, 9}
     * Compare ar[0] element with ar[1], swap if ar[1] is smaller than ar[0] (4<10 => swap).
     * 
     * i=2: ar = {4, 10, 8, 7, 9}   : Now, 4, 10 is the sorted part of the array.
     * Compare ar[2] with sorted elements ar[1] and ar[0] and place ar[2] in correct place.
     * (4<8<10 => swap 10,8 and break the loop).
     * 
     * i=3: ar = {4, 8, 10, 7, 9}   : Now, 4, 8, 10 is the sorted part of the array.
     * Compare ar[3] with sorted elements ar[2], ar[1] and ar[0] and place ar[3] in correct place.
     * (4<7<8<10 => swap 10,7 and 8,7 and break the loop).
     * 
     * i=3: ar = {4, 7, 8, 10, 9}   : Now, 4, 7, 8, 10 is the sorted part of the array.
     * Compare the last element with sorted part of the array and place ar[4] in correct place.
     * (4<7<8<9<10 => swap 10,9 and break the loop).
     * 
     * i moved out of the loop and the array is SORTED.
     * 
     * Time Complexity for above algorithm: O(N^2).
     * Space Complexity is O(1), since it is an inplace algorithm. 
     * 
     * Insertion Sort is an INPLACE sorting algorithm.
     * 
     * Insertion sort on already sorted array - Best case scenario: Time Complexity: O(N).
     * Since, for already sorted array, for each iteration 'i', the inner loop condition always executes break loop, so T.C: O(N).
     * 
     * Insertion sort is stable algorithm.
     * A stable algorithm is an algo where, the duplicate element index is not exchanged with the first occurrence of that element in the array.
     * Ex - {5, 6, 4, 4*}
     * After applying insertion sort: Output={4, 4*, 5, 6} 
     *  => 4* position is always after 4 element position. So, insertion sort is STABLE algo.
     */
    static void insertionSort1(ArrayList<Integer> A){
        int N = A.size();
        int temp;

        for(int i=1; i<N; i++){ 
            // Selecting first element 'i' from unsorted array at every iteration.
            for(int j=i-1; j>=0; j--){ 
                // Checking 'i' with every element in sorted part of the array.
                if(A.get(j) > A.get(j+1)){
                    // Swapping to get the unsorted element to the correct position in sorted part of the array.
                    temp = A.get(j);
                    A.set(j, A.get(j+1));
                    A.set(j+1, temp);
                } else{
                    // If element reached the correct position i.e, A.get(j) became less than  A.get(j+1), break the loop as no more comparisions needed.
                    break;
                }
            }
        }
    }

    static void insertionSort2(ArrayList<Integer> A){
        // This Algo: After making some changes to prev. method.
        int N = A.size();
        int current = A.get(0);
        
        for(int i=1; i<N; i++){
            current = A.get(i);
            int j = i-1;
            for(j=i-1; j>=0; j--){
                if(A.get(j) > current){
                    // Shifting the greater element one position to the right to make place to the current element to get its right position.
                    A.set(j+1, A.get(j));
                } else{
                    // If current value correct position is reached, break the loop.
                    break;
                }
            }
            // placing the current element from unsorted array at correct position in sorted part of the array.
            A.set(j+1, current);
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

        // insertionSort1(A);
        // System.out.println("After sorting with insertion sort algo1: "+ A);

        insertionSort2(A); // This method instead of swapping, moves every element to the right side by one position and if the element correct position is reached, it places the current element in required position.
        System.out.println("After sorting with insertion sort algo2: " +A);
    }
}
