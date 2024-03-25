package Recursion;

public class printNumbers {
    // Printing 5 to 1 using for loop
    public static void printNumbersLoop(int n){
        for(int i=n; i>0; i--)
            System.out.println(i);
    }

    public static void printNumbersRecursion(int n){
        if(n==0)
            return;
            
        System.out.println(n);
        printNumbersRecursion(n-1);
    }

    public static void printNumbersIncRecursion(int n){
        if(n==0)
            return;
            
        printNumbersIncRecursion(n-1);
        System.out.println(n);
    }

    public static void main(String[] args){
        int n=5;

        System.out.println("Printing with for loop:");
        printNumbersLoop(n);

        System.out.println("Printing with Recursion:");
        printNumbersRecursion(n);

        System.out.println("Printing Increasing Order Num with Recursion:");
        printNumbersIncRecursion(n);
    }
}
