import java.util.Scanner;
import java.util.ArrayList;

public class reverseInRange {
    /*
     * Q2. Reverse in a range
     * Problem Description:
     *  Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given inclusive range [B, C].
     * 
     * Problem Constraints:
     *  1 <= N <= 10^5
     *  1 <= A[i] <= 10^9
     *  0 <= B <= C < N-1
     * 
     * Ex:  A = [1, 2, 3, 4]
     *      B = 2, C = 3        => Output: [1, 2, 4, 3]
     * Ex:  A = [2, 5, 6]
     *      B = 0, C = 2       => Output: [2, 4]
     */
    static void swap(ArrayList<Integer> A, int B, int C){
        int temp = A.get(B);
        A.set(B, A.get(C));
        A.set(C, temp);
    }
    
    static ArrayList<Integer> ReverseInRange(ArrayList<Integer> A, int N, int B, int C){
        while(B<C){
            swap(A, B, C);
            B++;
            C--;
        }
        return A;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int N = scan.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<N; i++){
            A.add(scan.nextInt());
        }

        System.out.println("Enter [B, C] inclusive range: ");
        int B = scan.nextInt();
        int C = scan.nextInt();
        scan.close();

        System.out.println("Input Array: "+ A);
        ArrayList<Integer> reverseInRange = ReverseInRange(A, N, B, C);
        System.out.println("Array with elemets reversal in ["+B+", "+C+"] range is: "+ reverseInRange);
    }
}
