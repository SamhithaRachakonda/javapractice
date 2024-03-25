package PatternProblems.Simple;

public class InvertedHalfPyramid {
     /*
       Problem Statement:
          Print the following Pattern (Inverted Half Pyramid)
                * * * * 
                * * *  
                * *  
                * 
            Number of rows = 4
    */
    public static void main(String[] args){
        int n = 4;

    // Nested loop
    // The number of stars in a row = Total number of rows - that particular row number + 1
    //      So, Upper bound of columns limited to 'n-i+1'
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    // Another method: Just reading rows from n to 1 and decrement.
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
