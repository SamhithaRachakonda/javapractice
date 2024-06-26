package PatternProblems.Advance;

public class NumberPyramid {
     /*
       Problem Statement:
          Print the following Pattern (Number Pyramid)
            * * * * 1 * * * * 
            * * * 2 * 2 * * *
            * * 3 * 3 * 3 * * 
            * 4 * 4 * 4 * 4 *
            5 * 5 * 5 * 5 * 5
          Number of rows = 5
          Stars here mentioned are the spaces, do not print them.
          Print only number pattern.
          
          Output obtained from terminal:
                    1   
                  2   2
                3   3   3
              4   4   4   4
            5   5   5   5   5
    */
    public static void main(String[] args){
        int n=5;

        for(int i=1; i<=5; i++){
            // Print spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }
            // Print numbers
            for(int j=1; j<=i; j++){
                System.out.print(i+"   ");
            }
            System.out.println();
        }
    }
}
