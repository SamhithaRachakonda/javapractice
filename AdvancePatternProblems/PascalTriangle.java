package AdvancePatternProblems;

public class PascalTriangle {
    /*
       Problem Statement:
          Print the following Pattern (Number Pyramid)
            * * * * 1 * * * * 
            * * * 1 * 1 * * *
            * * 1 * 2 * 1 * * 
            * 1 * 3 * 3 * 1 *
            1 * 4 * 6 * 4 * 1
          Number of rows = 5
          Stars here mentioned are the spaces, do not print them.
          Print only number pattern.
          
          Output obtained from terminal:
                    
    */

    public static void main(String[] args){
        int n=5;

        // Reading 1 to n rows
        for(int i=1; i<=n; i++){
            // Print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // Print pyramid
            for(int j=1; j<=i; j++){
                if(j==1 || j==i)
                    System.out.print("1   ");
                else{
                    System.out.print("");
                }
            }
        }
    }
}
