package PatternProblems.Advance;

public class HollowRhombus {
    /*
       Problem Statement:
          Print the following Pattern of stars (Solid Rhombus)
                1 2 3 4 * * * * *      
                1 2 3 *       *     
                1 2 *       *    
                1 *       *
                * * * * *
            Number of rows = 5
            1 2 3 4 - numbers mentioned are spaces for understanding, do not print the numbers. Print only stars.

            Output obtained from terminal:
                    * * * * * 
                  *       * 
                *       * 
              *       *
            * * * * *
    */

    public static void main(String[] args){
        int n=5;

        // Reading the number of rows 1 to n
        for(int i=1; i<=n; i++){
            // Print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // Print hollow rhombus
            for(int j=1; j<=n; j++){
                if(j==1 || j==n || i==1 || i==n){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
