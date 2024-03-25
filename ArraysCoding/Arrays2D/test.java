package ArraysCoding.Arrays2D;

import java.util.Scanner;

public class test {
    static void printArray(int[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    static int[][] multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        int[][] ans = new int[r1][c2];
        if(r2 != c1){
            System.out.println("Wrong Dimension - Multiplication not possible");
            return ans;
        }
        
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<c1; k++){
                    ans[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        
        return ans;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int r1 = scan.nextInt();  // first matrix rows
        int c1 = scan.nextInt();  // first matrix columns
        int[][] a = new int[r1][c1];
        for(int i=0; i<r1; i++){   // assigning values to array
            for(int j=0; j<c1; j++){
                a[i][j] = scan.nextInt();
            }
        }
        
        int r2 = scan.nextInt();  // second matrix rows
        int c2 = scan.nextInt();  // second matrix columns
        int[][] b = new int[r2][c2];
        for(int i=0; i<r2; i++){   // assigning values to array
            for(int j=0; j<c2; j++){
                b[i][j] = scan.nextInt();
            }
        }
        
        scan.close();
        
        System.out.println("First Matrix: ");
        printArray(a);
        System.out.println("Second Matrix: ");
        printArray(b);
        
        int[][] ans = multiply(a, r1, c1, b, r2, c2);
        System.out.println("Matrix Multiplication:");
        printArray(ans);
        
    }
}
