package PatternProblems.Simple;

public class FloydTriangle {
    /*
       Problem Statement:
          Print the following Pattern (Floyd's Triangle)
                1  
                2  3      
                4  5  6     
                7  8  9  10
                11 12 13 14 15 
            Number of rows = 5
    */
    public static void main(String[] args){
        int n = 5;
        int count = 0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}
