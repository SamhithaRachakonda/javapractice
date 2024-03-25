import java.util.ArrayList;
import java.util.Scanner;

public class Occurrence {
    /*
     * Q1. Linear Search - Multiple Occurences
     * Problem Description:
     *  Given an array A and an integer B, find the number of occurrences of B in A.
     * 
     * Problem Constraints:
     *  1 <= B,Ai <= 10^9
     *  1 <= length(A) <= 10^5
     * 
     * Ex:  A = [1, 2, 2], B=2        => Output: 2
     * Ex:  A = [1, 2, 1], B=3      => Output: 3
     */
    static int OccurrenceofB(ArrayList<Integer> A, int B){
        int count = 0;

        for(int num : A){
            if(num == B)
                count++;
        }

        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int N = scan.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<N; i++){
            A.add(scan.nextInt());
        }
        System.out.println("Enter the integer to find the frequency of: ");
        int B = scan.nextInt();
        scan.close();

        System.out.println("Input Array: "+ A);
        int occurrence = OccurrenceofB(A, B);
        System.out.println("The occurrence of the integer "+ B+" is: "+ occurrence);
    }
}
