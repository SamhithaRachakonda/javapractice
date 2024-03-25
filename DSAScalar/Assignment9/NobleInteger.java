package DSAScalar.Assignment9;

import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger {
    /*
     * Q2. Noble Integer
     * 
     * Problem Description:
     * Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.
     * 
     * Problem Constraints:
     * 0 <= N <= 2*10^5
     * -10^8 <= A[i] <= 10^8
     * 
     * Output Format:
     * Return 1 if any such integer p is present else, return -1.
     * 
     * Ex -  A = [3, 2, 1, 3], Output: 1
     * Explanation: For integer 2, there are 2 greater elements in the array.
     * 
     * Ex -  A = [1, 1, 3, 3] Output: -1
     * Explanation: There exist no integer satisfying the required conditions.
     */
    public static int findNobleInteger(ArrayList<Integer> A) {
        int N = A.size();
        // Sorting the elements in descending order
        Collections.sort(A, Collections.reverseOrder());
        /*
         * After sorting the elements in descending order, the number of elements greater than  A[i] in given by the index 'i'.
         * Since the condition states noble integer as the element which has the number of elements in the array greater than A[i] is equal to the value A[i].
         * If we check, i == A[i], it gives a noble integer.
         * Exception: Need to exclude repetitive elements in the array with 'if' condition in logic, as an element might not be noble, but if repetitive number equals the value of 'i' as per the logic determined, it shows the element as noble, eventhough it isn't. 
         */

        for(int i=0; i<N; i++){
            if((i==0 || A.get(i)!=A.get(i-1)) && i==A.get(i)){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<>();

        int[] a = {-4,7,5,3,5,-4,2,-1,-9,-8,-3,0,9,-7,-4,-10,-4,2,6,1,-2,-3,-1,-8,0,-8,-7,-3,5,-1,-8,-8,8,-1,-3,3,6,1,-8,-1,3,-9,9,-6,7,8,-6,5,0,3,-4,1,-10,6,3,-8,0,6,-9,-5,-5,-6,-3,6,-5,-4,-1,3,7,-6,5,-8,-5,4,-3,4,-6,-7,0,-3};
        int N = a.length;

        for(int i=0; i<N; i++){
            A.add(a[i]);
        }

        int ans = findNobleInteger(A);
        System.out.println(ans);
    }
}
