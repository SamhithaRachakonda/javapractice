package DSAScalar.Assignment4;
import java.util.Scanner;
import java.util.ArrayList;

public class InplacePrefixSum {
    /*
     * Q7. In-place Prefix Sum
     * Problem Description:
     * Given an array A of N integers. Construct prefix sum of the array in the given array itself.
     * Inplace prefix sum is getting the value of prefix sum for index i and placing it in the original array at index i.
     * Problem Constraints:
     *  1 <= N <= 10^5
     *  1 <= A[i] <= 10^3
     * 
     * Ex1: A = [1, 2, 3, 4, 5]     => Output: [1, 3, 6, 10, 15]
     * Ex2: A = [4, 3, 2]           => Output: [4, 7, 9]
     */
    static ArrayList<Integer> InPlacePrefixSum(ArrayList<Integer> A){
        int N = A.size();

        // Calculating prefix sum and updating in A
        for(int i=1; i<N; i++){
            A.set(i, A.get(i-1)+A.get(i));
        }
        return A;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = scan.nextInt();

        ArrayList<Integer> A = new ArrayList<Integer>();
        for(int i=0; i<N; i++){
            A.add(scan.nextInt());
        }
        scan.close();
        
        System.out.println("Original Array: ");
        System.out.println(A);
        InPlacePrefixSum(A);
        System.out.println("Array after updating Prefix sum: ");
        System.out.println(A);
    }
}
