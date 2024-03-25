package DSAScalar.IntermediateDSA.Assignment9;

import java.util.ArrayList;
import java.util.Collections;

public class NobleRepetitive {
    /*
     * Problem Description:
     * Given an array of non-distinct elements of size 'N'.
     * Find the count of noble integers.
     * NOTE: a[i] is noble, if the count of elements strictly smaller than a[i] is equal to the value of the element present at a[i].
     * 
     * Ex: {-3, 0, 2, 2, 5, 5, 5, 5, 8, 8, 10, 10, 10, 14}
     * Output: 2, 2, 8, 8, 10, 10, 10 are the noble integers based on the definition provided.
     */
    static int BruteforcecountNobleIntegers(ArrayList<Integer> A){
        int N = A.size();
        int count = 0, ans = 0;

        // Time Complexity: O(N^2) as it is nested loop.
        // Space Complexity: O(1) as no extra space of variable N is used.
        for(int i=0; i<N; i++){
            count = 0;
            for(int j=0; j<N; j++){
                if(A.get(j) < A.get(i))
                    count++;
            }
            if(count == A.get(i))
                ans++;
        }
        
        return ans;
    }

    static int countNobleIntegers(ArrayList<Integer> A){
        int N = A.size();
        Collections.sort(A);
        System.out.println(A);
        int count = 0, j;

        // Time Complexity: O(NlogN + N) = O(NlogN)
        // NlogN - for sorting array, N - for traversing the array to get count.
        // Space Complexity: O(N) as Collections.sort() method might take extra space to get sorted array.
        for(int i=0; i<N; i++){
            if((i==0 || A.get(i)!=A.get(i-1)) && i==A.get(i)){
                count++;
                if(i<N-1 && A.get(i)==A.get(i+1)){
                    // logic for including the repetitive elements in the count if the first occurrence of that element is a noble integer.
                    j=i;
                    while(j<N-1 && A.get(j)==A.get(j+1)){
                        count++;
                        j++;
                    }
                    i=j;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<>();

        //int[] a = {-3, 0, 2, 2, 5, 5, 5, 5, 8, 8, 10, 10, 10, 14};
        int[] a = {13, 8, 5, 10, 5, 2, 0, -3, 2, 10, 5, 8, 5, 10};
        int N = a.length;

        for(int i=0; i<N; i++){
            A.add(a[i]);
        }
        int ans = BruteforcecountNobleIntegers(A);
        System.out.println("Bruteforce Method T.C: O(N^2): "+ans);
        int count = countNobleIntegers(A);
        System.out.println("Method with T.C: O(NlogN): " +count);
    }
}
