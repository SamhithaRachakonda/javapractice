package DSAScalar.Assignment7;

import java.util.ArrayList;
import java.util.Scanner;

public class rotateMatrix {
    /*
     * Q5. Rotate Matrix
     * Problem Description:
     * You are given a n x n 2D matrix A representing an image.
     * Rotate the image by 90 degrees (clockwise).
     * You need to do this in place.
     * 
     * Note: If you end up using an additional array, you will only receive partial score.
     * 
     * Problem Constraints
     * 1 <= n <= 10^3
     * 
     * Ex: [1 2 3]
     *     [4 5 6]
     *     [7 8 9]
     * Output: [7 4 1]
     *         [8 5 2]
     *         [9 6 3]
     * 
     * Explanation:
     *  After rotating the matrix by 90 degree:
     * 1 goes to 3, 3 goes to 9
     * 2 goes to 6, 6 goes to 8
     * 9 goes to 7, 7 goes to 1
     * 8 goes to 4, 4 goes to 2
     * 
     */
    static void reverserow(ArrayList<Integer> A){
        int N = A.size();
        int temp;
        int i=0, j=N-1;
        while(i<j){
            temp = A.get(i);
            A.set(i, A.get(j));
            A.set(j, temp);
            i++;
            j--;
        }
    }

    static void RotateMatrix(ArrayList<ArrayList<Integer>> A){
        int N = A.size();
        int temp;
        // Rotate Matrix = Transpose + Reverse of each row
        // Transpose matrix Inplace.
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                temp = A.get(i).get(j);
                A.get(i).set(j, A.get(j).get(i));
                A.get(j).set(i, temp);
            }
        }
        // Reverse of each row
        for(int i=0; i<N; i++){
            reverserow(A.get(i));
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        for(int i=0; i<N; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<N; j++){
                temp.add(scan.nextInt());
            }
            A.add(temp);
        }
        scan.close();

        System.out.println("Input: \n"+A);
        RotateMatrix(A);
        System.out.println("After rotating A by 90 degrees: \n"+A);
    }
}
