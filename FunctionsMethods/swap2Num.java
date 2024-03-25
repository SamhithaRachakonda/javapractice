package FunctionsMethods;

public class swap2Num {
    /*
     * Problem Statement:
     * Given two numbers a and b, Swap those two numbers.
     * 
     * Ex: a = 9, b = 3
     * Output: a = 3, b = 9
     */
    static void swapusingtemp(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Values after swapping using temp variable: ");
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
    }

    static void swapsumdiff(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Values after swapping using sum diff method: ");
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
    }

    public static void main(String[] args){
        int a = 9;
        int b = 3;
        
        System.out.println("Original values before swap");
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);

        swapusingtemp(a, b);
        swapsumdiff(a, b);
    }
}
