import java.util.ArrayList;
import java.util.Scanner;

public class MinMax {
    /*
     * Q5. Max Min of an Array
     * Problem Description:
     *  Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
     * 
     * Problem Constraints:
     *  1 <= N <= 10^5
     *  -10^9 <= A[i] <= 10^9
     * 
     * Ex:  A = [-2, 1, -4, 5, 3]        => Output: 1
     * Ex:  A = [1, 3, 4, 1]             => Output: 5
     */
    static int MinMaxArray(ArrayList<Integer> A, int N){
        int min = A.get(0);
        int max = A.get(0);

        for(int i=0; i<N; i++){
            if(min > A.get(i))
                min = A.get(i);
            if(max < A.get(i))
                max = A.get(i);
        }  
        return min+max;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int N = scan.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<N; i++){
            A.add(scan.nextInt());
        }
        scan.close();

        System.out.println("Input Array: "+ A);
        int sumMinMax = MinMaxArray(A, N);
        System.out.println("Min and max elements sum of an array is: "+ sumMinMax);
    }
}
