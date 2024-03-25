package DSAScalar.IntermediateDSA.Assignment9;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSort {
    /*
     * Selection Sort: Pick the smallest element and swap it with front element for every iteration.
     * 
     * Example:
     * i=0: ar = {5, 6, 4, 2}: Pick smallest element (2) and swap it with first element (5).
     * i=1: ar = {2, 6, 4, 5}:Pick next smallest element (4) and swap it with second element (6)
     * i=2: ar = {2, 4, 6, 5}:Pick next smallest element (5) and swap it with third element (6)
     * i=3: ar = {2, 4, 5, 6}:Once i is on last element, ALL THE ELEMENTS ARE SORTED.
     * 
     * Time Complexity for above algorithm: O(N^2).
     * Space Complexity is O(1), since it is an inplace algorithm. 
     * 
     * Selection Sort is an INPLACE sorting algorithm.
     * 
     * Selection sort on already sorted array - Best case scenario: Time Complexity: O(N^2).
     * Since, even for already sorted array, for each iteration 'i', it runs ~N iterations of 'j' to find the min_index, even if swapping doesn't happen.
     * 
     * Selection sort is NOT stable algorithm.
     * A stable algorithm is an algo where, the duplicate element index is not exchanged with the first occurrence of that element in the array.
     * Ex - {4, 10, 4*, 2}
     * i=0: {2, 10, 4*, 4}
     * i=1: {2, 4*, 10, 4}
     * i=2: {2, 4*, 4, 10}
     * After applying selection sort: Output={2, 4*, 4, 10} 
     *  => 4* position is exchanged and came before 4 element position. => NOT Stable algo.
     */
    
    static void selectionSort(ArrayList<Integer> A){
        int N = A.size();
        int min_index;
        int temp;

        // When 'i' reaches 'N-1', the array is already sorted. So, no need to include last index.
        //'i'th element swapping with smallest found element.
        for(int i=0; i<N-1; i++){
            min_index = i;
            for(int j=i+1; j<N; j++){ // 'j' for finding the smallest element index
                if(A.get(j) < A.get(min_index))
                    min_index = j;
            }
            // swapping min_index with ith element
            if(i != min_index){ // If smallest element is at i, swapping is not needed.
                temp = A.get(i);
                A.set(i, A.get(min_index));
                A.set(min_index, temp);
            }
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
        selectionSort(A);
        System.out.println("After sorting with selection sort algo: " +A);
    }
}
