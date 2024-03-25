package Recursion;

public class fibonacciSeq {
    public static void fibonacciseq(int a, int b, int n){
        if(n==0)
            return;
        
        int c = a + b;
        System.out.println(c);
        fibonacciseq(b, c, n-1);
    }

    public static void main(String[] args){
        int n = 2;
        int a = 0, b = 1;

        System.out.println("Fibonacci Sequence of first n numbers: ");
        System.out.println(a);
        System.out.println(b);
        fibonacciseq(a, b, n-2);
    }
}
