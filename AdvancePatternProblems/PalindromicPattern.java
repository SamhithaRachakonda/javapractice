package AdvancePatternProblems;

public class PalindromicPattern {
    /*
       Problem Statement:
          Print the following Pattern (Number Pyramid)
            * * * * 1 * * * * 
            * * * 2 1 2 * * *
            * * 3 2 1 2 3 * * 
            * 4 3 2 1 2 3 4 *
            5 4 3 2 1 2 3 4 5
          Number of rows = 5
          Stars here mentioned are the spaces, do not print them.
          Print only number pattern.
          
          Output obtained from terminal:
                    1   
                  2 1 2
                3 2 1 2 3
              4 3 2 1 2 3 4
            5 4 3 2 1 2 3 4 5
    */
    public static void main(String[] args){
        int n=5;

        for(int i=1; i<=n; i++){
            // Print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // Print first half numbers
            for(int j=i; j>0; j--){
                System.out.print(j+" ");
            }
            // Print second half numbwers
            for(int j=2; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
