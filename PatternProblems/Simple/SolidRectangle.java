package PatternProblems.Simple;

public class SolidRectangle {
    /*
       Problem Statement:
          Print the following Pattern (Solid Rectangle)
                * * * * *
                * * * * *
                * * * * *
                * * * * *
            Number of rows = 4
            Number of columns = 5
    */
    public static void main(String[] args){
        int n = 4;
        int m = 5;
        // Nested loop
        // Print the stars at all indexes of rows and cloumns.
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}