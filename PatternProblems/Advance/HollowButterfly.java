package PatternProblems.Advance;

public class HollowButterfly {
    /*
       Problem Statement:
          Print the following Pattern (Butterfly Pattern)
                *             *
                * *         * *
                *   *     *   *
                *     * *     *
                *     * *     *
                *   *     *   *
                * *         * *
                *             *
            Given, Number of rows = 4
    */
    public static void main(String[] args){
        int n=4;

        // First half of Hollow Butterfly
        for(int i=1; i<=n; i++){
            // first half hollow pyramid
            for(int j=1; j<=i; j++){
                if(j==1 || j==i){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            // printing spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            // Printing inverted hollow pyramid
            for(int j=1; j<=i; j++){
                if(j==1 || j==i){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Printing second half of hollow butterfly in reverse order n to 1
        for(int i=n; i>=1; i--){
            // first half hollow pyramid
            for(int j=1; j<=i; j++){
                if(j==1 || j==i){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            // printing spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            // Printing inverted hollow pyramid
            for(int j=1; j<=i; j++){
                if(j==1 || j==i){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
