import java.util.ArrayList;
import java.util.Scanner;

public class rotationArray {
    /*
     * Q3. Array Rotation
     * Problem Description:
     *  Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.
     * 
     * Problem Constraints:
     *  1 <= N <= 10^5
     *  1 <= A[i] <= 10^9
     *  0 <= B < 10^9
     * 
     * Ex:  A = [1, 2, 3, 4]
     *      B = 2              => Output: [3, 4, 1, 2]
     * Ex:  A = [2, 5, 6]
     *      B = 1              => Output: [6, 2, 5]
     */
    static void swap(ArrayList<Integer> A, int i, int j){
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }
    static void ReverseInRange(ArrayList<Integer> A, int i, int j){
        while(i<j){
            swap(A, i, j);
            i++;
            j--;
        }
    }
    static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int N, int B){
        B = B%N;
        ReverseInRange(A, 0, N-B-1);
        ReverseInRange(A, N-B, N-1);
        ReverseInRange(A, 0, N-1);
        
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

        System.out.println("Enter the number of times array to be rotated: ");
        int B = scan.nextInt();
        scan.close();

        System.out.println("Input Array: "+ A);
        ArrayList<Integer> rotateArray = rotateArray(A, N, B);
        System.out.println("Array after "+B+" rotations is: "+ rotateArray);
    }
}
