package AdvancePatternProblems;

public class DiamondPattern {
    /*
       Problem Statement:
          Print the following Pattern (Diamond Pattern)
              1 2 3 * 1 2 3 
              1 2 * * * 1 2
              1 * * * * * 1
              * * * * * * *
              * * * * * * *
              1 * * * * * 1
              1 2 * * * 1 2
              1 2 3 * 1 2 3           
          Number of rows = 4
          Numbers here mentioned are the spaces, do not print them.
          Print only star pattern.
          
          Output obtained from terminal:
                    * 
                  * * *
                * * * * *
              * * * * * * *
              * * * * * * *
                * * * * *
                  * * *
                    *
    */
    public static void main(String[] args){
        int n=4;

        // Printing the first half rows (Outer loop)
        for(int i=1; i<=n; i++){
            // Print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // // Print first half pattern
            // for(int j=1; j<=i; j++){
            //     System.out.print("* ");
            // }
            // // Print second half pattern
            // for(int j=1; j<i; j++){
            //     System.out.print("* ");
            // }
            
            // Printing all stars for each row
            for(int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Printing next half in reverse order
        for(int i=n; i>=1; i--){
            // Print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // // Print first half pattern
            // for(int j=1; j<=i; j++){
            //     System.out.print("* ");
            // }
            // // Print second half pattern
            // for(int j=1; j<i; j++){
            //     System.out.print("* ");
            // }

            // Printing all stars for each row
            for(int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
