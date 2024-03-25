import java.util.ArrayList;
import java.util.Scanner;

public class EqualityOftime {
    /*
     * Q2. Time to equality
     * Problem Description:
     *  Given an integer array A of size N. In one second, you can increase the value of one element by 1.
     * Find the minimum time in seconds to make all elements of the array equal.
     * 
     * Problem Constraints:
     *  1 <= N <= 10^6
     *  1 <= A[i] <= 10^3
     * 
     * Ex:  A = [2, 4, 1, 3, 2]       => Output: 8
     * Example Explanation:
     * We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
     */
    static int Equality(ArrayList<Integer> A){
        int max = Integer.MIN_VALUE;
        int N = A.size();
        int sum = 0;

        for(int num : A){
            if(num > max)
                max = num;
            sum += num;
        }
        int equality = (N*max) - sum;
        return equality;
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
        int equality = Equality(A);
        System.out.println("The min time for all elements to be equal is: "+ equality);
    }
}
