package SimplePatternProblems;

public class InvertedHalf180 {
    /*
       Problem Statement:
          Print the following Pattern (Inverted Half Pyramid Rotated by 180 deg)
                      *     -> 3 space + 1 star [n-1 space + 1 star]
                    * *     -> 2 space + 2 star [n-2 space + 2 star]
                  * * *     -> 1 space + 3 stars
                * * * *     -> 0 space + 4 stars [0 space + n star]
            Number of rows = 4
    */
    public static void main(String[] args){
        int n = 4;

        // Number of space + Number of stars = Total Number of rows
        // Number of space = n - i, where i = Number of stars
        
        // Outer loop for reading rows.
        for(int i=1; i<=n; i++){
            // Inner loop for printing spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // Inner loop for printing stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
