package ArraysCoding.Arrays2D.MatrixOperations;
import java.util.Scanner;

public class Addition2D {
    /*
     *Matrix Addition: 2D
     *  Only matrices with same dimension => Addition is possible. => r1 == r2,  c1 == c2
     * 
     * Ex -    A            B               C
     *     | 2   3 |    | 1   2 |       | 3   5 |
     *     | 4   5 |  + | 3   4 |   =   | 7   9 | 
     *   =>    A      +     B       =       C
     *       where A and B are two 2D matrices given.
     */
    static void printArray(int[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Wrong Input - Addition Not Possible");
            return;
        }

        int[][] sum = new int[r1][c1];
        for(int i=0; i<r1; i++){    // row
            for(int j=0; j<c1; j++){ // column
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Addition Matrix:");
        printArray(sum);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rows and columns of first matrix");
        int r1 = scan.nextInt();
        int c1 = scan.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter first matrix values: ");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                a[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter rows and columns of second matrix");
        int r2 = scan.nextInt();
        int c2 = scan.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter second matrix values: ");
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                b[i][j] = scan.nextInt();
            }
        }
        scan.close();

        System.out.println("First Matrix:");
        printArray(a);
        System.out.println("Second Matrix:");
        printArray(b);

        add(a, r1, c1, b, r2, c2);
    }  
}