package SimplePatternProblems;

public class HollowRectangle {
    /*
       Problem Statement:
          Print the following Pattern (Hollow Rectangle)
                * * * * *
                *       *
                *       *
                * * * * *
            Number of rows = 4
            Number of columns = 5
    */
    public static void main(String[] args){
        int n = 4;
        int m = 5;
        // Nested loop
        // Print the stars, 
        //      when rows index is lower bound (i=1) or upper bound (i=n)
        //      when column index is lower bound (j=1) or upper bound (j=m)
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i == 1 || i == n || j == 1 || j == m)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }    
}
