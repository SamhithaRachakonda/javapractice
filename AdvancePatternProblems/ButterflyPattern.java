package AdvancePatternProblems;

public class ButterflyPattern {
    /*
       Problem Statement:
          Print the following Pattern (Butterfly Pattern)
                *             *
                * *         * *
                * * *     * * *
                * * * * * * * *
                * * * * * * * *
                * * *     * * *
                * *         * *
                *             *
            Given, Number of rows = 4
    */
    public static void main(String[] args){
        int n = 8;

        // Printing the first half pattern till n
        for(int i=1; i<=n; i++){
            // Printing the first pattern (half pyramid)
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            // Print the spaces in between till n columns
            for(int j=i+1; j<=n; j++){
                System.out.print("  ");
            }
            // Print the spaces in between from n+1 to before the pattern
            for(int j=n+1; j<=2*n-i; j++){
                System.out.print("  ");
            }
            // Printing the reverse pattern (Reverse half pyramid)
            for(int j=2*n-i+1; j<=2*n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Printing the second half pattern from n+1 to 2*n
        for(int i=n+1; i<=2*n; i++){
            // Printing the first pattern (inverted half pyramid)
            for(int j=1; j<=2*n-i+1; j++){
                System.out.print("* ");
            }
            // Printing the first half spaces
            for(int j=2*n-i+2; j<=n; j++){
                System.out.print("  ");
            }
            // Printing next half spaces
            for(int j=n+1; j<i; j++){
                System.out.print("  ");
            }
            // Printing inverted rotated pyramid pattern
            for(int j=i; j<=2*n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}