package SimplePatternProblems;

public class HalfPyramidNumber {
     /*
       Problem Statement:
          Print the following Pattern (Half Pyramid with Numbers)
                1  
                1 2      
                1 2 3     
                1 2 3 4
                1 2 3 4 5 
            Number of rows = 5
    */
    public static void main(String[] args){
        int n = 5;

        // Nested loop
        // The number of numbers printed in a row = that particular row number
        //      So, Upper bound of columns limited to 'i'
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
