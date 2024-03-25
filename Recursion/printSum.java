package Recursion;

public class printSum {

    public static void printSumN(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;    
        printSumN(i+1, n, sum);
        System.out.println(i);  // optional
    }
    public static void main(String[] args){
        int n = 5;

        System.out.print("Sum of N natural Numbers: ");
        printSumN(1, n, 0);
    }
}
