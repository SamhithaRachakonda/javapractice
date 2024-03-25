package FunctionsMethods;

import java.util.Scanner;

public class Mul2Num {
    public static int calculateProduct(int a, int b){  
        return a*b;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        int product = calculateProduct(a,b);
        System.out.println("Product of 2 numbers is: " + product);
    }
}
