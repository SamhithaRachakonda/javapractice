package PatternProblems.Simple;

public class Triangle01 {
    /*
       Problem Statement:
          Print the following Pattern (0-1 Triangle)
                1  
                0  1      
                1  0  1     
                0  1  0  1
                1  0  1  0  1 
            Number of rows = 5
    */
    public static void main(String[] args){
        int n = 5;

        // i+j = even number then print 1, 
        // i+j = odd number then print 0
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum%2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
