package Recursion;

public class calcFactorial {

    public static int calcfactorial(int n){
        if (n == 1 || n == 0){
            return 1; 
        }    
        int fact_nm1 = calcfactorial(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }
    public static void main(String[] args){
        int n=0;

        System.out.print("Factorial of n numbers: ");
        int factorial = calcfactorial(n);
        System.out.println(factorial);
    }
}
