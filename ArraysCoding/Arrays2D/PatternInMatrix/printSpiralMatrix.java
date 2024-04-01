package ArraysCoding.Arrays2D.PatternInMatrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class printSpiralMatrix {
    /*
     * Problem Statement:
     * Given an n*m matrix 'a', return all elements of the matrix in spiral order
     * 
     * Ex- 
     * Given Matrix:
     *  1 2 3
     *  4 5 6
     *  7 8 9
     * Traverse elements in spiral order:
     *  1 2 3 6 9 8 7 4 5   --> Prints the elements in spiral traversal order
     * 
     * Ex- 
     * 1  2  3  4  5
     * 6  7  8  9  10
     * 11 12 13 14 15
     * 16 17 18 19 20
     * 21 22 23 24 25
     * Output spiral traversal order:
     * 1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 7 8 9 14 19 18 17 12 13
     * 
     * Takeaways:
     * Check the < and > symbols and use appropriately
     * Use ++ and -- after checking where it is necessary
     */
    static void printArray(int[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    static void printSpiralOrder(int[][] a, int r, int c){
        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
        int totalElements = 0;

        while(totalElements < r*c){
            for(int j=leftCol; j<= rightCol && totalElements < r*c; j++){
                System.out.print(a[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

            for(int i=topRow; i<=bottomRow && totalElements < r*c; i++){
                System.out.print(a[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            for(int j=rightCol; j>=leftCol && totalElements < r*c; j--){
                System.out.print(a[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;

            for(int i=bottomRow; i>=topRow && totalElements < r*c; i--){
                System.out.print(a[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }

    static List<Integer> spiralOrdermethod2(int[][] a, int r, int c){
        ArrayList<Integer> result = new ArrayList<>();
        int top = 0, bottom = r-1, left = 0, right = c-1;

        while(top <= bottom && left <= right){
            for(int j=left; j<= right; j++){
                result.add(a[top][j]);
            }
            top++;

            for(int i=top; i<=bottom; i++){
                result.add(a[i][right]);
            }
            right--;

            if( !(top <= bottom && left <= right)  ){
                break;
            }

            for(int j=right; j>=left; j--){
                result.add(a[bottom][j]);
            }
            bottom--;

            for(int i=bottom; i>=top; i--){
                result.add(a[i][left]);
            }
            left++;
        }
        return result;
    }

    static void printSpiralOrder2(int[][] a, int r, int c){
        int a1=r, a2=c;
        int i=0, j=0;

        while(a1>1 || a2>1){
            for(int it=1; it<a2; it++){
                System.out.print(a[i][j]+ " ");
                j++;
            }
            for(int it=1; it<a1; it++){
                System.out.print(a[i][j]+ " ");
                i++;
            }
            for(int it=1; it<a2; it++){
                System.out.print(a[i][j]+ " ");
                j--;
            }
            for(int it=1; it<a1; it++){
                System.out.print(a[i][j]+ " ");
                i--;
            }
            i++; j++;
            a1 -= 2; a2 -= 2;
        }
        if(a1==1 && a2==1){
            System.out.print(a[i][j]);
        }
    }

    static ArrayList<Integer> spiralOrderarraylist(ArrayList<ArrayList<Integer>> A, int r, int c){
        ArrayList<Integer> spiral = new ArrayList<>();

        int a1=r, a2=c;
        int i=0, j=0;

        while(a1>1 || a2>1){
            for(int it=1; it<a2; it++){
                spiral.add(A.get(i).get(j));
                j++;
            }
            for(int it=1; it<a1; it++){
                spiral.add(A.get(i).get(j));
                i++;
            }
            for(int it=1; it<a2; it++){
                spiral.add(A.get(i).get(j));
                j--;
            }
            for(int it=1; it<a1; it++){
                spiral.add(A.get(i).get(j));
                i--;
            }
            i++; j++;
            a1 -= 2; a2 -= 2;
        }
        if(a1==1 && a2==1){
            spiral.add(A.get(i).get(j));
        }

        return spiral;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rows and columns of first matrix");
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] a = new int[r][c];
        System.out.println("Enter first matrix values: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                a[i][j] = scan.nextInt();
            }
        }
        scan.close();

        System.out.println("Given Matrix:");
        printArray(a);

        System.out.println("Spiral Order:");
        printSpiralOrder(a, r, c);
        System.out.println();

        System.out.println("Spiral Order method 2:");
        System.out.println(spiralOrdermethod2(a, r, c));

        System.out.println("Spiral order 2: ");
        printSpiralOrder2(a, r, c);
        System.out.println();

        System.out.println("Spiral order with arraylist: ");
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        for(int i=0; i<r; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<c; j++){
                temp.add(a[i][j]);
            }
            A.add(temp);
        }
        System.out.println(spiralOrderarraylist(A, r, c));
    } 
}
