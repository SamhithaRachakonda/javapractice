package PatternProblems.Advance;

public class InvertedHalfPyramidNum {
    /*
       Problem Statement:
          Print the following Pattern (Inverted Half Pyramid with Numbers)
                1 1 1 1 1
                2 2 2 2
                3 3 3  
                4 4
                5 
            Number of rows = 5
    */
    
    public static void main(String[] args){
        int n=5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
