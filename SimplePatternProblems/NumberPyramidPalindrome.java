package SimplePatternProblems;

public class NumberPyramidPalindrome {
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
        int n = 5;

        // Outer loop reading number of rows
        for(int i=1; i<=n; i++){
            // Inner loop for inverted pyramid spaces.
            for(int j=1; j<=n-i; j++){  
                System.out.print("  ");
            }
            // Inner loop for printing first half numbers
            for(int j=n-i+1, k=i; j<=n; j++, k--){
                System.out.print(k+" ");
            }
            // Inner loop for printing next half numbers
            for(int j=n+1, k=2; j<=n+i-1; j++, k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
