import java.util.ArrayList;
import java.util.Scanner;

public class SecondLargest {
    /*
     * Q5. Second Largest
     * Problem Description:
     *  You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.
     * 
     * Problem Constraints:
     *  1 <= N <= 10^5
     *  0 <= A[i] <= 10^9
     * 
     * Ex1:  A = [2, 1, 2]       => Output: 1
     * Ex2:  A = [2]             => Output: -1
     * Example Explanation for Ex1:
     * First largest element = 2
     * Second largest element = 1
     * Example Explanation for Ex2:
     * There is no second largest element in the array.
     */
    static int secondLargest(ArrayList<Integer> A){
        int max = Integer.MIN_VALUE;

        for(int num : A){
            if(num > max)
                max = num;
        }
        int secondLargest = -1;
        for(int num : A){
            if(num != max && secondLargest < num)
                secondLargest = num;
        }
        
        return secondLargest;
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
        int secondLargest = secondLargest(A);
        System.out.println("The second largest of given array: "+ secondLargest);
    }
}
