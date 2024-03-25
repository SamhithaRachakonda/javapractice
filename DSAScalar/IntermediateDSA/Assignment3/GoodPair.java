import java.util.ArrayList;
import java.util.Scanner;

public class GoodPair {
    /*
     * Q1. Good Pair
     * Problem Description:
     *  Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
     * 
     * Problem Constraints:
     *  1 <= A.size() <= 10^4 
     *  1 <= B <= 10^9
     *  1 <= A[i] <= 10^9
     * 
     * Ex:  A = [1,2,3,4], B = 7         => Output: 1
     * Ex:  A = [1,2,4], B = 4           => Output: 0
     * Ex:  A = [1,2,2], B = 4           => Output: 1
     */
    static int goodPair(ArrayList<Integer> A, int N, int B){
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                if(A.get(i) + A.get(j) == B)
                    return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int N = scan.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<N; i++){
            A.add(scan.nextInt());
        }

        System.out.println("Enter Good pair number B:");
        int B = scan.nextInt();
        scan.close();

        System.out.println("Input Array: "+ A);
        int count = goodPair(A, N, B);
        System.out.println("Does good pair exists in an array: "+ count);
    }
}
