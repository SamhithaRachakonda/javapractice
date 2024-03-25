package AdvancePatternProblems;

public class SolidRhombus {
    /*
       Problem Statement:
          Print the following Pattern of stars (Solid Rhombus)
                1 2 3 4 * * * * *      
                1 2 3 * * * * *     
                1 2 * * * * *    
                1 * * * * *
                * * * * *
            Number of rows = 5
            1 2 3 4 - numbers mentioned are spaces for understanding, do not print the numbers. Print only stars.
    */
    public static void main(String[] args){
        int n=5;

        for(int i=1; i<=5; i++){
            // Print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // Print stars
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
