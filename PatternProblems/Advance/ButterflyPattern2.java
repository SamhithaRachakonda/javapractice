package PatternProblems.Advance;

public class ButterflyPattern2 {
    public static void main(String[] args){
        int n=4;

        // first half
        for(int i=1; i<=n; i++){
            //half pyramid
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            // Printing spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            // reverse pyramid
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // second half - same as above but rows reading from n to 1
        for(int i=n; i>=1; i--){
            //half pyramid
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            // Printing spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            // reverse pyramid
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
