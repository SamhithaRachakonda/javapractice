package ArraysCoding.Arrays2D;
import java.util.Scanner;

public class Intro2D {
    /*
     * Multidimentional Array:
     *  data_type[1D][2D][]...[ND] array_name = new data_type[size1][size2]...[sizeN];
     * 
     * 1D array of int -> array of integers
     * Multi-dimentional array -> Array of arrays
     * 
     * Ex - a = {{5, 6, 7}, {8, 9, 10, 11}, {12, 13, 14, 15}, {16, 17, 18}} => 2D array
     * To access a 2D array: a[2][3].
     *      2 --> Row
     *      3 --> Column
     * Jagged arrays in 2D --> different column lengths for every row.
     * ******* Total number of elements in 2D array = n*m 
     *          (n = number of rows, 
     *           m= number of columns)
     * 
     * Ex - a = {{{1, 2,3}, {4,5,6}, {7, 7,8}}, {{}, {}, {}}, {{}, {}, {}}} => 3D Array
     * To access an element: a[2][1][3]
     *  3 --> Innermost elemental array index
     *  1 --> Middle layer consisting of 1D arrays
     *  2 --> Outer Array consisting of chunks of 2D arrays
     */
    static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){     // Rows
            for(int j=0; j<arr[i].length; j++){     // Columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        // initialize 1D array:
        // int[] a1d = new int[5];

        // initialize 2D array:
        // int[][] a2d = new int[6][]; // (No need to give column number but row number is mandatory.)

        // Initialize 2D array example:
        int[][] arr = new int[2][3];
        // Assining Values:
        arr[0][0] = 1;
        arr[0][1] = 2;

        // method 2: Direct initialize and assign with values.
        int[][] a = {{1, 2, 3}, 
                     {4, 5, 6}, 
                     {7, 8, 9}
                    };

        // printing the assigned array
        printArray(a);

        // Takinginputs from Scanner and printing results
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of rows for 2D array:");
        int r = scan.nextInt();
        System.out.println("Enter number of columns for 2D array");
        int c = scan.nextInt();
        // Initialize 2D array:
        int[][] a1 = new int[r][c];  // 'c' value is not mandatory.
        // Assign Values:
        System.out.println("Enter "+ r*c + " Elements: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                a1[i][j] = scan.nextInt();
            }
        }
        // printing values:
        printArray(a1);    
        scan.close();   
    }
    /*
     * Why Multidimensional Arrays?
     * Graphs -- 2D
     * Grids
     * Certain kind of information (Ex - Calender, Google sheets)
     * ** Fast and Easy access of information using 2D arrays
     * ** Updates of elements is fast.
     */
}
