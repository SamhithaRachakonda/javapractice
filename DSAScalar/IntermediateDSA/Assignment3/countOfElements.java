import java.util.ArrayList;
import java.util.Scanner;

public class countOfElements {
    /*
     * Q4. Count of elements
     * Problem Description:
     *  Given an array A of N integers. 
     * Count the number of elements that have at least 1 elements greater than itself.
     *      => Only max element in an array doesnot have the greater element than itself.
     *      => Find the number of occurrences of max element and find the difference from the total size of an array.
     * 
     * Problem Constraints:
     *  1 <= N <= 10^5
     *  1 <= A[i] <= 10^9
     * 
     * Ex1:  A = [3, 1, 2]       => Output: 2
     * Ex2:  A = [5, 5, 3]       => Output: 1
     * Example Explanation for Ex1:
     * The elements that have at least 1 element greater than itself are 1 and 2
     */
    static int CountOfElements(ArrayList<Integer> A){
        int max = Integer.MIN_VALUE;
        int N = A.size();
        int count = 0;

        for(int num : A){
            if(num > max)
                max = num;
        }
        for(int num : A){
            if(num == max)
                count++;
        }
        int countofelements = N - count;
        return countofelements;
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
        int countofelements = CountOfElements(A);
        System.out.println("The elements that have atleast 1 element greater than itself is: "+ countofelements);
    }
}