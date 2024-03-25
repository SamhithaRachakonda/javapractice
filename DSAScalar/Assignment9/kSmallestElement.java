package DSAScalar.Assignment9;

import java.util.ArrayList;
import java.util.Scanner;

public class kSmallestElement {
    /*
     * Q4. Kth Smallest Element
     * 
     * Problem Description:
     * Find the Bth smallest element in given array A .
     * NOTE: Users should try to solve it in less than equal to B swaps.
     * 
     * Approach: As provided in the question that <= B swaps required for getting Bth smallest element, Selection sort algorithm can be used.
     * As Selection sort algorithm, for every iteration pick the smallest element and then swap.
     * B swaps required to get Bth smallest element in the array.
     * 
     * Problem Constraints
     * 1 <= |A| <= 100000
     * 1 <= B <= min(|A|, 500)
     * 1 <= A[i] <= 10^9
     * 
     * Input 1:  A = [2, 1, 4, 3, 2], B = 3     Output: 2
     * Explanation: 3rd element after sorting is 2.
     * 
     */
    static int Bthsmallest(ArrayList<Integer> A, int B){
        int N = A.size();
        int min_index = 0;
        int temp;

        for(int i=0; i<B; i++){ // After B swaps, get the required element, no need to run till the end of the array.
            min_index = i;
            for(int j=i+1; j<N; j++){  // Getting the ith smallest element using inner loop
                if(A.get(j) < A.get(min_index))
                    min_index = j;
            }
            if(i != min_index){// swap after finding the ith smallest element
                temp = A.get(i);
                A.set(i, A.get(min_index));
                A.set(min_index, temp);
            }
        }

        return A.get(B-1);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Integer> A = new ArrayList<>();

        for(int i=0; i<N; i++)
            A.add(scan.nextInt());
        int B = scan.nextInt();
        scan.close();

        int Bthsmallestelement = Bthsmallest(A, B);
        System.out.println("After "+B+" swaps, the smallest element is: " + Bthsmallestelement);
    }
}
