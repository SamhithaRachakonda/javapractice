package PatternProblems.Simple;

public class HalfPyramid {
    /*
       Problem Statement:
          Print the following Pattern (Half Pyramid)
                *  
                * *      
                * * *     
                * * * * 
            Number of rows = 4
    */
    public static void main(String[] args){
        int n = 4;

        // Nested loop
        // The number of stars in a row = that particular row number
        //      So, Upper bound of columns limited to 'i'
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
